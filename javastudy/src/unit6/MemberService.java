package unit6;

public class MemberService {
    //15번
    boolean login(String id, String password){ //boolean은 참, 거짓
        if(id == "hong" && password == "12345"){
            return true;
        } else {
            return false;
        }
    }
    void logout(String id){
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }

    public static void main(String[] args){
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "12345");
        if(result){
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
