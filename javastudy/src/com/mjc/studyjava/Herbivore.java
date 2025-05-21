package com.mjc.studyjava;

public class Herbivore extends Mammalia{
    public Herbivore(String name, int age){
        super(name, age);
    }
    @Override
    public Animal reproduce(String newName){
        System.out.println("새끼 이름은 " + newName);
        return new Animal(newName, 0); //*새끼는 나이 0으로 초기화??*
    }

    public static void main(String[] args){
        Herbivore h = new Herbivore("당나귀", 2);

        h.move();
        h.reproduce("나귀");
    }
}
