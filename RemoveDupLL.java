
import java.util.Scanner;

public class remDup {
    static private Node head;
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
        new_node.next = null;
        if(head == null)
        {
            head = new_node;
        }
        else
        {
            Node end = head;
        while(end.next!=null)
        {
            end=end.next;
        }
        end.next = new_node;   
    }
    }
    
    public static void sort()
    {
        int temp;
        Node a = head;
        while(a.next!=null)
        {
            Node b = head;
            while(b.next!=null)
            {
                if(b.value > b.next.value)
                {
                     temp = b.value;
                    b.value = b.next.value;
                    b.next.value = temp;
                }
                b=b.next;
            }
            a=a.next;
        }
    }
    public static void removeDup()
    {
       Node curr=head;
		while(curr!=null)
		{
                  Node temp=curr;
                  while(temp!=null&&temp.value==curr.value)
                 {
                   temp=temp.next;

                 }
                  curr.next=temp;
                  curr=curr.next;			
		}
        
    }
    public static void display()
    {
        Node z1 = head;
        System.out.println("The Linked List is:");
        while(z1!=null)
        {
            System.out.println(z1.value);
            z1=z1.next;
        }
        
    }
public static void main(String[] args) {
        remDup li = new remDup();
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of linked list:");
        size = input.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++){
            int num = input.nextInt();
         insertEnd(num);
        }
        sort();
        display();
        removeDup();
        display();
    }
}
