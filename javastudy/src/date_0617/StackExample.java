package date_0617;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args){
        //stack 컬렉션 생성
        Stack<Coin> coinBox = new Stack<Coin>();

        //동전 넣기
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        //동전 하나씩 꺼내기
        while(!coinBox.isEmpty()){ //비어있지 않으면 반복
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전: " + coin.getValue() + "원"); //stack은 먼저 넣은게 마지막으로 나옴
        }
    }
}
