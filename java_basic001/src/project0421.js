// 문자열 압축
class Exam61 {
    constructor( str = prompt("문자열을 입력하세요:")) {
        this.str = str;
    }
    sen(){
    let result = "";
    let count = 1;
    for(let i = 0; i < this.str.length; i++){
    if(this.str[i] == this.str[i + 1]){ //현재랑 다음꺼 같으면
        count++;
    }
    else { //다르면
        result += this.str[i]; //??
        //if 부분만 참고함
        if(count > 1) { //1이상일때만 증가
            result += count;
        }
        count = 1;
        //여기까지
    }
     }
     console.log("문자열 출력:", result);
    }
}
const exam61 = new Exam61();
exam61.sen();

/*
//버스 정류장
class Exam68 {
    constructor(time = prompt("버스 시간을 입력하세요:")) {
        this.time = time;
    }
    bus(){
    for(int i = 0; i < time.length; i++){
        time =
     }
    }
}
const exam68 = new Exam68();
exam68.bus();
*/