package review1;

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
    @Override
    public void fly(){
    }
    @Override
    public void stop(){
    }
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
      //***오버 라이딩!!*** -> 선언은 Main 밖!!!
      SE plane = new SE();
      plane.fly();
      plane.stop();
      System.out.println(plane.speed);
      System.out.println(plane.maxspeed);
    }
}
