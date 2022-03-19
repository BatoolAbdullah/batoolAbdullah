/**
 * Created by lenovo on 16/03/2022.
 */import java.util.Scanner;

    public class TestList {
        public static void main(String[] args) {
            SinglyLinkedList<Integer>list=new SinglyLinkedList<>();
            Scanner input=new Scanner(System.in);
            System.out.println("1-add first \n 2-add last \n 3-remove first \n 0-exit");
            int choice=-1;
            while (choice!=0) {
                System.out.print("your choice :");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("enter  number");
                        list.addfirst(input.nextInt());
                        System.out.println("first number = " + list.first() + "\tlast number = " +
                                "" + list.last() + "\t size= " + list.size());
                        break;

                    case 2:
                        System.out.println("enter a number");
                        list.addlast(input.nextInt());
                        System.out.println("first= "+list.first()+"\tlast= " +
                                ""+list.last()+"\t size= "+list.size());
                        break;

                    case 3:
                        System.out.println("Remove first  " + list.removefirst());
                        System.out.println("first= " + list.first() + "\tlast= " +
                                "" + list.last() + "\t size= " + list.size());
                        break;
                    case 0:
                        System.exit(0);
                        break;


                }

            }
        }
    }

