import java.util.Arrays;

/**
 * Created by lenovo on 16/03/2022.
 */
public class random {
    public static int[] fl(int[]t)
    {
        random g = new random();

      int  intdex = g.nextlnt(t.length-1);
        System.out.println(intdex);
        for (int i = 0; i <t.length ; i++) {
            if (intdex<=i)
            {
                t[i]=-1;
            }


        }
        return t;
    }

    public static void main(String[] args) {
        int[]a={77,89,78,98,95};
        System.out.println(Arrays.toString(fl(a)));
    }

    private int nextlnt(int i) {

        return 0;
    }

}
