import java.util.Scanner;

/**
 * Created by lenovo on 06/02/2022.
 */
public class TestList {
    public static void main(String[] args) {
        singleLinkedList<String>list=new singleLinkedList<>();
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <4 ; i++) {
            list.addlaest(in.next());
            System.out.println("first"+list.first()+"\tlast="+list.last()+"\tsize"+list.size);

        }
        while (!list.isEmpty())
            System.out.println(list.removeFrist()+"\t");
    }
}
