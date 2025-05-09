package com.mjc.studyjava;

public class MyMathMathic {
    //상술연산 하는 멤버메소드 5개 생성
    public int add(int a, int b){
        return a + b; //덧셈
    }
    public int sub(int a, int b){
        return a - b; //뺄셈
    }
    public long mul(int a, int b){
        return a * b; //곱셈
    }
    public int divM(int a, int b){
        return a / b; //나눗셈 몫
    }
    public int divN(int a, int b){
        return a % b; //나눗셈 나머지
    }
    //비교연산 하는 멤버메소드 4개 생성
    public boolean same(int a, int b){
        return a == b; //두수가 같으면 true 리턴, 아니면 false
    }
    public boolean same(String a, String b) {
        return a.equals(b); //두 문자열이 같으면 true 리턴, 아니면 false
    }
    public boolean notSame(int a, int b) {
        return a != b; //두수가 다르면 true 리턴, 아니면 false
    }
    public boolean big(int a, int b) {
        return a > b; //a가 b보다 크면 true 리턴, 아니면 false
    }
    public boolean small(int a, int b) {
        return a < b; //a가 b보다 작으면 true 리턴, 아니면 false
    }
    //기타연산 하는 멤버메소드
    public int shiftLeft(int a, int b){
        return a << b; //a를 b 만큼 왼쪽 시프트 결과 값을 리턴
    }
    public int shiftRight(int a, int b){
        return a >> b; //a를 b 만큼 오른쪽 시프트(부호유지) 결과 값을 리턴
    }
    public int shiftRight0(int a, byte b) {
        return a >>> b; //a를 b 만큼 오른쪽 시프트(부호를0으로) 결과 값을 리턴
    }
    public long square(int a, byte b) {
        long result = 1;
        for(int i = 0; i < b;i++){
            result *= a;
        }
        return result; // a를 b만큼 제곱한 결과 값을 리턴, *= 이용하여 코딩하세요??
    }
    public int absolute(int a) {
        return (a < 0) ? -a : a;//a의 절대값을 리턴??
    }
    public String toHex(int a) {
        return Integer.toHexString(a); //a 값을 16진수 문자열로 리턴
    }
    public String toBin(int a) {
        return Integer.toBinaryString(a); //a 값을 2진수 문자열로 리턴
    }
    public String toOct(int a) {
        return Integer.toOctalString(a); //a 값을 8진수 문자열로 리턴
    }
    public int toDec(String a) {
        return Integer.parseInt(a, 10); //a 문자열을 10진수 정수로 리턴
    }
    public static void main(String[] args){
        MyMathMathic math = new MyMathMathic();

        // 산술 연산
        System.out.println("덧셈: " + math.add(10, 5));
        System.out.println("뺄셈: " + math.sub(10, 5));
        System.out.println("곱셈: " + math.mul(10, 5));
        System.out.println("나눗셈(몫): " + math.divM(10, 3));
        System.out.println("나눗셈(나머지): " + math.divN(10, 3));

        // 비교 연산
        System.out.println("같은 수인지: " + math.same(10, 5));
        System.out.println("같은 문자열인지: " + math.same("hello", "hi"));
        System.out.println("다른 수인지: " + math.notSame(10, 5));
        System.out.println("a가 b보다 큰가: " + math.big(10, 5));
        System.out.println("a가 b보다 작은가: " + math.small(3, 10));

        // 기타 연산
        System.out.println("왼쪽 쉬프트: " + math.shiftLeft(2, 3));
        System.out.println("오른쪽 쉬프트: " + math.shiftRight(16, 3));
        System.out.println("0으로 채우는 오른쪽 쉬프트: " + math.shiftRight0(-16, (byte) 2)); //byte?
        System.out.println("거듭제곱: " + math.square(2, (byte) 4)); //byte?
        System.out.println("절대값: " + math.absolute(-10));
        System.out.println("16진수 표현: " + math.toHex(15));
        System.out.println("2진수 표현: " + math.toBin(10));
        System.out.println("8진수 표현: " + math.toOct(8)); //8진수 헷갈림
        System.out.println("문자열의 10진수 변환: " + math.toDec("1234"));
    }
}
