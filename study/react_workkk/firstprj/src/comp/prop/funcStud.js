import { Component } from "react";
import './funcStud.css'

function wefwe({dd}){
    let jum = dd.jum.join(',')
    let tot = 0
    for (const j of dd.jum) {
        tot += j
    }
    let avg = tot/dd.jum.length
    let grade
    if(avg>=90){
        grade = '수'
    }else if(avg>=80){
        grade = '우'
    }else if(avg>=70){
        grade = '미'
    }else if(avg>=60){
        grade = '양'
    }else{
        grade = '가'

    }

    return <div className='stBox'>
        <div className='stTitle'>이름</div><div className='stData'>{dd.pname}</div>
        <div className='stTitle'>점수</div><div className='stData'>{jum}</div>
        <div className='stTitle'>총점</div><div className='stData'>{tot}</div>
        <div className='stTitle'>등급</div><div className='stData'>{grade}</div>
    </div>
    
}

export default wefwe