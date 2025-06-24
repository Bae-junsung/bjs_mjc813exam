package review2;

public class LamdaExample {
    public static void main(String[] args) {
//       action((x,y)->{
//           int result1 = x + y;
//           System.out.println("합: " + result1);
//       });
//       action((x,y)->{
//          int result2 = x - y;
//          System.out.println("차: " + result2);
//       });

//        //매개변수 없는 람다
//        LamdaExample le = new LamdaExample();
//        le.action(()->{
//            System.out.println("출근");
//            System.out.println("근무중");
//        });
//        le.action(()-> System.out.println("퇴근")); //문장 하나는{} 생략 가능
//    }

//        //매개변수 있는 람다
//        LamdaExample le = new LamdaExample();
//        le.action((name, job) -> {
//            System.out.println(name);
//            System.out.println(job);
//        });
//        le.action((name, job) -> System.out.println(name + "의 직업은 " + job));

        //리턴값 있는 람다
//        LamdaExample le = new LamdaExample();
//        double result = le.action((x,y) -> x + y);
//        System.out.println("합: " + result);

//        //??정적 메소드와 인스턴스 메소드 참조??**
//        LE l1 = LamdaExample::staticHello; //인스턴스는 객체 생성x
//        l1.hello();
//        LamdaExample obj = new LamdaExample(); //정적은 객체 필요
//        LE l2 = obj :: instanceHello;
//        l2.hello();
    }
    
    //정적 메소드와 인스턴스 메소드 참조
//    public void instanceHello(){
//        System.out.println("인스턴스 메소드 호출"); //인스턴스 메소드
//    }
//    public static void staticHello(){
//        System.out.println("정적 메소드 호출"); //정적 메소드
//    }
//    public static double action(LE le) {
//        return le.cal(10.0, 40.0);
//    }
//    public static void action(LE le){
//        le.person("홍길동","프로그래머"); //액션 데이터는 메인 밖에다!!
//    }
//    public static void action(LE le) {
//        le.work();
//    }
//    public static void action(LE le){
//        //데이터
//        int x = 10;
//        int y = 4;
//        //데이터 처리
//        le.le(10,4);
}
