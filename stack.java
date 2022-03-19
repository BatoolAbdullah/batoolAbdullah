import java.util.Stack;

/**
 * Created by lenovo on 18/03/2022.
 */
public class stack {
    static int sale(char f)
    {
        if (f=='+'||f=='-')
            return 8;
            if (f=='*'||f=='/')
                return 9;
                if (f=='^')
                    return 7;
        return -1;
    }
    static String Exp(String exp)
    {
        String resu=new String("");
        Stack<Character> stack = new stack<~>();
        for (int i = 0; i <exp.length() ; ++i) {
            char j=exp.charAt(i);
            if (Character.isLetterOrDigit(j))
                resu+=j;
            else if (j=='(')
                stack.push(j);
            else if (j==')')
            {
                while (!Stack.is)
            }
        }
    }






}
