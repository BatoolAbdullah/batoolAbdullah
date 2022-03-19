/**
 * Created by lenovo on 30/01/2022.
 */
public class Arrray_Qeueu_1<E> implements Qeueu<E>{


    E [] data;
    int f=0;
    int sz=0;
    static final int CAPACITY=100;


    public Arrray_Qeueu_1(int c) {
        data= (E[]) new Object[c];
    }

    public Arrray_Qeueu_1() {this(CAPACITY);
    }


    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public void enqueu(E elemant) {
if (size()==data.length)
    throw new IllegalStateException("Qeueu is full");
    int index = (f+sz)%data.length;
    data[index]=elemant;
    sz++;

    }

    @Override
    public E dequeu() {
       if (isEmpty())return null;
        E x=data[f];
        data[f]=null;
        f=(f+1)%data.length;
        sz--;
        return x;
    }

    @Override
    public E firsy() {
        if (isEmpty())
        return null;
        return data[f];
    }
}
