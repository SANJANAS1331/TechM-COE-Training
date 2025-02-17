const operations = () => {
    let operation = "multiply"; 
    let input1 = 47;
    let input2 = 74;
  
    var add = function(x, y){
        return x+y
    }
    var subtract = function(x, y){
        return x-y
    }
    var multiply = function(x, y){
        return x*y
    }
    var divide = function(x, y){
        if (y !== 0) {
            return (Math.floor(x / y), x % y);
          } else {
            return "Division by zero is not allowed.";
          }
    }
  
    switch (operation) {
      case "add":
        console.log("sum for add: "+add(input1, input2));
        break;
  
      case "subtract":
        console.log("difference for subtract: "+subtract(input1, input2));
        break;
  
      case "multiply":
        console.log("product for multiply: "+multiply(input1, input2));
        break;
  
      case "divide":
        console.log("quotient and reminder for divide: "+divide(input1, input2));
        break;
  
      default:
        console.log("Choose a valid operation:(");
    }
  };
  
  operations();
  