/*
class Exam87 {
    constructor(name = prompt("먹은 사람들을 입력하세요:"),
                dish = prompt("먹은 그릇을 입력하세요:")) {
        this.dish = dish
        this.name = name;
    }
    food(){

    }
}
const exam87 = new Exam87();
exam87.food();
*/

class Exam91{
    constructor(student_s = [], class_s = [], total_s = []) {
        this.student_s = student_s;
        this.class_s = class_s;
        this.total_s = total_s;
    }
    avg(){
        for(let i = 0; i<5; i++){
            this.student_s.push(Math.floor(Math.random() * 100) + 1); //힌트 사용???
        }
        let a = prompt("학생 성적:", student_s);
        // Calculate the sum of the scores
                const sum = this.student_s.reduce((acc, score) => acc + score, 0); //????
        const average = sum / this.student_s.length;
        let b = prompt("평균:", average);
    }
}
const exam91 = new Exam91();
exam91.avg();