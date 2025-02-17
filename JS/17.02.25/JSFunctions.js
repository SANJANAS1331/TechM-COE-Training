console.log("----------Function without parameters----------");
function myFunction()
{
console.log("JS Functions");
}

myFunction()

console.log("----------Function with parameters----------");
function add(a, b) { 
    return a + b; 
}
console.log(add(4, 7));

var sum = function (c, d) {
    return c + d;
};
console.log(sum(2, 5));

console.log("----------Arrow Functions----------");
let addition = (e, f) => e + f;
console.log(addition(5, 2)) 

console.log("----------Function as expressions and with parameters----------");
var summation = function (g, h) {
    return g + h;
};
console.log(summation(7, 5));