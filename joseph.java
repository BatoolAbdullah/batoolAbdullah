/**
 * Created by lenovo on 19/03/2022.
 */ 
public class joseph {


        static int josephus(int n,int k) {
            if (n == 1)
                return 1;
            else
                 /*///The position returned by josephus(n-k) consider the
               //recursive call josephus(n-k)considers the original
                 //position k%n+1 as position 1*/
                return (josephus(n - 1, k) + k - 1) % n + 1;}

        public static void main(String[] args) {
            int n = 14;
            int k = 2;
            System.out.println("the chosen place is");
            System.out.println();
            System.out.println(josephus(n, k));

        }

    }


