// Using DS


import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Question23 {
    private static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
        }
    }
    static void insertEnd(int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
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
    static void insertBeg(int data)
    {
        Node new_node = new Node(data);
        if(head == null)
        {
            head = new_node;
        }
        else
        {
            
            new_node.next = head;
            head = new_node;
        }
    }
    static void insertMid(int item,int pos)
    {
        Node new_node = new Node(item); 
         if(pos == 0 || pos == 1)
        {
            new_node.next = head;
         head = new_node;
        }
         else{
             Node curr = head;
        int inc = 0;
        while(curr!=null)
        {
            curr = curr.next;
            inc ++;
            if(inc == pos-1)
            {
                break;
            }
        }
        
        new_node.next =  curr.next;
        curr.next = new_node;
         }
    }
    static void printList()
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data + " ");
            curr= curr.next;
        }
        
    }
    static void sort()      
    {
        Node a = head;
        while(a.next!=null)
        {
            Node b = head;
            while(b.next!=null)
            {
                if(b.data > b.next.data)
                {
                    int temp = b.data;
                    b.data = b.next.data;
                    b.next.data = temp;
                }
                b= b.next;
            }
            a=a.next;
        }
    }
    static void deleteByPos(int pos)
    {
        if(pos == 0 || pos == 1)
        {
            head = head.next;
        }
        else
        {
            int inc = 0;
            Node curr = head;
            while(curr!=null)
            {
                 curr = curr.next;
                 inc++;
                 if(inc == pos-1)
                 {
                     break;
                 }
            }
            curr.next = curr.next.next;
        }
    }
    static void deleteByData(int data)
    {
        if(head.data == data)
        {
            System.out.println("Element" + head.data+" deleted");
            head = head.next;
        }
        else
        {
            Node curr = head;
            while(curr!=null)
            {
                if(curr.next.data == data)
                {   
                    break;
                }
               
                curr = curr.next;
                
            }
            System.out.println("element "+curr.next.data+" deleted");
            curr.next = curr.next.next;
            
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of Linked List:");
        int size = Integer.parseInt(input.readLine());
        System.out.println("Enter the elements of Linked List:");
        for(int i=0;i<size;i++)
        {
//            insertBeg(Integer.parseInt(input.readLine()));
            insertEnd(Integer.parseInt(input.readLine()));
        }
        System.out.println("Enter the element you want to add in the linked list and its position:");
        insertMid(Integer.parseInt(input.readLine()),Integer.parseInt(input.readLine()));
        printList();
         sort();
         System.out.println();
        System.out.println("Sorted List:");
       printList();
        System.out.println();
        System.out.println("Enter the position to delete the element:");
       deleteByPos(Integer.parseInt(input.readLine()));
        System.out.println("Updated Linked List");
        
       printList();
        System.out.println();
        System.out.println("Enter the element you want to delete: ");
       deleteByData(Integer.parseInt(input.readLine()));
       printList();
        System.out.println();
    }
   
}
