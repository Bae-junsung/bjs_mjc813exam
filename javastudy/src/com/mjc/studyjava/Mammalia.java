package com.mjc.studyjava;

public class Mammalia extends Animal{
    public String food;

    public Mammalia(String name, int age){
        super(name, age);
        this.food = food;
    }
    public void feedingMilk(){
        System.out.println(name + "은 " + "젖을 먹인다");
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
        mam.feedingMilk();
        mam.reproduce("새끼 기린");
    }
}
