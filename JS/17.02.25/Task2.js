function factors(parameter) {
    let factor = "";
  
    for (let i = 1; i <= parameter; i++) {
      if (parameter % i == 0) {
        factor += i + " ";
        
      }
      
    }
    
    console.log(factor);
  
  }

  factors(57);
  