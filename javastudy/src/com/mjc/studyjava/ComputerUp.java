package com.mjc.studyjava;

public class ComputerUp {
    //필드 선언
    private String name; //컴퓨터 이름
    private String cpu; //CPU
    private Integer ram; //RAM 크기
    private String storage; //저장 장치
    private String graphicCard; //그래픽 카드

    //기본 생성자
    public ComputerUp(){
        this.name = "Computer";
        this.cpu = null;
        this.ram = null;
        this.storage = null;
        this.graphicCard = null;
    }
    //첫번째 비기본 생성자
    public ComputerUp(String name){
        this.name = name;
        this.cpu = null;
        this.ram = null;
        this.storage = null;
        this.graphicCard = null;
    }
    //두번째 비기본 생성자
    public ComputerUp(String name, String cpu){
        this.name = name;
        this.cpu = cpu;
        this.ram = null;
        this.storage = null;
        this.graphicCard = null;
    }
    //세번째 비기본생성자
    public ComputerUp(String name, String cpu, Integer ram){
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = null;
        this.graphicCard = null;
    }
    //네번째 비기본
    public ComputerUp(String name, String cpu, Integer ram, String storage){
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.graphicCard = null;
    }
    //다섯번째 비기본 생성자
    public ComputerUp(String name, String cpu, Integer ram, String storage, String graphicCard){
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.graphicCard = graphicCard;
    }
    //정보 출력시 null 변경
    public void Out(){
        if(name != null){
            System.out.println("이름: " + name);
        }
        else{
            System.out.println("조립중입니다");
        }
        if(cpu != null){
            System.out.println("CPU: " + cpu);
        }
        else{
            System.out.println("조립중입니다");
        }
        if(ram != null){
            System.out.println("RAM: " + ram);
        }
        else{
            System.out.println("조립중입니다");
        }
        if(storage != null){
            System.out.println("Storage: " + storage);
        }
        else{
            System.out.println("조립중입니다.");
        }
        if(graphicCard != null){
            System.out.println("Graphic: : " + graphicCard);
        }
        else{
            System.out.println("조립중입니다\n");
        }
    }
    //마우스 생성자
    public void useMouse(){
        Mouse m = new Mouse();

        m.moveMouse(200, 400);
        m.buttonLeft();
        m.moveMouse(600, 800);
        m.buttonRight();
    }

    public static void main(String[] args){
        ComputerUp c = new ComputerUp();
        ComputerUp c1 = new ComputerUp("Samsung NT530");
        ComputerUp c2 = new ComputerUp("Samsung NT531", "Gen9_i5");
        ComputerUp c3 = new ComputerUp("Samsung NT532", "Gen9_i7", 16);
        ComputerUp c4 = new ComputerUp("Samsung NT533", "Gen9_i9", 32, "HDD");
        ComputerUp c5 = new ComputerUp("Samsung NT534", "Gen9_i9", 64, "SSD", "RTX 4080");
        Mouse b = new Mouse();

        c.Out();
        c1.Out();
        c2.Out();
        c3.Out();
        c4.Out();
        c5.Out();

        b.moveMouse(200, 400); //헷갈림
        b.buttonLeft();
        b.moveMouse(600, 800);
        b.buttonRight();
    }
}
