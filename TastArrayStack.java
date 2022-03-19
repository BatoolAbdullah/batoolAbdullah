import java.util.Scanner;

/**
 * Created by lenovo on 23/01/2022.
 */
public class TastArrayStack {
    public static void main(String[] args) {
        ArrayStack<Integer>myStack=new ArrayStack<>(5);
        Scanner in=new Scanner(System.in);
        System.out.println("input integer elements");
        System.out.println("is the stack empty?"+myStack.isEmpty());
        for (int i = 0; i < 5; i++) {
            System.out.println("deleted elemant is="+myStack.pop());
            System.out.println("top elemant after pop is"+myStack.top());
            System.out.println("size of stack"+myStack.isEmpty());
        }
    }

}
