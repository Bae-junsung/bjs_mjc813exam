package date_0616;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    //hashCode 재정의
    @Override
    public int hashCode(){
        return name.hashCode() + age;
    }

    // equals 재정의
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Member target) {
            return target.name.equals(this.name) && (target.age == this.age);  // 수정된 부분
        } else {
            return false;
        }
    }
}
