import java.util.Arrays;

/**
 * Created by lenovo on 16/03/2022.
 */
public class copyarrey {

    public static int[]copy()
    {
        int[]u={45,98,67,25,76};
        int[]q=new int[u.length];
        q=u;
        return q;
    }
    public static void main(String[] args) {
        System.out.println("copyarray="+ Arrays.toString(copy()));
    }
}
