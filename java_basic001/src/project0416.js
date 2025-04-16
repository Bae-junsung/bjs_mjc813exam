//제곱
class Square {
    constructor (sqrt1, sqrt2){
        this.sqrt1 = sqrt1;
        this.sqrt2 = sqrt2;
    }
    result1() {
        return(this.sqrt1 ** this.sqrt2);
    }
}
    let a = prompt("첫번째 수를 입력하세요:");
    a = Number(a);
    let b = prompt("두번째 수를 입력하세요:");
    b = Number(b);
    const square = new Square(a, b);
    square.result1();
    console.log("a와 b 입력:", a, b);
    console.log("결과:", square.result1());

//원의 면적
class Circle {
    constructor (radius){
        this.radius = radius;
    }
    result2(){
        return(this.radius ** 2 * 3.14);
    }
}
    let c = prompt("반지름을 입력하세요:");
    c = Number(c);
    const circle = new Circle(c);
    circle.result2();
    console.log("반지름:", c);
    console.log("원의 면적:", circle.result2());

//행성 문제
class Planet {
    constructor (name){
        const planets = new Map([
          ["수성", "Mercury"],
          ["금성", "Venus"],
          ["지구", "Earth"],
          ["화성", "Mars"],
          ["목성", "Jupiter"],
          ["토성", "Saturn"],
          ["천왕성", "Uranus"],
          ["해왕성", "Neptune"]
        ]);
        this.name = planets.get(name); //get 함수 나중에 더 보기!!
    }
}
    let d = prompt("행성 이름을 한글로 써주세요:");
    const p = new Planet(d);
    console.log("행성 한글 이름:", d);
    console.log("행성 영어 이름:", p.name); //**함수형 X!!




