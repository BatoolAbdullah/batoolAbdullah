import java.util.Scanner;

/**
 * Created by lenovo on 16/03/2022.
 */
public class tsetList {
    public static void main(String[] args) {
        SinglyLinkedList<Integer>List=new SinglyLinkedList<>();
        Scanner in=new Scanner(System.in);
        System.out.println("1/add frirt\n2/add last\n 3/remove frist \n 0/exit");
        int choice=-1;
        while (choice!=0)
        {
            
            System.out.println("entr the number");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("enter the number");
                    Object list;
                    List.addfirst();
                    System.out.println("frist number ="+list.frist()+"\tlast number="+""list.last()+"\t size="+list.size);
                    break;
                case 2:
                    System.out.println("enter the number");
                    list.addfirst(in.nextInt());
                    System.out.println("frist number ="+list.frist()+"\tlast number="+""list.last()+"\t size="+list.size);
                    break;
                case 3:
                    System.out.println("enter the number");
                    list.addfirst(in.nextInt());
                    System.out.println("frist number ="+list.frist()+"\tlast number="+""list.last()+"\t size="+list.size);
                    break;
                
            }
            
        }
        
    }
}
