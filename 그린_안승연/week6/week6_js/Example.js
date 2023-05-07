//1번
const arr = ["aaa", "aBc", "BcA"];
const newArr = toUpperCase(arr);

function toUpperCase(arr) {
    const newArr = [];
    for (let i = 0; i < arr.length; i++) {
        newArr.push(arr[i].toUpperCase());
    }
    return newArr;
}

//2번

const user = new User("안승연", "test@test.com", "01000000000");
user.printInfo();

class User {
    constructor(name, email, phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    printInfo() {
        console.log("이름 : " + name + ", 이메일 : " + email + ", 전화번호 : " + phone);
    }
}


//3번
const n = prompt("숫자를 입력하세요.");

try {
    const result = num / 0;
    console.log(result);
} catch (error) {
    console.log("Cannot divide by zero");
}