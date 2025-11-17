
let arr1 = [10,20,30,40,50]
let arr2 = [<div key='aa11'>box1</div>, <div key='aa45'>box2</div>, <div key='aa30'>box3</div>]
let arr3 = []
for (let i = 0; i < 5; i++) {
    let ee = <div key={'nn'+i} >새로만든box{i}</div>
    arr3.push(ee)
}
let data4 = ['정우성','정남성','북극성']
let arr4 = []
for (const i in data4) {
    console.log(i, data4[i])
    let ee = <div key={'ss'+i} >{data4[i]}</div>
    arr4.push(ee)
}
console.log('forEach-------------------')
let arr5 = []
data4.forEach((vv, kk)=>{
    console.log(kk,vv)
    let ee = <div key={'ss'+kk} >{vv}</div>
    arr5.push(ee)
})
console.log('map-------------------')
let arr6 = data4.map((vv, kk)=>(
    <div key={'mm'+kk} >{vv+' map'}</div>  //각 원소를 변환하여 arr6의 원소로 push
))
console.log(arr6)
let data7 = {
    최수종:'태조왕건',
    한석규:'세종대왕',
    이서진:'정조'
}
console.log(data7)
console.log('entries', Object.entries(data7) )
/*
entries 
[
    ['최수종' , '태조왕건'],
    ['한석규' , '세종대왕'],
    ['이서진' , '정조']
]
*/
console.log('keys', Object.keys(data7) )
// ['최수종', '한석규', '이서진']

console.log('values', Object.values(data7) )
// ['태조왕건', '세종대왕', '정조']


/*
entries 
[
    ['최수종' , '태조왕건'],
    ['한석규' , '세종대왕'],
    ['이서진' , '정조']
]
*/                          
                            //  kk         vv             i
                            //['최수종' , '태조왕건']        0
let arr7 = Object.entries(data7).map(([kk,vv] ,             i)=>{
   console.log(i, kk, vv)
   return <div key={kk} >{vv+' en'}</div>  
})

console.log(arr7)
console.log('filter-------------------')
let data8 = [56,78,23,17,92,81,35] //짝수로만 구성
let even1 = []
for (const ee of data8) {
    if(ee%2==0){
        even1.push(ee)
    }
}
console.log('even1',even1) //[56, 78, 92]

//  결과 true 인 원소만 필터링
let even2 = data8.filter((vv, kk)=>vv%2==0)

console.log('even2',even2)  //[56, 78, 92]

function ertyui(){

    return <>
            <h1>배열입니다.</h1>
            <div>{arr1}</div>
            <hr/>
            {arr2}
            <hr/>
            {arr3}
            <hr/>
            {arr4}
            <hr/>
            {arr5}
            <hr/>
            {arr6}
            <hr/>
            {data4.map((vv, kk)=>(
                <div key={'mm'+kk} >{vv+' render'}</div>  //각 원소를 변환하여 arr6의 원소로 push
            ))}
            <hr/>
            {/* {data7} 키배열은 jsx문법으로 출력불가 */}
            {/* {data7.map((vv, kk)=>(
                <div key={'mm'+kk} >{vv+' render'}</div>  //각 원소를 변환하여 arr6의 원소로 push
            ))} 직접 map 사용 불가 */}
            {arr7}

            <hr/>
            {data8.filter((vv, kk)=>vv%2==0).map((vv, kk)=>(
                //      filter               map
                //data8   -->  [56, 78, 92]  -->  [<div>56</div> <div>78</div>  <div>92</div>]
                //필터링한 결과 배열을 이용하여 jsx 배열구성
                <div key={'ff'+kk} >{vv+' filter'}</div>  
            ))}
        </>
}

export default ertyui
/*
MapRec.js 파일을 생성하고
5개의 직사각형을 클래스, 생성자를 이용하여 배열형태로 출력하세요
map 이용할 것


*/