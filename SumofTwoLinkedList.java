
import java.util.Scanner;


public class Question8 {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
        }
    }
     static Question8 insert(Question8 list,int item)
    {
        
        
        Node new_node = new Node(item);
        new_node.next = null;
        if(list.head==null)
        {
            list.head = new_node;
            return list;
        }
        else
        {
            Node last = list.head;
            while(last.next!=null)
            {
                last = last.next;
                
            }
            last.next = new_node;
            return list;
        }
       
        
        
    }
     public static Question8 calSum(Question8 l1,Question8 l2)
     {
         int sum1=0,sum2=0,sum=0;
         Node curr = l1.head;
         while(curr!=null)
         {
             sum1 = sum1*10 + curr.data;
             curr= curr.next;
         }
         
         Node curr1 = l2.head;
         while(curr1!=null)
         {
             sum2 = sum2*10 + curr1.data;
             curr1 = curr1.next;
         }
         Question8 l3 = new Question8();
         sum = sum1+sum2;
         int rev;
         while(sum>0)
         {
             rev = sum%10;
             sum=sum/10;
             insert(l3,rev);
         }
         return l3;
     }
    static void printList(Question8 list)
    {
        Node curr = list.head;
        while(curr!=null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        
    }
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of testcases:");
        int t = input.nextInt();
        for(int i=1;i<=t;i++)
        {
            Question8 l1 = new Question8();
            Question8 l2 = new Question8();
            System.out.println("Enter the length of first linked list:");
            int num = input.nextInt(); //number of elements in linked list...
             System.out.println("Enter the elements of first linked list"); 
            for(int j=0;j<num;j++)
            {
                int data = input.nextInt();
                insert(l1,data);
            }
            System.out.println("Enter the length of second linked list:");
            int num1 = input.nextInt(); //number of elements in linked list...
            System.out.println("Enter the elements of second linked list");            
           for(int j=0;j<num1;j++)
            {
                int data = input.nextInt();
                insert(l2,data);
            }
           Question8 l3 = new Question8();
           l3 = calSum(l1,l2);
           printList(l3);
            System.out.println();
        }
        
        
    }
    
}
