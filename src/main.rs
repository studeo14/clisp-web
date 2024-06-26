#[macro_use] extern crate rocket;

use htmx::{better_points, gen_data};
use rocket_dyn_templates::{context, Template};

#[get("/")]
fn index() -> Template {
    Template::render("index", context! {
        title: "Rust HTMX"
    })
}

#[get("/data")]
fn data() -> Template {
    Template::render("data", context! {
        width: 1024,
        height: 100,
        points: better_points(gen_data(Some(1024)))
    })
}

#[launch]
fn rocket() -> _ {
    rocket::build().mount("/", routes![index, data])
        .attach(Template::fairing())
}
