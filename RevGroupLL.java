// Reversing the LinkedList for group size k...
import java.util.Scanner;

/**
 *
 * @author Coder
 */
public class Question3 {
   static Node head;
   static int count = 0;
    static class Node
    {
        int value;
        Node next;
        Node(int d)
        {
            value = d;
        }
    }
    public static void insertEnd(int item)
    {
        Node new_node = new Node(item);
        new_node.next= null;
        if(head == null)
        {
            head = new_node;
        }
        else
        {
            Node last = head;
            while(last.next!=null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
    }
    public static void display(int count)
    {
        Node curr=head;
        while(count!=0)
        { if(curr!=null)
        {
            curr= curr.next;
        }
        count--;
        }
        while(curr!=null)
        {
            System.out.println(curr.value);
            curr=curr.next;
        }
    }
    public static int reverse(Node curr,int k)
    {
       
        if(k==0)
        {
           return 0;
        }
        else if(curr!=null){
          count++;
           reverse(curr.next,k-1);
           System.out.println(curr.value); 
           
        }
        
       return count;
    }
    public static void main(String[] args) {
        Question3 li = new Question3();
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of linked list:");
        size = input.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++){
            int num = input.nextInt();
         insertEnd(num);
        }
        System.out.println("Enter the group size to reverse respectively:");
        int k=input.nextInt();
       int count=reverse(head,k);
       
        display(count);
        
    }
}
