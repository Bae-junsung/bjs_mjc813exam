package interfacej;

public class Driver {
    public String name;
    public int age;
    public IVehicle ivehicle;

    public Driver(String name, int age, IVehicle ivehicle){
        this.name = name;
        this.age = age;
        this.ivehicle = ivehicle;
    }

    public void drive(){
        System.out.println(name + " is driving: " + ivehicle.drive()); //참고
    }

    public void breakk(){
        System.out.println(name + " is braking: " + ivehicle.breakk()); //참고
    }

    public static void main(String[] args){
        IVehicle iv1;
        iv1 = new interfacej.Truck("부르릉", 4);
        System.out.println(iv1.drive());
        System.out.println(iv1.breakk());

        Driver dr1 = new Driver("이순신", 34, iv1); //참고
        dr1.drive();
        dr1.breakk();

        IVehicle iv2;
        iv2 = new interfacej.Bicycle("따르릉", 2);
        System.out.println(iv2.drive());
        System.out.println(iv2.breakk());

        Driver dr2 = new Driver("유재석", 50, iv2); //참고
        dr2.drive();
        dr2.breakk();
    }
}
