package date_0617;

import java.util.List;
import java.util.Arrays;

public class LamdaExample {
    //1번
    public interface INumberProc {
        public void process(String str, Integer age);
    }
    public static void printHuman(INumberProc inp) {
        inp.process("홍길동", 25);
    }

    //2번
    public static void printCar(INumberProc inp){
        inp.process("BMW 520D",2020);
    }

    //3번(도움 받음)
    public interface IArrayProc {
        public Long process(List<Integer> list);
    }
    public static void sum(){
        IArrayProc iap = list -> {
            long sum = 0;
            for ( Integer n : list ) {
                sum += n;
            }
            return sum;
        };
        List<Integer> list = Arrays.asList(10,20,30,40);
        long result = iap.process(list);
        System.out.printf("합은 %d 입니다.\n", result);
    }
    //4번
    public static void avg(){
        IArrayProc iap = list -> {
            long sum = 0;
            for ( Integer n : list ) {
                sum += n;
            }
            return sum;
        };
        List<Integer> list = Arrays.asList(10,20,30,40);
        long avg = iap.process(list) / list.size() ;
        System.out.printf("평균은 %d 입니다.\n", avg);
    }

    public static void main(String[] args){
        //1번
        printHuman((str, age) -> {
            System.out.printf("%s 님의 나이는 %d 입니다.\n", str, age);
        });

        //2번
        printCar((str,age) ->{
            System.out.printf("자동차 %s 의 년식은 %d 입니다.\n", str, age);
        });

        //3번
        sum();

        //4번
        avg();
    }
}
