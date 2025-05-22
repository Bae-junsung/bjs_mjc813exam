package interfacej;

public class Truck implements IVehicle {
    private String name;
    private int wheelCount;

    public Truck(String name, int wheelCount) {
        this.name = name;
        this.wheelCount = wheelCount;
    }

    @Override
    public String drive() {
        return wheelCount + "개의 바퀴의 트럭 " + name + "을 운전한다.";
    }

    @Override
    public String breakk() {
        return "트럭 " + name + "을 정지한다.";
    }
}
