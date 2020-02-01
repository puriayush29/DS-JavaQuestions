// Using Data Structures


import java.util.*;
public class Question4 
{
    static int lastAddr = 0;
    static Node head;
    static class Node {
        
        int data;
        Node next;
        Node(int d)
        {
            data = d;
        }
    }
    public static void insertItem(int item)
    {
        Node last = null;
        
        Node new_node = new Node(item);
        new_node.next = null;
        if(head == null)
        {
            head = new_node;
        }
        else
        {
            last = head;
            while(last.next!=null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
    }
    public static void merge()
    {
        Node last = head;
        while(last!=null)
        {
            System.out.print(last.data + " ");
            last = last.next;
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
                if(b.data > b.next.data)
                {
                    temp = b.data;
                    b.data = b.next.data;
                    b.next.data = temp;
                }
                b=b.next;
            }
            a=a.next;
        }
        
    }
    
    public static void main(String[] args) {      
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the No of Linked Lists:");
        int k = input.nextInt();
        System.out.println("Enter the size of each Linked List:");
        int size = input.nextInt();
        for(int i=1;i<=k;i++)
        {
            System.out.println("Enter the items for the "+ i + " list");
            for(int j=0;j<size;j++){
            int item = input.nextInt();
             insertItem(item);
            }
            
            
        }
        System.out.println("Merged and Sorted List:");
        sort();
        merge();
     
        
    }
}
