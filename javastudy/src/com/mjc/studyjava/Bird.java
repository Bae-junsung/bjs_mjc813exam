package com.mjc.studyjava;

public class Bird extends Animal {
    public String wings;

    public Bird(String name, int age) {
        super(name, age);
        this.wings = "" + " 날개"; // wings에 값 할당
    }
    public void flap() {
        System.out.println(name + wings + "가 날개짓한다");
    }
    public void fly() {
        System.out.println(name + wings + "가 난다");
    }

    @Override
    public Animal reproduce(String newName){
        System.out.println("새끼 이름은 " + newName);
        return new Animal(newName, 0); //*새끼는 나이 0으로 초기화??*
    }

    public static void main(String[] args) {
        Bird bird = new Bird("참새", 1);
        bird.eat("벌레");
        bird.move();
        bird.sleep();
        bird.flap();
        bird.fly();
        bird.reproduce("아기참새");
    }
}
