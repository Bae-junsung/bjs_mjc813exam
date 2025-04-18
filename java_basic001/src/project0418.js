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

