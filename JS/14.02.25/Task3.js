const input = 74;
function isPrime(num) {
    if (num <= 1) return false;
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false;
    }
    return true;
}
if (isPrime(input)) {
    console.log("It is a prime number.");
} else {
    console.log("It is not a prime number.");
}