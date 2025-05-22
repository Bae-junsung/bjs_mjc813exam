package com.mjc.studyjava;

public class Carnivore extends Mammalia{
    public Carnivore(String name, int age){
        super(name, age);
    }

    @Override
    public Animal reproduce(String newName){
        System.out.println("새끼 이름은 " + newName);
        return new Animal(newName, 0); //*새끼는 나이 0으로 초기화??*
    }

    @Override
    public void eat(Object feed) {
        if (feed instanceof Animal) {  // *feed가 Animal 타입인지 확인*
            Animal animalFeed = (Animal) feed; // feed를 Animal로 형변환
            System.out.println(name + "은 " + animalFeed.getName() + "를 먹는다"); // 동물이름을 출력
        } else {
            System.out.println("feed는 Animal 타입이어야 합니다.");
        }
    }

    public static void main(String[] args){
        Carnivore c = new Carnivore("곰", 2);

        c.move();
        c.eat("당나귀");
        c.eat(new Animal("토끼", 3));
        c.reproduce("능소니");
    }
}
