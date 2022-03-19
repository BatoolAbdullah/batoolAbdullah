import java.util.Scanner;

/**
 * Created by lenovo on 30/01/2022.
 */
public class TestQeueu {
    public static void main(String[] args) {
        Arrray_Qeueu_1<Character>q=new Arrray_Qeueu_1<>(5);
        Scanner in=new Scanner(System.in);
        System.out.println("input queue elemant");
        for (int i = 0; i <6 ; i++) {
            q.enqueu(in.next().charAt(0));
            System.out.println("first"+q.first());
            System.out.println("size"+q.size());
        }
        while (!q.isEmpty()){
            System.out.println(q.dequeu()+"\t");
        }
    }
}
