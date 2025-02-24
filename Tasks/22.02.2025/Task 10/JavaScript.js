let student = {
    name: "xyz",
    age: 20,
    dept: "Civil",

    displayInfo: function () {
        console.log(`Name: ${this.name}, Age: ${this.age}, Department: ${this.dept}`);
    }
};

console.log("Student Details:");
console.log(student);
student.displayInfo();

student.address = {
    city: "Chennai",
    pin: "600000"
};

student.getAddress = function () {
    console.log(`City: ${this.address.city}, Pincode: ${this.address.pin}`);
};

student.changeDept = function (newDept) {
    this.dept = newDept;
    console.log(`Department changed to: ${this.dept}`);
};

console.log("\nAdding Nested Object and Functions:");
console.log(student);
student.getAddress();
student.changeDept("ADS");

delete student.age;
delete student.changeDept;

console.log("\nRemoving a Property and a Function:");
console.log(student);
student.displayInfo();
