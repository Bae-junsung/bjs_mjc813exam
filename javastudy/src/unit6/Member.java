package unit6;

public class Member {
    //13, 14번
    String name;
    String id;
    String password;
    int age;

    public Member(String name, String id){
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args){
        Member user1 = new Member("홍길동", "hong");
        System.out.println("이름: " + user1.name + "\n아이디: " + user1.id);
    }
}
