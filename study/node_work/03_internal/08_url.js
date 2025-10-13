const url = require('url')

const webToon = new url.URL('https://zzz:pA$$W0Rd@comic.naver.com:8088/webtoon/detail?titleId=821793&no=10&no=20&no=30&week=mon#asdf')
console.log(`url.URL >>>`, webToon)
console.log(`url.format : `, url.format(webToon) ) // url객체 -> 문자열

console.log(`--------------------------------------------------------`)

const param = webToon.searchParams
console.log(`searchParams : `, param)
console.log(`searchParams.get('no') : `, param.get('no'))                   //최초 1개 리턴 - 10
console.log(`searchParams.get('titleId') : `, param.get('titleId'))         //821793
console.log(`searchParams.get('vvbb') : `, param.get('vvbb'))               //없으면 null
console.log(`searchParams.getAll('no') : `, param.getAll('no'))             //배열로 리턴 - [ '10', '20', '30' ] 
console.log(`searchParams.getAll('titleId') : `, param.getAll('titleId'))   //배열로 리턴 - [ '821793' ]
console.log(`searchParams.getAll('vvbb') : `, param.getAll('vvbb'))         //param이 없어도 배열로 리턴 - []
console.log(`searchParams.has('titleId') : `, param.has('titleId'))         //존재유무 : true
console.log(`searchParams.has('vvbb') : `, param.has('vvbb'))               //존재유무 : false
console.log(`searchParams.keys() : `, param.keys())                         //key 로 구성된 배열:URLSearchParams Iterator { 'titleId', 'no', 'no', 'no', 'week' }
console.log(`searchParams.values() : `, param.values())                     //value 로 구성된 배열:URLSearchParams Iterator { '821793', '10', '20', '30', 'mon' }

param.set('week','sun')                             //param 대입
console.log(`set('week','sun') : `, param)
param.append('age',26)                              //param 추가
console.log(`append('age',26) : `, param)
param.append('age',78) 
param.append('titleId','poiu')                      //기존 param과 같은 key 로 추가 가능
console.log(`다중 append : `, param)
console.log(`searchParams.getAll('titleId') : `, param.getAll('titleId'))
param.delete('no')                                      // 같은 key 에 해당하는 param 모두 삭제
param.delete('week')
console.log(`delete : `, param)
console.log(`webToon : `, webToon)                      //변경내용을 상위객체에서도 반영 : 주소참조형태
console.log(`param.toString() : `, param.toString())    //param 객체 => 문자열
