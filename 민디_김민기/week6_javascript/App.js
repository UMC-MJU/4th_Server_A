
// 1번문제
const arr = ["apple", "banana", "orange"];
const newArr = toUpperCase(arr);
console.log(newArr); // ["APPLE", "BANANA", "ORANGE"]

function toUpperCase(arr) {
  const newArr = [];
  for (let i = 0; i < arr.length; i++) {
    newArr.push(arr[i].toUpperCase());
  }
  return newArr;
}

// 2번문제
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

const user = new User("홍길동", "hong@example.com", "010-1234-5678");
user.printInfo();

// 3번문제
const prompt = require("prompt-sync")();
const num = prompt("Enter a number");
try {
  const result = num / 0;
  console.log("Result: " + result);
} catch (error) {
  console.log("Cannot divide by zero");
}
