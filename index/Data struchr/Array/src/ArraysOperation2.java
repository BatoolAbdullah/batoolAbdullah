import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lenovo on 16/01/2022.
 */
public class ArraysOperation2
{
    int []x;
    int numOfElements;
    public ArraysOperation2(){
        x=new int[5];
        numOfElements=0;

    }
    public int deletElemant()
    {
        if(numOfElements>0)
        {
            x[numOfElements-1]=-1;
            numOfElements--;
            return 0;
        }
        return -1;
    }
    public int addSortElemant(int e)
    {
        if (numOfElements<x.length)
        {
            int i=numOfElements;
            while (i>0 && e<x[i-1])
            {
                x[i]=x[i-1];
                i--;
            }
            x[i]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }
    public int addElemant(int e)
    {
        if(numOfElements<x.length)
        {
            x[numOfElements]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArraysOperation2 test=new ArraysOperation2();
        Scanner in=new Scanner(System.in);
        System.out.println(Arrays.toString(test.x));
        System.out.println("input elemant");
        for (int i = 0; i <7 ; i++)
        {
            if (test.addSortElemant(in.nextInt())==0)
                System.out.println("added sucessfully");
            else
                System.out.println("array is full");
            System.out.println(Arrays.toString(test.x));
        }
        for (int i = 0; i <1; i++)
        {
            if (test.deletElemant()==0)
                System.out.println("delet suaessfully");
            else
                System.out.println("arrey is empty");
            System.out.println(Arrays.toString(test.x));

        }
    }
}
