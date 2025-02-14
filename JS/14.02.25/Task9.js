let year = 1999;
let month = "January";

function checkLeapYear(year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

if (checkLeapYear(year)) {
    if (month == "February") {
        console.log("The year is leap year and the month is February with 29 days.");
    } else {
        console.log("The year is leap year and the month is not February.");
    }
} else {
    console.log("The given year is not a leap year.");
}
