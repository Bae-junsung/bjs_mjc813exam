 //2명
 class Exam0417 {
    maps = new Map();
    inputFunc() {
        let names = prompt("이름을 공백으로 구분하여 입력:");
        let score = prompt("점수를 공백으로 구분하여 입력");
        let arrName = names.split(" ");
        let arrScore = score.split(" ");
        this.maps.set(arrName[0], Number(arrScore[0]));
        this.maps.set(arrName[1], Number(arrScore[1]));
        console.log(this.maps);
    }
    outputFunc() {
        let strOutput = "{";
        for(let item of this.maps) {
            strOutput += `'${item[0]}': ${item[1]}, `
            console.log(item);
        }
        strOutput = strOutput.substring(0, strOutput.length - 2);
        strOutput += "}";
        console.log(strOutput);
    }
}

let exam = new Exam0417();
exam.inputFunc();

//응용 여러명
class Exam27 {
    maps = new Map();
    inputFunc() {
        let names = prompt("이름을 공백으로 구분하여 입력하세요.");
        let scores = prompt("점수를 공백으로 구분하여 입력하세요.");
        let arrName = names.split(" ");
        let arrScore = scores.split(" ");

        if (arrName.length !== arrScore.length) {
            alert("이름과 점수의 개수가 다릅니다. 다시 시작하세요.");
            return false;
        }

        for (let i = 0; i < arrName.length; i++) {
            this.maps.set(arrName[i], Number(arrScore[i])); //for 문 넣기!!
        }

        console.log(this.maps);
        return true;
    }
    outputFunc() {
        let strOutput = "{";
        for( let [names, scores] of this.maps ) {
                strOutput += `'${names}': ${scores}, ` //?????
        }
        strOutput = strOutput.substring(0 , strOutput.length - 2);
        // 문자열의 길이에서 -2 시킨 길이의 문자열로 다시 저장. "abcd" => "ab"
        strOutput += "}";
        }
}

let e = new Exam27();
if (e.inputFunc()) {
    e.outputFunc();
}

class Exam28 {
    strInput = "";
    constructor(str) {
        this.strInput = str;
    }
    output() {
        //루프를 이용하여 문자열 2글자씩 출력
        for(let i = 0; i < this.strInput.length - 1; i++){ //범위 잡기
            console.log(this.strInput[i] + this.strInput[i+1]); //다시보기
        }
    }
}

let exam28 = new Exam28(prompt("문자열 입력:"));
exam28.output();
