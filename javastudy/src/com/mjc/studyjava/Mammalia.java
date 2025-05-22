package com.mjc.studyjava;

public class Mammalia extends Animal{
    public String food;

    public Mammalia(String name, int age){
        super(name, age);
        this.food = food;
    }
    public void feedingMilk(Object feed) {
        if (feed instanceof String) {
            System.out.println(name + "은 " + "젖을 먹는다");
        } else {
            System.out.println("String 타입이어야 합니다.");
        }
    }

    @Override
    public Animal reproduce(String newName){
        System.out.println("새끼 이름은 " + newName);
        return new Animal(newName, 0); //*새끼는 나이 0으로 초기화??*
    }

    public static void main(String[] args){
        Mammalia mam = new Mammalia("기린", 3);

        mam.sleep();
        mam.move();
        mam.feedingMilk("기린");
        mam.feedingMilk(123);
        mam.reproduce("새끼 기린");
    }
}
