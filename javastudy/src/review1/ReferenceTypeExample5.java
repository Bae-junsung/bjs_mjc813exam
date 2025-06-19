package review1;

public class ReferenceTypeExample5 {
    public static void main(String[] args){
//        int[] arr1;
//        int[] arr2;
//        int[] arr3;
//        arr1 = new int[] {1,2,3}; //new int할 것!!(주소는 다 다름)
//        arr2 = new int[] {1,2,3};
//        arr3 = arr2;
//        System.out.println(arr1 == arr2); //주소 여부
//        System.out.println(arr2 == arr3);
//       //**Null 예외 해결 1** -> Null 체크 필수!!
//       int[] a = null;
//       if(a != null) {
//           System.out.println(a.length); //Null 해결
//       }
//       String str = null;
//       if(str != null) {
//           System.out.println(str.length());
//       }
//        //Null 예시2
//        String hobby = "여행";
//        hobby = null;
//        String r1 = "자동차";
//        String r2 = r1;
//        r1 = null; //위치 중요
//        System.out.println("r1은 " + r1);
//        System.out.println("r2는 " + r2);
//        //String 타입(참조,문자열은 안에것이 같은지 비교!!, 만약 두 변수 같으면 주소 동일!!)
//        String a = "홍길동";
//        String b = "홍길";
//        if(a == b){
//            System.out.println("참조 같음"); //주소
//        }else{
//            System.out.println("참조 다름");
//        }
//        if(a.equals(b)){
//            System.out.println("문자열 같음"); //문자열
//        }else{
//            System.out.println("문자열 다름");
//        }
//        String c = new String("홍길동");
//        if(a == c){
//            System.out.println("참조 같음");
//        }else{
//            System.out.println("참조 다름");
//        }
//        if(a.equals(c)){
//            System.out.println("문자열 같음");
//        } else{
//            System.out.println("문자열 다름");
//        }
//        //*문자열 추출-> charAt()!!,길이->length(),대체->replace()
//        String a = "자바 프로그래밍 ";
//        System.out.println(a.length()); //길이
//        System.out.println(a.charAt(0)); //특정 위치 원소 출력
//        System.out.println(a.replace("자바", "JAVA")); //원소 인덱스 교체
//        System.out.println(a); //그래도 구가 출력!1
//        String b = a.replace("자바", "JAVA");
//        System.out.println(b); //바뀐걸로 출력!!
//       //*문자열 자르기-> substring()!!
//       String a = "880815-1234567";
//       String a1 = a.substring(0,6); //0이상 6미만! 앞 출력!!
//       System.out.println(a1);
//       String a2 = a.substring(7); //0~7까지 제거! 뒤 출력!!
//       System.out.println(a2);
//        //*문자열 찾기 -> indexOf()!!
//        String a = "자바 프로그래밍";
//        int location = a.indexOf("자바");
//        System.out.println(location); //위치 출력
//        if(location == -1){
//            System.out.println("해당 단어가 없습니다");
//        } else{
//            System.out.println("해당 단어가 있습니다.");
//        }
//        String sen = a.substring(location); //문장 전체 출력!!
//        System.out.println(sen);
//        //*문자열 분리 -> split()!!
//        String a = "3학년,1반,배준성";
//        String[] tokens = a.split(","); //[]선언 조심!
//        System.out.println("학년: " + tokens[0]);
//        System.out.println("반: " + tokens[1]);
//        System.out.println("이름: " + tokens[2]);
//     //***배열***
//     int sum = 0;
//     int[] num={1,2,3}; //암기
//     System.out.println(num[0]);
//     System.out.println(num[1]);
//     System.out.println(num[2]);
//     num[1]=5; //위치 원소 바꿀때!
//     System.out.println(num[1]);
//     //***배열 합과 평균***
//     int[] scores = {1,2,3,4,5};
//     int sum = 0;
//     for(int i=0; i<scores.length; i++){
//         sum += scores[i];
//     }
//     System.out.println("원소의 합: " + sum);
//     double avg = sum / scores.length;
//     System.out.println("원소의 평균: " + avg);
//        //*객체 참고 배열
//      String[] str = new String[3];
//      str[0] = "JAVA";
//      str[1] = "JAVA";
//      str[2] = new String("JAVA");
//      System.out.println(str[0] == str[1]);
//      System.out.println(str[0] == str[2]);
//      System.out.println(str[0].equals(str[2]));
//      //**배열 복사**
//      int[] a1 = {1,2,3};
//      int[] a2 = new int[5];
//      for(int i=0; i<a1.length; i++){
//          a2[i] = a1[i];
//          System.out.println(a1[i]);
//      }
//      for(int i=0; i<a2.length; i++){
//          System.out.println(a2[i]); //복사(남는 곳은 0)
//      }
//        //**enum(열거형, 변하지 x)**
//        enum date {월 ,화 ,수 ,목 ,금}//조심!
//        date week = date.금;
//        switch (week){
//            case 월:
//            case 수:
//            case 금:
//                System.out.println("공부해");
//                break;
//            case 화:
//            case 목:
//                System.out.println("휴식!!");
//                break;
//        }
    }
}
