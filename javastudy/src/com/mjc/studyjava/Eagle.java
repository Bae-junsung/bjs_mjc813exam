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
    public void eat(Object feed) {
        if (feed instanceof Animal) {  // *feed가 Animal 타입인지 확인*
            Animal animalFeed = (Animal) feed; // feed를 Animal로 형변환
            System.out.println(name + "는 " + animalFeed.getName() + "을 먹는다"); // 동물이름을 출력
        } else {
            System.out.println(name + "는 " + feed + "를 먹는다"); // 다른 경우에는 일반적인 출력
        }
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
        eagle.eat(new Animal("사슴", 4));
        eagle.reproduce("새끼 독수리");
    }
}
