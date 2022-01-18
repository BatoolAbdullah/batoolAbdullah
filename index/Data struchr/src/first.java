import java.util.Scanner;

/**
 * Created by lenovo on 09/01/2022.
 */
public class first {
    public static void main(String[] args)
    {
        System.out.println("holle world");
        int arr[]=new int[3];
        Scanner input=new Scanner(System.in);

       for (int i = 0; i <arr.length ; i++)
        {
            //ال
            // عنصر الذي داخل المصفوفه arr[i]
          //  System.out.println(arr[i]);
          arr[i]= input.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }
};
