package unit13_2;

public class GenericExample2 {
    //제한된 타이 파라미터를 갖는 제너릭 메소드
    public static <T extends Number> boolean compare(T t1, T t2){
        //T의 타입을 출력
        System.out.println("compre(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");

        //Number의 method 이용
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return (v1 == v2);
    }

    public static void main(String[] args){
        //generic method 호출
        boolean result1 = compare(10, 20);
        System.out.println(result1);
        System.out.println();

        //generic method 호출
        boolean result2 = compare(4.5, 4.5);
        System.out.println(result2);
    }
}
