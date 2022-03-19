import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by lenovo on 30/01/2022.
 */
public class PrintArrayQueue {
    public static void main(String[] args) throws FileNotFoundException {
        Arrray_Qeueu_1<String>myQueue=new Arrray_Qeueu_1<>(3);
        Scanner in=new Scanner(System.in);
        System.out.println("input file names to print in console");
        for (int i = 0; i <3 ; i++) {
            myQueue.enqueu(in.next());

        }
        for (int i = 0; i <3 ; i++) {
            Scanner fileScanner=new Scanner(new File(myQueue.dequeu()));
            while (fileScanner.hasNextInt())
            System.out.println(fileScanner.nextLine());

        }
    }


}
