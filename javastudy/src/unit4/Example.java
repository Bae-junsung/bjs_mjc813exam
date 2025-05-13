package unit4;
import java.util.Scanner;

public class Example {
    public static void main(String[]args) {
        //2번
        String grade = "B";
        int score1 = switch (grade) {
            case "A" -> 100;
            case "B" -> 100 - 20;
            default -> 60;
        };
        System.out.println(score1);

        //3번
        int number = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                number += i;
            }
        }
        System.out.println("3번 합: " + number);

        //4번
        while (true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            if (num1 + num2 == 5) {
                System.out.println("4번: (" + num1 + "," + num2 + ")");
                break;
            }
        }

        //**5번???
        int sum = 0;
        System.out.println("5번: 방정식의 해");
        for(int x = 1; x <= 10; x++){
            for(int y = 1; y <= 10; y++){
                sum = 4*x + 5*y;
                if(sum == 60){
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }

        //6번
        int height = 5;
        System.out.println("6번: 별삼각형");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }

        //7번
        Scanner scanner = new Scanner(System.in);
        String inputString;
        do{
            System.out.println("---------------7번--------------");
            System.out.println("1.예금  | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("--------------------------------");
            System.out.print("선택> ");
            inputString = scanner.nextLine();
            switch (inputString) {
                case "1":
                    System.out.println("10000");
                    break;
                case "2":
                    System.out.println("2000");
                    break;
                case "3":
                    System.out.println("8000");
                    break;
                default:
                    System.out.println("해당 숫자만 적으세요!!");
                    break;
            }
        } while(! "4".equals(inputString));
        System.out.println();
        System.out.println("프로그램 종료");
    }
}
