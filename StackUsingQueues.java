
import java.util.Queue;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Question28 implements Cloneable {
    
    static void stackPush(Queue q1,Stack s1,Queue q2)
    {
       
        q2.addAll(q1);
        System.out.println("Stack is:");
        while(!q2.isEmpty())
        {
            s1.add(q2.peek());
            q2.remove();
        }
        while(!s1.isEmpty())
        {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
    static void stackPop(Queue q1,Stack s1)
    {
        System.out.println("Pop operation:");
      
        while(!q1.isEmpty())
        {
            
            s1.add(q1.peek());
            q1.remove();
        }
        while(!s1.isEmpty())
        {
            System.out.println("Popping the element "+ s1.peek());
            s1.pop();
        }
    }
    public static void main(String[] args) throws Exception {
    Queue<Integer> q1 = new LinkedList<>();   
    Queue<Integer> q2 = new LinkedList<>();
    Stack<Integer> s1 = new Stack<>();
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no elements you want to add in the stack:");
    int size = Integer.parseInt(input.readLine());
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++)
        {
            q1.add(Integer.parseInt(input.readLine()));
            
        }
        
        stackPush(q1,s1,q2);
        stackPop(q1,s1);
       
        
    }
   
}
