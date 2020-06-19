var name='小明'
var age=19
var flag=true

function sum(num1,num2){
    return num1+num2
}

if(flag){
    console.log(sum(20, 30));
}
/*导出方式一*/
export {
    flag,sum
}
/*导出方式二*/
export var num1=1000;
export var height=1.88;
/*导出函数或类*/
export function mul(num1,num2){
    return num1+num2;
}
export class person{
    run(){
        console.log('在吃草');
    }
}
export const address='长城'
/*
const aaa='海南'
export default aaa*/
export default function(arg){
    console.log(arg);
}