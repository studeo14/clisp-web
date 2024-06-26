# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get htmx could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/htmx/0.1.0"
SRC_URI += "git://git@github.com/studeo14/clisp-web.git;protocol=ssh;nobranch=1"
SRCREV = "83bc6343811abb663a6a92539cbb9fa8b2dccdd8"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+83bc634381"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.22.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aho-corasick/1.1.3 \
    crate://crates.io/android-tzdata/0.1.1 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/async-stream-impl/0.3.5 \
    crate://crates.io/async-stream/0.3.5 \
    crate://crates.io/async-trait/0.1.80 \
    crate://crates.io/atomic/0.5.3 \
    crate://crates.io/atomic/0.6.0 \
    crate://crates.io/autocfg/1.3.0 \
    crate://crates.io/backtrace/0.3.73 \
    crate://crates.io/binascii/0.1.4 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.5.0 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/bstr/1.9.1 \
    crate://crates.io/bumpalo/3.16.0 \
    crate://crates.io/bytemuck/1.16.1 \
    crate://crates.io/bytes/1.6.0 \
    crate://crates.io/cc/1.0.100 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono-tz-build/0.3.0 \
    crate://crates.io/chrono-tz/0.9.0 \
    crate://crates.io/chrono/0.4.38 \
    crate://crates.io/cookie/0.18.1 \
    crate://crates.io/core-foundation-sys/0.8.6 \
    crate://crates.io/cpufeatures/0.2.12 \
    crate://crates.io/crossbeam-channel/0.5.13 \
    crate://crates.io/crossbeam-deque/0.8.5 \
    crate://crates.io/crossbeam-epoch/0.9.18 \
    crate://crates.io/crossbeam-utils/0.8.20 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/deranged/0.3.11 \
    crate://crates.io/deunicode/1.6.0 \
    crate://crates.io/devise/0.4.1 \
    crate://crates.io/devise_codegen/0.4.1 \
    crate://crates.io/devise_core/0.4.1 \
    crate://crates.io/digest/0.10.7 \
    crate://crates.io/either/1.12.0 \
    crate://crates.io/encoding_rs/0.8.34 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/errno/0.3.9 \
    crate://crates.io/fastrand/2.1.0 \
    crate://crates.io/figment/0.10.19 \
    crate://crates.io/filetime/0.2.23 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/fsevent-sys/4.1.0 \
    crate://crates.io/futures-channel/0.3.30 \
    crate://crates.io/futures-core/0.3.30 \
    crate://crates.io/futures-io/0.3.30 \
    crate://crates.io/futures-sink/0.3.30 \
    crate://crates.io/futures-task/0.3.30 \
    crate://crates.io/futures-util/0.3.30 \
    crate://crates.io/futures/0.3.30 \
    crate://crates.io/generator/0.7.5 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getrandom/0.2.15 \
    crate://crates.io/gimli/0.29.0 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/globset/0.4.14 \
    crate://crates.io/globwalk/0.9.1 \
    crate://crates.io/h2/0.3.26 \
    crate://crates.io/handlebars/5.1.2 \
    crate://crates.io/hashbrown/0.14.5 \
    crate://crates.io/hermit-abi/0.3.9 \
    crate://crates.io/http-body/0.4.6 \
    crate://crates.io/http/0.2.12 \
    crate://crates.io/http/1.1.0 \
    crate://crates.io/httparse/1.9.4 \
    crate://crates.io/httpdate/1.0.3 \
    crate://crates.io/humansize/2.1.3 \
    crate://crates.io/hyper/0.14.29 \
    crate://crates.io/iana-time-zone-haiku/0.1.2 \
    crate://crates.io/iana-time-zone/0.1.60 \
    crate://crates.io/ignore/0.4.22 \
    crate://crates.io/indexmap/2.2.6 \
    crate://crates.io/inlinable_string/0.1.15 \
    crate://crates.io/inotify-sys/0.1.5 \
    crate://crates.io/inotify/0.9.6 \
    crate://crates.io/is-terminal/0.4.12 \
    crate://crates.io/itoa/1.0.11 \
    crate://crates.io/js-sys/0.3.69 \
    crate://crates.io/kqueue-sys/1.0.4 \
    crate://crates.io/kqueue/1.0.8 \
    crate://crates.io/lazy_static/1.5.0 \
    crate://crates.io/libc/0.2.155 \
    crate://crates.io/libm/0.2.8 \
    crate://crates.io/linux-raw-sys/0.4.14 \
    crate://crates.io/lock_api/0.4.12 \
    crate://crates.io/log/0.4.21 \
    crate://crates.io/loom/0.5.6 \
    crate://crates.io/matchers/0.1.0 \
    crate://crates.io/memchr/2.7.4 \
    crate://crates.io/memo-map/0.3.2 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/minijinja/2.0.2 \
    crate://crates.io/miniz_oxide/0.7.4 \
    crate://crates.io/mio/0.8.11 \
    crate://crates.io/multer/3.1.0 \
    crate://crates.io/normpath/1.2.0 \
    crate://crates.io/notify/6.1.1 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/num-conv/0.1.0 \
    crate://crates.io/num-traits/0.2.19 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/object/0.36.0 \
    crate://crates.io/once_cell/1.19.0 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/parking_lot/0.12.3 \
    crate://crates.io/parking_lot_core/0.9.10 \
    crate://crates.io/parse-zoneinfo/0.3.1 \
    crate://crates.io/pear/0.2.9 \
    crate://crates.io/pear_codegen/0.2.9 \
    crate://crates.io/percent-encoding/2.3.1 \
    crate://crates.io/pest/2.7.10 \
    crate://crates.io/pest_derive/2.7.10 \
    crate://crates.io/pest_generator/2.7.10 \
    crate://crates.io/pest_meta/2.7.10 \
    crate://crates.io/phf/0.11.2 \
    crate://crates.io/phf_codegen/0.11.2 \
    crate://crates.io/phf_generator/0.11.2 \
    crate://crates.io/phf_shared/0.11.2 \
    crate://crates.io/pin-project-lite/0.2.14 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/powerfmt/0.2.0 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/proc-macro2-diagnostics/0.10.1 \
    crate://crates.io/proc-macro2/1.0.86 \
    crate://crates.io/quote/1.0.36 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/redox_syscall/0.4.1 \
    crate://crates.io/redox_syscall/0.5.2 \
    crate://crates.io/ref-cast-impl/1.0.23 \
    crate://crates.io/ref-cast/1.0.23 \
    crate://crates.io/regex-automata/0.1.10 \
    crate://crates.io/regex-automata/0.4.7 \
    crate://crates.io/regex-syntax/0.6.29 \
    crate://crates.io/regex-syntax/0.8.4 \
    crate://crates.io/regex/1.10.5 \
    crate://crates.io/rocket/0.5.1 \
    crate://crates.io/rocket_codegen/0.5.1 \
    crate://crates.io/rocket_dyn_templates/0.2.0 \
    crate://crates.io/rocket_http/0.5.1 \
    crate://crates.io/rustc-demangle/0.1.24 \
    crate://crates.io/rustix/0.38.34 \
    crate://crates.io/rustversion/1.0.17 \
    crate://crates.io/ryu/1.0.18 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scoped-tls/1.0.1 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/self_cell/1.0.4 \
    crate://crates.io/serde/1.0.203 \
    crate://crates.io/serde_derive/1.0.203 \
    crate://crates.io/serde_json/1.0.117 \
    crate://crates.io/serde_spanned/0.6.6 \
    crate://crates.io/sha2/0.10.8 \
    crate://crates.io/sharded-slab/0.1.7 \
    crate://crates.io/signal-hook-registry/1.4.2 \
    crate://crates.io/siphasher/0.3.11 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/slug/0.1.5 \
    crate://crates.io/smallvec/1.13.2 \
    crate://crates.io/socket2/0.5.7 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/stable-pattern/0.1.0 \
    crate://crates.io/state/0.6.0 \
    crate://crates.io/syn/2.0.68 \
    crate://crates.io/tempfile/3.10.1 \
    crate://crates.io/tera/1.20.0 \
    crate://crates.io/thiserror-impl/1.0.61 \
    crate://crates.io/thiserror/1.0.61 \
    crate://crates.io/thread_local/1.1.8 \
    crate://crates.io/time-core/0.1.2 \
    crate://crates.io/time-macros/0.2.18 \
    crate://crates.io/time/0.3.36 \
    crate://crates.io/tokio-macros/2.3.0 \
    crate://crates.io/tokio-stream/0.1.15 \
    crate://crates.io/tokio-util/0.7.11 \
    crate://crates.io/tokio/1.38.0 \
    crate://crates.io/toml/0.8.14 \
    crate://crates.io/toml_datetime/0.6.6 \
    crate://crates.io/toml_edit/0.22.14 \
    crate://crates.io/tower-service/0.3.2 \
    crate://crates.io/tracing-attributes/0.1.27 \
    crate://crates.io/tracing-core/0.1.32 \
    crate://crates.io/tracing-log/0.2.0 \
    crate://crates.io/tracing-subscriber/0.3.18 \
    crate://crates.io/tracing/0.1.40 \
    crate://crates.io/try-lock/0.2.5 \
    crate://crates.io/typenum/1.17.0 \
    crate://crates.io/ubyte/0.10.4 \
    crate://crates.io/ucd-trie/0.1.6 \
    crate://crates.io/uncased/0.9.10 \
    crate://crates.io/unic-char-property/0.9.0 \
    crate://crates.io/unic-char-range/0.9.0 \
    crate://crates.io/unic-common/0.9.0 \
    crate://crates.io/unic-segment/0.9.0 \
    crate://crates.io/unic-ucd-segment/0.9.0 \
    crate://crates.io/unic-ucd-version/0.9.0 \
    crate://crates.io/unicode-ident/1.0.12 \
    crate://crates.io/unicode-xid/0.2.4 \
    crate://crates.io/v_htmlescape/0.15.8 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/walkdir/2.5.0 \
    crate://crates.io/want/0.3.1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.92 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.92 \
    crate://crates.io/wasm-bindgen-macro/0.2.92 \
    crate://crates.io/wasm-bindgen-shared/0.2.92 \
    crate://crates.io/wasm-bindgen/0.2.92 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.8 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-core/0.52.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows-targets/0.52.5 \
    crate://crates.io/windows/0.48.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.5 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.52.5 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.52.5 \
    crate://crates.io/windows_i686_gnullvm/0.52.5 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.52.5 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.52.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.5 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.52.5 \
    crate://crates.io/winnow/0.6.13 \
    crate://crates.io/yansi/1.0.1 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    "

SUMMARY = "htmx"
HOMEPAGE = "https://github.com/studeo14/clisp-web"
LICENSE = "CLOSED"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include htmx-${PV}.inc
include htmx.inc
