package com.mjc.studyjava;

public class Parrot extends Bird {

    public Parrot(String name, int age, String wings){
        super(name, age);
        this.wings = wings; //?
    }
    public void fly(){
        System.out.println(name + " " + wings + " 조금만 난다");
    }

    @Override
    public void eat(Object feed) {
        if (feed instanceof String) {
            System.out.println(name + "는 " + feed + "를 먹는다");
        } else {
            System.out.println("feed는 String 타입이어야 합니다.");
        }
    }

    @Override
    public Animal reproduce(String newName){
        System.out.println("새끼 이름은 " + newName);
        return new Animal(newName, 0); //*새끼는 나이 0으로 초기화??*
    }

    public static void main(String[] args){
        Parrot parrot = new Parrot("앵무새", 2, "날개");

        parrot.fly();
        parrot.eat("야채");
        parrot.eat(123);
        parrot.reproduce("아기 앵무새");
    }
}
