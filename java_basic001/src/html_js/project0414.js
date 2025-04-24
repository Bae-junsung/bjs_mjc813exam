class Question0414 {
    // 로또
    exam1(){
    let a = [ ];
    for(let i = 0; i < 6; i++) {
        let n = Math.floor(Math.random() * (45-1) + 1);
        if (a.indexOf(n) === -1) {  // If the number is not found, indexOf returns -1
            a.push(n);  // Add the number to the array
        }
        else {
            i--;  // Decrease i to retry the current iteration if there's a duplicate
          }
        }
        console.log("로또번호:", a);
    }
    // 2.피라미드
    exam2(){
    let b = '';
    let height = prompt("입력하세요:");
    for (let i = 1; i <= height; i++) {
            b += ' '.repeat(height - i);        // 앞에 공백 추가
            b += '*'.repeat(i * 2 - 1);         // 별 개수: 홀수 개
            b += '\n';
        }
        console.log(b)
    }
    // 3.캐릭터 만들기("객체 생성 constructor 중요!!!")
    exam3(){
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
    }
    // 4. 행성이름과 순서 출력
    exam4(){
    const Planet = ['수성', '금성' , '지구', '화성', '목성', '토성', '천왕성', '해왕성'];
    let d = prompt("입력하세요");
    console.log("입력:", d);
    console.log("출력:", Planet[d - 1]);
    }
    // 5. 문장 거꾸로 출력
    exam5(){
    let e = prompt("입력하세요")
    console.log("입력:", e);
    console.log("출력:", e.split('').reverse().join(''));
    }
}

const q = new Question0414(); //??
q.exam1();
q.exam2();
q.exam3();
q.exam4();
q.exam5();