function fn_1(){
    console.log('fn_1() 시작')
    fn_2()
    console.log('fn_1() 끝')
}
function fn_2(){
    console.log('\t fn_2() 시작')
    fn_3()
    console.log('\t fn_2() 끝')
}
function fn_3(){
    console.log('\t\t fn_3() 시작')
    console.log('\t\t fn_3() 끝')
}
fn_1()