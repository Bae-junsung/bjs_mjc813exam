package abstractj;

public class Truck extends Vehicle{
    public String name;
    public int ton;

    public Truck(String name, int ton, int wheelCount){
        super(wheelCount);
        this.name = name;
        this.ton = ton;
    }

    @Override
    public void move() {
        System.out.println("바퀴가 " + wheelCount + "개인 트럭이 움직입니다");
    }

    @Override
    public void stop() {
        System.out.println("바퀴가 " + wheelCount + "개인 트럭이 정지합니다");
    }

    public void T(String name, int ton){
        System.out.println(name + "의 무게는 " + ton + "톤입니다");
    }

    public static void main(String[] args){
        Truck truck = new Truck("지프", 2, 4);

        truck.T("덤프", 3);
        truck.stop();
        truck.move();
    }
}
