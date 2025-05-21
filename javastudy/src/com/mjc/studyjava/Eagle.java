package com.mjc.studyjava;

public class Eagle extends Bird {

    public Eagle(String name, int age, String wings){
        super(name, age);
        this.wings = wings;
    }
    public void fly(){
        System.out.println(name + " " + wings + " 높이 난다");
    }

    @Override
    public void eat(Object feed){
        System.out.println(name + "는 " + feed + "를 먹는다"); //{출력"{이름}은 {feed}를 먹는다"}
    }

    @Override
    public Animal reproduce(String newName){
        System.out.println("새끼 이름은 " + newName);
        return new Animal(newName, 0); //*새끼는 나이 0으로 초기화??*
    }

    public static void main(String[] args){
        Eagle eagle = new Eagle("독수리" , 3, "날개");

        eagle.fly();
        eagle.eat("생쥐");
        eagle.reproduce("새끼 독수리");
    }
}
