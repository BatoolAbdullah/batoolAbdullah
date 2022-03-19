import java.util.Arrays;

/**
 * Created by lenovo on 16/01/2022.
 */
public class shiftlift_rotet {
    public static void main(String[] args) {
        int a[]={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        //System.out.println("after shift left");
        //System.out.println(Arrays.toString(shiftlift_rotet(a)));

        System.out.println("after shift Right");
        System.out.println(Arrays.toString(shiftRight(a)));

    }
    public static int []shiftRight(int[]y)
    {
       int t=y[y.length-1] ;
        for (int i = y.length-1; i >0 ; i--) {
            y[i]=y[i-1];
        }y[0]=t;
        return y;
    }
    public static int[]shiftlift_rotet(int[]x)
    {
        int t=x[0];
        for (int i = 0; i < x.length-1; i++)

        {
            x[i]=x[i+1];
        }
        x[x.length-1]=t;
        return x;
    }


}
