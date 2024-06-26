
use std::f64::consts::PI;

use rand::prelude::*;

fn gaussian(mu: f64, sigma: f64) -> [f64; 2] {
    let mut rng = rand::thread_rng();
    let mut u1: f64;
    loop {
        u1 = rng.gen();
        if u1 > 0.0 {
            break;
        }
    }
    let u2: f64 = rng.gen();
    let mag = sigma * (u1.ln() * -2.0).sqrt();
    let z0 = mu + ((2.0 * PI * u2).sin() * mag);
    let z1 = mu + ((2.0 * PI * u2).cos() * mag);
    [z0, z1]
}


pub fn gen_data(length: Option<usize>) -> Vec<f64> {
    (0..(length.unwrap_or(1024)/2))
        .flat_map(|_| gaussian(50.0, 9.0))
        .collect()
}

pub fn better_points(data: Vec<f64>) -> String {
    let mut acc = "M0 0".to_owned();
    data.into_iter()
        .enumerate()
        .for_each(|(ix, val)| acc.push_str(format!("L{} {}", ix, val).as_str()));
    acc
}


#[cfg(test)]
mod tests {
    use crate::*;

    #[test]
    fn test_gaussian() {
        let d = gen_data(Some(10));
        assert!(d.iter().all(|v| !v.is_nan()));
    }
}
