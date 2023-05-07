//1번
const arr = ["south", "north", "east", "west"];
const newArr = toUpperCase(arr);
console.log(newArr);

function toUpperCase(arr) {
    const newArr = [];
    for (let i = 0; i < arr.length; i++) {
        newArr.push(arr[i].toUpperCase());
    }
    return newArr;
}

//2번
class User {
    constructor(name, email, phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    printInfo() {
        console.log("Name: " + this.name);
        console.log("Email: " + this.email);
        console.log("Phone: " + this.phone);
    }
}

//3번
const user = new User("이우성", "dtd1614@naver.com", "010-4575-2518");
user.printInfo();

const prompt = require("prompt-sync")();
const num = prompt("Enter a number");
try {
    const result = num / 0;
    console.log("Result: " + result);
} catch (error) {
    console.log("Cannot divide by zero");
}