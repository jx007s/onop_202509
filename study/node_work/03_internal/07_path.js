const pp = require('path')

console.log(`sep : ${pp.sep}`)                                          // 경로구분자 : \
console.log(`delimiter : ${pp.delimiter}`)                              //환경변수구분자: ;
console.log('파일 경로 ----------------')
const fName = __filename
console.log(`fName : ${fName}`)
console.log(`dirname(fName) : ${pp.dirname(fName)}`)                    //fName의 폴더위치
console.log(`dirname(pp.dirname(fName)) : ${pp.dirname(pp.dirname(fName))}`)
console.log(`extname(fName) : ${pp.extname(fName)}`)                    // 확장자
console.log(`basename(fName) : ${pp.basename(fName)}`)                  // 파일명
console.log(`basename(fName,'.js') : ${pp.basename(fName, '.js' )}`)    // 확장자빠진 파일명

console.log('파일 경로 객체 ----------------')
console.log(`parse(fName) : `, pp.parse(fName))                         // 파일경로분리: root,dir,base,ext,name
let ff = {
  dir: 'D:\\qwer\\asdf',
  ext: '.jpg',
  name: 'zxcv'
}
console.log(`ff : `,ff)
console.log(`format(ff) : ${pp.format(ff)}`)            // 파일경로객체 -> 파일경로문자열
console.log(`normalize('aaa\\\\bbb/cc///ddd.txt') : ${pp.normalize('aaa\\\\bbb/cc///ddd.txt')}`)  // /,\ 여러번사용한 경로-> 정상경로
console.log('파일 절대 경로 ----------------')
console.log(`isAbsolute('D:\\public') : ${pp.isAbsolute('D:\\public')}`)    //절대경로 - true
console.log(`isAbsolute('wwee\\rrt') : ${pp.isAbsolute('wwee\\rrt')}`)      //상대경로 - false

console.log('파일 이동 경로 ----------------')
//    ./  : 현재폴더    ../ : 상위폴더
console.log(`relative('D:\\public\\qqq\\www', 'D:\\public') : 
    ${pp.relative('D:\\public\\qqq\\www', 'D:\\public')}`)  // 'D:\\public\\qqq\\www'=>'D:\\public'이동방법 :  ..\..
console.log(`relative('D:\\public\\qqq\\www', 'D:\\public\\aaa\\bbb') : 
    ${pp.relative('D:\\public\\qqq\\www', 'D:\\public\\aaa\\bbb')}`)  // 이동방법 :  ..\..\aaa\bbb

console.log(`join('D:\\public\\aaa\\bbb', '../../','/ccc/ddd','../','eee','vvv','.jpg') : 
    ${pp.join('D:\\public\\aaa\\bbb', '../../','/ccc/ddd','../','eee','vvv.jpg')}`)    
    // 경로합치기(절대,상대 주소혼용 가능) :  D:\public\ccc\eee\vvv.jpg

console.log(`resolve('D:\\public\\aaa\\bbb', '../../','vvv.jpg') : 
    ${pp.resolve('D:\\public\\aaa\\bbb', '../../','vvv.jpg')}`)  // 절대경로로 표현하기 
    
console.log(`join('/aa', '/bb','/cc') : ${pp.join('/aa', '/bb','/cc')}`)    //경로합치기 :  \aa\bb\cc
console.log(`join('D:\\', 'bb','cc') : ${pp.join('D:\\', 'bb','cc')}`)      //경로합치기 :  D:\bb\cc
console.log(`resolve('/aa', '/bb','/cc') : ${pp.resolve('/aa', '/bb', '/cc')}`) //절대경로 :  D:\cc  --> '/aa', '/bb' 생략됨
                                                  // /aa --> /  : root 로 인지(D:\) -->  마지막의 /cc 가 root 에서 시작으로 인지
console.log(`resolve('D:\\', 'bb','cc') : ${pp.resolve('D:\\', 'bb', 'cc')}`) //절대경로 :  D:\bb\cc

/*

   현재 파일을  D:\\public\\aaa\\bbb\\ccc 폴더에 위치하는 경로를 출력하세요
   ex) D:\\public\\onop\\2025_09\\03_internal\\07_path.js  --> D:\\public\\aaa\\bbb\\ccc\\07_path.js
   // 결과 : ../../../aaa/bbb/ccc/07_path.js

*/