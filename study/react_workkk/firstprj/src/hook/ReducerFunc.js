function vfrttgb(stst, acttt){
    console.log('rrr 실행', acttt)
    console.log('stst', stst)  /// 현재 값 stst.vvv

    if(acttt==='ppp'){  //증가라면
        return {vvv:stst.vvv+1}
    }
    if(acttt==='mmm'){  //감소라면
        return {vvv:stst.vvv-1}
    }

    return {vvv:1234}   // 그외
}

export default vfrttgb