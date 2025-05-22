package interfacej;

public class Bicycle implements IVehicle {
    private String name;
    private int wheelCount;

    public Bicycle(String name, int wheelCount) {
        this.name = name;
        this.wheelCount = wheelCount;
    }

    @Override
    public String drive() {
        return wheelCount + "개의 바퀴의 자전거 " + name + "을 운전한다.";
    }

    @Override
    public String breakk() {
        return "자전거 " + name + "을 정지한다.";
    }
}
