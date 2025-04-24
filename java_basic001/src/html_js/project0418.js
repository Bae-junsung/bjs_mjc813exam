/*
// 소수 구하기
class Exam41 {
    constructor(number = prompt("숫자를 입력하세요:")) {
        this.number = Number(number);
    }
    num() {
        if (this.number < 2) {
            console.log("NO");
            return;
        }
        for (let i = 2; i <= Math.sqrt(this.number); i++) { //Math.sqrt(this.number)은 모든수
            if (this.number % i === 0) {
                console.log("NO");
                return;
            }
        }
    console.log("YES");
    }
}
const exam41 = new Exam41();
exam41.num();

//요일 문제
class Exam042 {
    maps = new Map();
    inputFunc() {
        let dates = prompt("a와 b를 공백으로 입력하세요:");
        let arrDate = dates.split(" ");
        let month = (arrDate[0]);
        let day = (arrDate[1]);
        //-----????-----
        let date = new Date(2020, month - 1, day);
        let weekDays = ["일", "월", "화", "수", "목", "금", "토"];
        let dayOfWeek = weekDays[date.getDay()];
        //-----?????-----
        console.log(`${dayOfWeek}`);
    }
}
let exam = new Exam042();
exam.inputFunc();
*/

//천 단위로 콤마 찍기
class Exam058 {
    constructor(money = prompt("숫자를 입력하세요:")) {
        this.money = Number(money);
    }
    cal() {
        console.log(this.money.toLocaleString());
    }
}
let exam58 = new Exam058;
    exam58.cal();

//빈칸 채우기
class Exam059 {
    constructor(blank = prompt("문자를 입력하세요:")) {
        this.blank = blank;
    }
    sen(){
    let width = 50;
    let space = width - this.blank.length;
    let left = Math.floor(space / 2); // Left space ??
    let right = Math.ceil(space / 2); // Right space ??
        console.log("=".repeat(left) + this.blank + "=".repeat(right));
    }
}
let exam59 = new Exam059;
exam59.sen();