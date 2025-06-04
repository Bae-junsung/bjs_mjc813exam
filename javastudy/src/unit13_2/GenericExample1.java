package unit13_2;

public class GenericExample1 {
    //generic method
    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }

    public static void main(String[] args){
        //generic method 호출
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        //generic method 호출
        Box<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}
