package date_0613;

public class StringBuilderExample {
    public static void main(String[] args){
        String data = new StringBuilder() //data.이런식 아님!!
                .append("DEF")
                .insert(0, "ABC")
                .delete(3, 4) // 뒤에 숫자는 미만
                .append("GH")
                .delete(5, 6)
                .insert(6,"Q")
                .replace(0,2, "AA") // 뒤에 숫자는 미만
                .toString();
        System.out.println(data);
    }
}
