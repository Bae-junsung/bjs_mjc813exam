package unit13_2;

public class Box<T> {
    //필드
    private T t;

    //Getter method
    public T get(){
        return t;
    }

    //Setter method
    public void set(T t){
        this.t = t;
    }
}
