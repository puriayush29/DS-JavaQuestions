
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Question25 {
    private static Node top;
    static Node top1;
   static class Node
    {
        int data;
        Node next;
        Node(int d)
            
        {
            data = d;
        }
    }
    static void push(int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
        if(top == null)
        {
            top = new_node;
        }
        else
        {
            new_node.next = top;
            top = new_node;
        }
                
    }
    static void pop(Node top)
    {
        if(top == null)
        {
            System.out.println("Stack Underflow");
            top1 = top;
        }
        else
        {
            System.out.println(top.data + " Element Popped");
            top = top.next;
            pop(top);
            
        }
         
    }
      static void display()
    {
        if(top == null){
            System.out.println("No element is present in stack");
        }
        Node curr = top;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr= curr.next;
        }
    }
    //  checking that element is present in stack or not after popping
    static void isEmpty()
    {
        if(top1 == null){
            System.out.println("No element is present in stack");
        }
        Node curr = top1;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr= curr.next;
        }
    }
    static void peek()
    {
        if(top == null)
        {
            System.out.println("No element present");
        }
        else
        {
            System.out.println("Top element is:");
            System.out.println(top.data);
        }
    }
        public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the size of stack:");
        int size = Integer.parseInt(input.readLine());
            System.out.println("Enter the elements you want to push:");
        for(int i=0;i<size;i++)
        {
            push(Integer.parseInt(input.readLine()));
        }
            System.out.println("Stack is:");
       display();
        pop(top);
        isEmpty();
        peek();
    }
}
