package review1;

import unit13.Car;

public class SuccessionExample extends SE{
//    public SuccessionExample(String model, String color){
//        super(model, color); //부모 호출!!
//    }
//   class A extends SE{
//   }
//   class B extends SE{
//   }
//   class C extends SE{
//   }
//   class D extends SE{
//   }
//    //**오버라이드 선언(메인 밖!!)**
//    @Override
//    public void fly(){
//        System.out.println("슈우웅~"); //재정의!!
//    }
//    @Override
//    public void stop(){
//        System.out.println("멈춰!!"); //재정의!!
//    }
//    public SuccessionExample(int speed, int maxspeed){
//        super(speed,maxspeed);
//    }
    //추상 메소드
//    public SuccessionExample(String owner){
//        super(owner);
//    }
//    @Override
//    public void internetSearch(){
//        System.out.println("인터넷 검색을 함");
//    }

    public static void main(String[] args) {
//        SE se = new SE("갤럭시", "은색");
//            se.bell();
//            se.end();
//            System.out.println(se.color);
//            System.out.println(se.model);
//       //부모는 자기포함 자식 전체 포함!
//       B b = new B();
//       A a = new A();
//       C c = new C();
//       D d = new D();
//       SE s1 = a;
//       SE s2 = b;
//       SE s3 = c;
//       SE s4 = d;
//       C c1 = c;
//       C c2 = d; //상속 아니므로 에러!
//      //***오버 라이딩!!*** -> 선언은 Main 밖!!!
//      SE plane = new SuccessionExample(10, 500); //부모꺼면 new 부모, 재정의는 new 자식!!
//      plane.fly();
//      plane.stop();
//      System.out.println(plane.speed);
//      System.out.println(plane.maxspeed);

//       //*다형성1
//       SE car = new SE();
//       car.run();
//       car = new Car1(); //암기
//       car.run();
//       car = new Car2();
//       car.run();

//     //*추상 클래스(구체적인 내용은 자식 클래스가 완성!!,new X)
//     SE phone = new SuccessionExample("갤럭시"); //자식으로 받기!!
//     phone.internetSearch();
//     phone.turnOn();
//     phone.turnOff();
//     System.out.println(phone.owner);
     }
}
