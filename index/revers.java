import java.util.Arrays;

/**
 * Created by lenovo on 16/01/2022.
 */
public class revers {
    public static void main(String[] args) {
        int []a={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        int[]after=revers(a);
        System.out.println(Arrays.toString(after));
    }
    public static int[] revers(int[]x)
    {
        int n=x.length-1;
        for (int i = 0; i < x.length/2; i++)
        {
            int tamp=x[i];
            x[i]=x[n];
            x[n]=tamp;
            n--;
            return x;
        }
        return x;
    }
    public static void print(int[]x){

    }
}
