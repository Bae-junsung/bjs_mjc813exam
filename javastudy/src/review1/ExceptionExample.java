package review1;
//예외-> 프로그램 실행 중 발생하는 오류
//예외 처리-> 에러 나도 프로그램 실행 유지(주로 자식쪽에 코드 작성!!)
//try-catch-finally 구성(예외x->catch 건너뜀 / 예외o->catch 거쳐감!!)
//catch문 여러개 있어도 하나만 실행됨!

public class ExceptionExample {
//    public static void printLength(String data){
//        try{
//            int result = data.length();
//            System.out.println("문자 수: " + result);
//        } catch (NullPointerException e) { //Null은 뭐라도 써야 하는데 아무것도 안쓰면 에러!!
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("길이가 출력");
//        }
//    }

    public static void main(String[] args) throws Exception {
//       System.out.println("프로그램 시작");
//       printLength("Hello JAVA");
//       printLength(null);
//       System.out.println("프로그램 종료");
        
        //예제2번
//        System.out.println("클래스 검사 시작");
//        try{
//            Class.forName("date_0618.CallableSubmit");
//            System.out.println("해당 클래스가 존재");
//        } catch(ClassNotFoundException e){
//            System.out.println(e.getMessage());
//            System.out.println("해당 클래스 없음");
//        }
//        System.out.println("프로그램 종료");

        //예제 떠넘기기(하기 싫어서 미룸)
//       try {
//           new ExceptionExample().son();
//       } catch (Error e) {
//           System.out.println("엄마가 결국 할게. " + e.getMessage());
//       }
//       try {
//           new ExceptionExample().dad();
//       } catch (Error e) {
//           System.out.println("내가 걍 할게. " + e.getMessage());
//       }

    }
//    public void son() throws Error { //떠넘길때 선언은 무조건 메인 밖에서!!
//        throw new Error("아들: 안 함");
//    }
//    public void dad() throws Error{
//        throw new Error("아빠: 나도 안할꺼임");
//    }
}
