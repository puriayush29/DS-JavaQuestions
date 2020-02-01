// using DS

import java.util.Scanner;

/**
 *
 * @author Coder
 */
public class Question7 {
    static Node top;
    static class Node 
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
        }
    }
    public static  void push(int item)
    {
        Node n = new Node(item);
        
        if(top == null)
        {
            top = n;
        }
        else{
            
        n.next = top;
        top = n;
        }
    }
     static void pop(Node z2)       
    {
        if(top ==null)
        {
            System.out.println("Stack Underflow..");
        }
        else 
        {
            System.out.println("Data Popped "+top.data);
            top = top.next;
            pop(top);
        }
    }
    static void display()
    {
        if(top ==null)
        {
            System.out.println("stack is empty..");
        }
        Node curr = top;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    static int min()
    {
        Node curr1 = top;
        int min1 = curr1.data;
        while(curr1.next!=null)
        {
            if(min1 > curr1.next.data)
            {
                min1 = curr1.next.data;
            }
            curr1 = curr1.next;
        }
        return min1;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of stack:");
        int size = input.nextInt();
        System.out.println("Enter the elements of stack:");
        for(int i=0;i<size;i++)
        {
            int num = input.nextInt();
            push(num);
        }
//        System.out.println("Stack is:");
//        display();
//        System.out.println("Pop Operation:");
//        pop(top);
         int minimum = min();
        System.out.println("Minimum element in the stack is: "+minimum);
        
    }
}
