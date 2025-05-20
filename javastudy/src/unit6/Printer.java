package unit6;

public class Printer {
    //16번 ,17번(void 앞에 static만 붙이면 동일)
    void println(int value){
        System.out.println(value);
    }
    void println(boolean value){
        System.out.println(value);
    }
    void println(double value){
        System.out.println(value);
    }
    void println(String value){
        System.out.println(value);
    }
    public static void main(String[] args){
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}
