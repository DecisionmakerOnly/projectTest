import{flag} from "./aaa.js";

if(flag) {
    console.log('小明是天才，哈哈哈');
}else{
    console.log('小红是天才，呵呵呵');
}
/**/
import {num1,height} from "./aaa.js";

console.log(num1, height);

import {mul,person} from "./aaa.js";

console.log(mul(4,1));
/*import{person} from "./aaa.js";*/
const p=new person();
p.run()
import {address} from "./aaa.js";

console.log(address);
import ww from "./aaa.js";
ww('这是个神奇的田野')
console.log('我是最棒的');
/*统一全部导出*/
import * as aaa from "./aaa.js";

console.log("-------------");
console.log(aaa.flag);
console.log(aaa.height);