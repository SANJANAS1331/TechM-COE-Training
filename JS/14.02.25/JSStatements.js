console.log("----------If Statement----------");

const num = 5;

if (num > 0) {
	console.log("The number is positive.");
};

console.log("----------If-Else Statement----------");

let nm = -10;

if (nm > 0)
	console.log("The number is positive.");
else
	console.log("The number is negative");

console.log("----------Nested If-Else Statement----------");

let weather = "sunny";
let temperature = 25;

if (weather === "sunny") {
    if (temperature > 30) {
        console.log("It's a hot day!");
    } else if (temperature > 20) {
        console.log("It's a warm day.");
    } else {
        console.log("It's a bit cool today.");
    }
} else if (weather === "rainy") {
    console.log("Don't forget your umbrella!");
} else {
    console.log("Check the weather forecast!");
};

console.log("----------If-Else-If Statement----------");

const temp = 25;
if (temp > 30) {
    console.log("It's hot.");
} else if (temp >= 20) {
    console.log("It's warm.");
} else {
    console.log("It's cold.");
}

console.log("----------switch statement----------");

let m = 5;

switch (m) {
	case 0:
		console.log("Number is zero.");
		break;
	case 1:
		console.log("Nuber is one.");
		break;
	case 2:
		console.log("Number is two.");
		break;
	default:
		console.log("Number is greater than 2.");
};

console.log("----------Using the Ternary Operator (Conditional Operator)----------");

let pm = 10;

let result = pm >= 0 ? "Positive" : "Negative";

console.log(`The number is ${result}.`);

console.log("----------for loop----------");

for (let i = 21; i <= 40; i++) {
  if (i % 2 === 0) {
    console.log(i);
  }
};

console.log("----------while loop----------");

let ij = 11;
while (ij <= 15) {
    console.log(ij);
    ij++;
}

console.log("----------do while loop----------");

let j = 21;
do {
    if(j%4==0)
    console.log(j);
    j++;
} while (j <= 35);

console.log("----------return statement----------");

function add(a, b) {
    return a + b;
}
const res = add(55, 63);
console.log(res);

console.log("----------break and continue Statement----------");

for (let l = 1; l <= 5; l++) {
    if (l === 3) break;
    console.log(l);
}

for (let p = 1; p <= 5; p++) {
    if (p === 3) continue;
    console.log(p);
}