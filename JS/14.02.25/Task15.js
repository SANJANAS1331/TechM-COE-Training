let val1 = 57;  
let val2 = 107; 

for (let j = val1; j <= val2; j++) {
    if (j % 5 === 0) {
        continue; 
    }
    console.log(j);
}
