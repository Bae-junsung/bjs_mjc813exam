package unit12;
import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String[] args){
        double num = 1234567.89;

        DecimalFormat df;

        //정수 자리까지 표시
        df = new DecimalFormat("#,###");
        System.out.println(df.format(num));

        //무조건 소수 첫째 자리까지 표시
        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(num));
    }
}
