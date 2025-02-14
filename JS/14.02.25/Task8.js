let price = {Monday: 45, Tuesday: 48, Wednesday: 55, Thursday: 65, Friday: 49, Saturday: 42, Sunday: 47};

let totalAmount = price.Monday + price.Tuesday + price.Wednesday + price.Thursday + price.Friday + price.Saturday + price.Sunday;

let avg = totalAmount / 7;

if (avg > 50) {
    console.log("Tomato has given good profit.");
} else {
    console.log("No profit from tomato.");
}
