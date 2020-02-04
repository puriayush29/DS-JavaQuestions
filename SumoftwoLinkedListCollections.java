// using collections
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Question9 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of testcases:");
    int t = input.nextInt();
    int number = 0;
    int number1 =0;
    for(int i=1;i<=t;i++)
    {
       LinkedList<Integer> l1 = new LinkedList<>();
     System.out.println("Enter the length of first linked list:");
       int num = input.nextInt();
       System.out.println("Enter the elements of first linked list"); 
       for(int j=0;j<num;j++)
       {
           int data =input.nextInt();
           l1.add(data);
       }
       LinkedList<Integer> l2 = new LinkedList<>();
        System.out.println("Enter the length of second linked list:");
       int num1 = input.nextInt();
       System.out.println("Enter the elements of second linked list"); 
       for(int j=0;j<num1;j++)
       {
           int data =input.nextInt();
           l2.add(data);
       }
       Iterator itr = l1.iterator();
       while(itr.hasNext())
       {
           int n1 ;
           
           n1 = (int) itr.next();
           number = number*10 + n1;
            
       }
       
        Iterator itr1 = l2.iterator();
       while(itr1.hasNext())
       {
           int n1 ;
           n1 = (int) itr1.next();
           number1 = number1*10 + n1;
            
       }
       
        int sum = number + number1;
        System.out.println(sum);
        LinkedList<Integer> l3 = new LinkedList<>();
        while(sum>0)
        {
            int rev = sum %10;
            sum = sum/10;
            l3.add(rev);
        }
        Iterator itr2 = l3.iterator();
        System.out.print("Resultant Linked List:");
        while(itr2.hasNext())
        {
            System.out.print(itr2.next() + " ");
        }
        number1 = 0;
        number = 0;
        
    }
    }
   
}
