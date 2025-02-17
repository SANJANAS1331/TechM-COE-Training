console.log("----------Creating objects in single line----------");
const person = {firstName:"John", lastName:"Doe", age:50, eyeColor:"blue"};
console.log(person)

console.log("----------Creating objects in multiple line----------");
const person1 = {
  firstName: "John",
  lastName: "Doe",
  age: 50,
  eyeColor: "blue"
};
console.log(person1)

const person2 = {};

person2.firstName = "John";
person2.lastName = "Doe";
person2.age = 50;
person2.eyeColor = "blue";
console.log(person2)

console.log("----------Accessing the members of the objects----------");

let age = person2.age;
console.log(person2.firstName + " is " + person2.age + " years old.");


let age1 = person2["age"];
console.log(person2["firstName"] + " is " + person2["age"] + " years old.");


let x = "firstName";
let y = "age";
console.log(person[x] + " is " + person[y] + " years old.");
console.log("----------Adding property to the object----------");

person.nationality = "English";
console.log(person);
console.log("----------Removing property from the object----------");
delete person.age;
console.log(person);

console.log("----------Nested Objects----------");
myObj = {
  name:"John",
  age:30,
  myCars: {
    car1:"Ford",
    car2:"BMW",
    car3:"Fiat"
  }
};

//var car = myObj.myCars.car3;
//console.log(car)

//console.log(myObj.myCars["car2"]);

//console.log(myObj["myCars"]["car2"]);

//let p1 = "myCars";
//let p2 = "car2";
//console.log(myObj[p1][p2]);
const person4 = {
  firstName: "John",
  lastName: "Doe",
  id: 5566,
  fullName: function() {
    return this.firstName + " " + this.lastName;
  }
};

//name = person.fullName();
//console.log("Full name: "+person.fullName())
console.log("fullName function definition: "+person4.fullName);

console.log("----------Adding funcions to objects----------");
person4.name1 = function () {
  return this.firstName + " " + this.lastName;
};

person4.name2 = function () {
  return (this.firstName + " " + this.lastName).toUpperCase();
};
//console.log(person.name1())
//console.log(person.name2())
console.log("name1 function definition: "+person4.name1);
console.log("name2 function definition: "+person4.name2);

/*document.getElementById("demo").innerHTML = person4;

document.getElementById("demo").innerHTML = person4.name + "," + person4.age + "," + person4.city;*/

console.log("----------Removing function from the object----------");
delete person4.name1;
console.log(person4.name1);