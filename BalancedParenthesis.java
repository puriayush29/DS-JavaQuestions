
import java.util.Scanner;
import java.util.Stack;


public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int flag =0;
    
        System.out.println("Enter the no. of testcases:");
    int testcase = input.nextInt();    
        for(int j=0;j<testcase;j++){
        System.out.println("Enter the String:");
        String str = input.next();
        Stack<Integer> stack = new Stack<>();
        for(int i= 0;i<str.length();i++)
        {
            if(str.charAt(i) == '(')
            {
                stack.push(i);
            }
            else
            {
                if(str.charAt(0) == ')'){
                    System.out.println("Stack is Empty");
                   flag = 0;
                    break;
                }
                else {
                stack.pop();
                }
            }
            if(stack.empty())
            {
                flag = 1;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }
        flag =0;
        }
    }
}
