const student = {
    id: 275,
    name: "Peter",
    department: "Civil",
    college: "ABC University",
    email: "peter@example.com"
  };
  
  function displayStudentDetails() {
    console.log(`ID: ${student.id}`);
    console.log(`Name: ${student.name}`);
    console.log(`Department: ${student.department}`);
    console.log(`College: ${student.college}`);
    console.log(`Email: ${student.email}`);
  }
  
  function displaySpecificDetails() {
    console.log(`ID: ${student.id}`);
    console.log(`Name: ${student.name}`);
    console.log(`Email: ${student.email}`);
  }
  
  console.log("Displaying all details:");
  displayStudentDetails();
  
  console.log("\nDisplaying basic details:");
  displaySpecificDetails();
  
  student.address = {
    doorNo: "5D",
    street: "Reddy Street",
    area: "Chennai",
    pincode: "098765"
  };
  
  function displayDetailsOfStudentWithAddress() {
    console.log(`ID: ${student.id}`);
    console.log(`Name: ${student.name}`);
    console.log(`Department: ${student.department}`);
    console.log(`College: ${student.college}`);
    console.log(`Address: ${student.address.doorNo}, ${student.address.street}, ${student.address.area}, ${student.address.pincode}`);
  }
  
  console.log("\nDisplaying details of student with address:");
  displayDetailsOfStudentWithAddress();
  
  delete student.email;
  
  delete displaySpecificDetails;
  
  console.log("\nDisplaying details after deleting email:");
  displayStudentDetails();
  