// using stack...
import java.util.Scanner;
import java.util.Stack;


public class Question10 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int maxlen =0;
    
        System.out.println("Enter the no. of testcases:");
    int testcase = input.nextInt();    
        for(int j=0;j<testcase;j++){
        System.out.println("Enter the String:");
        String str = input.next();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == '(')
            {
                stack.push(i);
            }
            else
            {
                stack.pop();
                if(stack.empty())
                {
                    stack.push(i);
                }
                else
                {
                    maxlen = Math.max(maxlen, i - stack.peek());
                }
            }
        }
            System.out.println("Max Length: "+maxlen);
            maxlen =0;
        }
    }
}
