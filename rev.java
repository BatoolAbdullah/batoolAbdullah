import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by lenovo on 16/03/2022.
 */
public class rev {
    public static void main(String[] args) {
        int[]b={1,2,38,6,4,9};
        int[]p=b;
        System.out.println("g="+ Arrays.toString(b));
        System.out.println("p="+Arrays.toString(rev(p)));

    }
    public static int[]rev(int[]r)
    {
        int v=r.length-1;
        for (int i = 0; i <r.length/2 ; i++) {
            int l=r[i];
            r[i]=r[v-i];
            r[v-i]=l;

        }
        return r;
    }
}
