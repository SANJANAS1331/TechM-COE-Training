function sumofdigits(number) {
    let sum = 0;
    let n = number;
  
    while (n > 0) {
      sum += n % 10; 
      n = Math.floor(n / 10); 
    }
  
    if (sum % 2 == 0) {
      console.log("It is an even number.");
    } else {
      console.log("It is an odd number.");
    }
  }
  
  sumofdigits(5784); 
  