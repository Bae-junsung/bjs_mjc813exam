package date_0617;

public class Lamda {
    @FunctionalInterface
    public interface INumberProc{
        //추상 메소드
        public void process(String str, Integer age);
    }
    @FunctionalInterface
    public interface IArrayProc {
        //추상 메소드
        Long process(java.util.List<Integer> list);
    }
}
