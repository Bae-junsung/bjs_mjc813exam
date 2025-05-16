package com.mjc.studyjava;

public class Mouse {
    //필드선언
    private int x;
    private int y;

    //마우스 생성자 생성
    public void moveMouse(int x, int y){
        this.x = x;
        this.y = y;
    }

    //왼쪽 버튼
    public void buttonLeft(){
        System.out.println("\n마우스(" + x + "," + y + ") 왼쪽 버튼 클릭됨");
    }

    //오른쪽 버튼
    public void buttonRight(){
        System.out.println("마우스(" + x + "," + y  + ") 오른쪽 버튼 클릭됨");
    }

    public static void main(String[] args){
        Mouse m = new Mouse();

        m.moveMouse(200, 400);
        m.buttonLeft();
        m.moveMouse(600, 800);
        m.buttonRight();
    }
}
