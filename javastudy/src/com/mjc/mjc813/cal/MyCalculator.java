package com.mjc.mjc813.cal;

public class MyCalculator {

    int myAdd(int a, int b) {
        return a + b; //public 창 만들기??
    }
    long myAdd(long a, long b) {
        return a + b;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyCalculator mCal = new MyCalculator();

        int a1 = 10;
        int b1 = 30;
        int n1 = mCal.myAdd(a1, b1);
        System.out.println("두 수("+ a1 + "," + b1 + ")의 값은 " + n1 + " 입니다.");

        long a2 = 10;
        long b2 = 30;
        long n2 = mCal.myAdd(a2, b2);
        System.out.println("두 수("+ a2 + "," + b2 + ")의 값은 " + n2 + " 입니다.");
    }
}
