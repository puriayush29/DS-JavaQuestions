// using Collections

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of stack:");
        int size = input.nextInt();
        System.out.println("Enter the elements of stack:");
        for(int i=0;i<size;i++)
        {
            int num = input.nextInt();
            st.push(num);
        }
        
        Collections.sort(st);
        System.out.println("Stack is:");
        Iterator itr = st.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("Minimum element of stack is "+st.get(0));
    }
}
