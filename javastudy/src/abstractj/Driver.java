package abstractj;

public class Driver{
    public String name;
    public int age;
    public Vehicle vehicle;

    public Driver(String name, int age, Vehicle vehicle){
        this.name = name;
        this.age = age;
        this.vehicle = vehicle;
    }

    public void drive(){
        if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            System.out.println("트럭 " + truck.name + "은 " + truck.wheelCount + "개의 바퀴로 이동한다.");
        } else if (vehicle instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) vehicle;
            System.out.println("자전거 " + bicycle.name + "은 " + bicycle.wheelCount + "개의 바퀴로 이동한다.");
        }
    }

    public void breakk(){
        if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            System.out.println("운전수 " + name + "은 트럭 " + truck.name + "을 정지한다.");
        } else if (vehicle instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) vehicle;
            System.out.println("운전수 " + name + "은 자전거 " + bicycle.name + "을 정지한다.");
        }
    }

    public static void main(String[] args){

        Driver driver1 = new Driver("준성",20, new Truck("부르릉", 5, 4));
        driver1.drive();
        driver1.breakk();

        Driver driver2 = new Driver("기훈", 40, new Bicycle("고고씽", 2));
        driver2.drive();
        driver2.breakk();
    }
}
