package abstractj;

public abstract class Vehicle {
    public int wheelCount;

    public Vehicle(int wheelCount){
        this.wheelCount = wheelCount;
    }

    public abstract void move();
    public abstract void stop();
}
