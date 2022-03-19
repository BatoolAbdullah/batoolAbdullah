import sun.invoke.empty.Empty;

/**
 * Created by lenovo on 23/01/2022.
 */
public interface stack1 <E>{
    boolean isEmpty();
    int size();
    E top();
    void push(E element);
    E pop();

}
