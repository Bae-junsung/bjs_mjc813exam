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
        System.out.println();
    }

    public void breakk(){
        System.out.println();
    }

    public static void main(String[] args){
        IVehicle iv1;
        iv1 = new interfacej.Truck("부르릉", 4);
        System.out.println(iv1.drive());
        System.out.println(iv1.breakk());

        Driver dr = new Driver("이순신", 34, iv1);
        dr.drive();
        dr.breakk();

        IVehicle iv2;
        iv2 = new interfacej.Bicycle("따르릉", 2);
        System.out.println(iv2.drive());
        System.out.println(iv2.breakk());
    }
}
