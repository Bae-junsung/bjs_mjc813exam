package abstractj;

public class Bicycle extends Vehicle{
    public String name;

    public Bicycle(String name, int wheelCount){
        super(wheelCount);
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("바퀴가 " + wheelCount + "개인 자전거가 움직입니다");
    }

    @Override
    public void stop() {
        System.out.println("바퀴가 " + wheelCount + "개인 자전거가 정지합니다");
    }

    public void B(String name){
        System.out.println(name + "의 바퀴는 " + wheelCount + "개 입니다");
    }

    public static void main(String[] args){
        Bicycle bicycle = new Bicycle("호롤루", 2);

        bicycle.B("씽씽이");
        bicycle.move();
        bicycle.stop();
    }
}
