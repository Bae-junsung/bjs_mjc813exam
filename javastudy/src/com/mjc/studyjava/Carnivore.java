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
    public void eat(Object feed){
        System.out.println(name + "는 " + feed + "를 먹는다"); //{출력"{이름}은 {feed}를 먹는다"}
    }

    public static void main(String[] args){
        Carnivore c = new Carnivore("곰", 2);

        c.move();
        c.eat("당나귀");
        c.reproduce("능소니");
    }
}
