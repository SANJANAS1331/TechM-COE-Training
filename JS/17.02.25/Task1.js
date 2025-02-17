function multiplicationTable() {
    let number = 15; 
    let limit = 8; 
    let multiples = "";
    for (let i = 1; i <= limit; i++) {
      multiples += number + " x " + i + " = " + (number * i) + "\n";
    }
  
    console.log(multiples); 
  }

  multiplicationTable();
  
  