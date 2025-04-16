class question0415{
    // 놀이기구
    exam1(){
       const Ride = class Ride {
        constructor (rider){
            this.rider = rider;
        }
        pass(){
        if(this.rider >= 150){
            console.log("YES");
            }
            else{
                console.log("NO");
            }

         }
       }
       let a = prompt("입력하세요");
       a = Number(a); //입력값을 숫자로 변환
       const x = new Ride(a);
       x.pass();
    }
    // 평균 구하기
    exam2(){
        const Score = class Score {
         constructor (Korean, Math, English){
            this.Korean = Korean;
            this.Math = Math;
            this.English = English;
         }
        average(){
            return(this.Korean + this.Math + this.English) / 3; //return  왜 붙이지?
        }
        }
     let Korean = Number(prompt("국어점수 입력:"));
     let Math = Number(prompt("수학점수 입력:"));
     let English = Number(prompt("영어점수 입력:"));
     const x = new Score(Korean, Math, English);
     console.log("입력:",Korean, Math, English);
     console.log("평균:", x.average()); //헷갈림
    }
}

const q = new question0415(); //??
q.exam1();
q.exam2();

/*exam3(){
      const Wizard = class Wizard {
          constructor (health, mana, armor){
              this.health = health;
              this.mana = mana;
              this.armor = armor;
          }
          attack(){
              console.log('파이어볼');
          }
      }
      const x = new Wizard(545, 210, 10);
      console.log(x.health, x.mana, x.armor);
      x.attack();
      }*/