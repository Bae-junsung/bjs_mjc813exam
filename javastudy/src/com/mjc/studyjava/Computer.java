package com.mjc.studyjava;

public class Computer {
    //필드 선언
    String name; //컴퓨터 이름
    String cpu; //CPU
    int ram; //RAM 크기
    String storageType; //저장 장치
    int storageSize; //저장 용량
    String graphicCard; //그래픽 카드

    //생성자 선언
    Computer(String n,String c, int r, String st, int ss, String gc){
        this.name = n;
        this.cpu = c;
        this.ram = r;
        this.storageType = st;
        this.storageSize = ss;
        this.graphicCard = gc;
    }

    //전원
    public void PowerOn(){
        System.out.println(name + "가 켜졌습니다.");
    }
    public void PowerOff(){
        System.out.println(name + "가 꺼졌습니다.\n");
    }

    public static void main(String[] args){
        Computer com1 = new Computer("mjc813Com", "Gen9_i7", 16, "HDD", 500, "GTX_1660");
        Computer com2 = new Computer("mjc814Com", "Gen9_i5", 4, "SDD", 1000, "RTX_4080");
        Computer com3 = new Computer("mjc815Com", "Gen9_i9", 8, "HDD", 2000, "Intel_A770");
        Computer com4 = new Computer("mjc816Com", "Gen9_i11", 32, "HDD", 4000, "GTX_1660");
        Computer com5 = new Computer("mjc817Com", "Gen9_i13", 64, "SDD", 8000, "RTX_4080");

        com1.PowerOn(); //주의
        System.out.println("컴퓨터 이름: " + com1.name);
        System.out.println("CPU: " + com1.cpu);
        System.out.println("RAM: " + com1.ram + "GB");
        System.out.println("저장장치: " + com1.storageType + " " + com1.storageSize + "GB");
        System.out.println("그래픽카드: " + com1.graphicCard);
        com1.PowerOff(); //주의

        com2.PowerOn();
        System.out.println("컴퓨터 이름: " + com2.name);
        System.out.println("CPU: " + com2.cpu);
        System.out.println("RAM: " + com2.ram + "GB");
        System.out.println("저장장치: " + com2.storageType + " " + com2.storageSize + "GB");
        System.out.println("그래픽카드: " + com2.graphicCard);
        com2.PowerOff();

        com3.PowerOn();
        System.out.println("컴퓨터 이름: " + com3.name);
        System.out.println("CPU: " + com3.cpu);
        System.out.println("RAM: " + com3.ram + "GB");
        System.out.println("저장장치: " + com1.storageType + " " + com3.storageSize + "GB");
        System.out.println("그래픽카드: " + com3.graphicCard);
        com3.PowerOff(); //주의

        com4.PowerOn();
        System.out.println("컴퓨터 이름: " + com4.name);
        System.out.println("CPU: " + com4.cpu);
        System.out.println("RAM: " + com4.ram + "GB");
        System.out.println("저장장치: " + com4.storageType + " " + com4.storageSize + "GB");
        System.out.println("그래픽카드: " + com4.graphicCard);
        com4.PowerOff(); //주의

        com5.PowerOn();
        System.out.println("컴퓨터 이름: " + com5.name);
        System.out.println("CPU: " + com5.cpu);
        System.out.println("RAM: " + com5.ram + "GB");
        System.out.println("저장장치: " + com5.storageType + " " + com5.storageSize + "GB");
        System.out.println("그래픽카드: " + com5.graphicCard);
        com5.PowerOff();
    }
}

