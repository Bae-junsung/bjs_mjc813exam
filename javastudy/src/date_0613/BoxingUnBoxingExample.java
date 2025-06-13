package date_0613;

public class BoxingUnBoxingExample {
    public static void main (String[] args){
        //Boxing
        Integer obj = 150;
        System.out.println("Value: " + obj);

        //UnBoxing
        int value = obj;
        System.out.println("Value: " + obj);

        //연산은 UnBoxing!
        int result = obj + 350;
        System.out.println("Result: " + result);
    }
}
