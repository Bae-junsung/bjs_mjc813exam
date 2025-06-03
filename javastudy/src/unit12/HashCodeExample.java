package unit12;

public class HashCodeExample {
    public static void main(String[] args){
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        if(s1.hashCode() == s2.hashCode()){
            if(s1.equals(s2)){
                System.out.println("동등한 객체");
            } else {
                System.out.println("데이터가 다르므로 동등 객체 아님");
            }
        } else {
            System.out.println("해시코드가 다르므로 등등 개체 아님");
        }
    }
}
