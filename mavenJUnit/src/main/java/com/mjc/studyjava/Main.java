package com.mjc.studyjava;

public class Main {
    public static void main(String[] args) {
        MjcPoint mp = new com.mjc.studyjava.MjcPoint();

        System.out.println("초기 포인트: " + mp.getMarketPoint());
        mp.addPoint(null, 10);
        mp.addPoint(new SampleMarketInfo(), 50);

        mp.subPoint(null, 20);
        mp.subPoint(new SampleMarketInfo(), 20);
    }
}


