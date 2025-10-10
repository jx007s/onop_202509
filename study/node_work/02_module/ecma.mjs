//  ECMA 모듈 : 향상된 javascript : 코드의 직관성과 함축성을 높임
// require --> import 
//module.exports -->  export            : 여러개
//module.exports -->  export default    : 1개

// var {aa, bb} = require('./sub1')
import {aa, bb} from './sub1.mjs'
import cc from './sub2.mjs'

console.log(aa)
console.log(bb)
console.log(cc)