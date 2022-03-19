/**
 * Created by lenovo on 30/01/2022.
 */
public interface Qeueu<E> {
    boolean isEmpty();
    int size();
    void  enqueu(E elemant);
    E dequeu();
    E first();
}
