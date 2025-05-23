package com.mjc.studyjava;

public class MjcPoint {
    public int marketPoint = 50;

    public int getMarketPoint() {
        return this.marketPoint; //Getter 대신
    }

    public int addPoint(IMarketInfo info, int point) {
        if (info == null) {
            System.out.println("addPoint(info, point) 호출 시에 info 가 null 이므로 실패했습니다.");
            return this.marketPoint;
        }
        if (point >= 1 && point <= 50) {
            this.marketPoint += point;
            System.out.println(info.getMessageOfMarketInfo());
            System.out.printf("매장의 현재 포인트는 [%d] 입니다.\n", this.marketPoint);
        } else {
            System.out.println(info.getMessageOfNotValidData());
        }
        return this.marketPoint;
    }

    public int subPoint(IMarketInfo info, int point) {
        if (info == null) {
            System.out.println("subPoint(info, point) 호출 시에 info 가 null 이므로 실패했습니다.");
            return this.marketPoint;
        }
        if (point >= 1 && point <= 20) {
            this.marketPoint -= point;
            System.out.println(info.getMessageOfMarketInfo());
            System.out.printf("매장의 현재 포인트는 [%d] 입니다.\n", this.marketPoint);
        } else {
            System.out.println(info.getMessageOfNotValidData());
        }
        return this.marketPoint;
    }

    @Override
    public String toString(){
        return "포인트: " + marketPoint;
    }
}