console.log(this)
console.log(this=== module.exports)
console.log(this=== exports)
function fn_1(){
    console.log(`fn_1 실행 ${this===exports} ${this===global}  ${this}`)
}
fn_1()