package SimpleClass;

public class Box<T> {

    private T t;

    public Box(T t){
        this.t=t;
    }

    public T get(){
        return this.t;
    }


}
