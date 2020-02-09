
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Question26 {
    static Queue front; 
   static Queue front1;
   static int flag = 0;
       static class Queue {
        int data;
        Queue next;
        Queue(int d)
        {
            data = d;
        }
    }
    static void enqueue(int data)
    {
        Queue new_element = new Queue(data);
        new_element.next = null;
        if( front == null)
        {
            front = new_element;
        }
        else
        {
            Queue curr = front;
            {
                while(curr.next!=null)
                {
                    curr = curr.next;
                }
                
            }
            curr.next = new_element;
        }
    }
    static void dequeue(Queue front)
    {
        flag =1;
        System.out.println("Performing Dequeue");
        if(front == null)
        {
            System.out.println("UnderFlow");
            front1 = front;
        }
        else
        {
            System.out.println(front.data + " element popped");
            front = front.next;
            dequeue(front);
        }
    }
    static void display()
    {
        System.out.println("Queue is:");
        Queue curr= front;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    static void frontQueue()
    {
        if(flag == 1)
        {
            if(front1 == null)
                System.out.println("No front element is present because Queue is empty");
        }
        else if( flag ==0){
            System.out.println("Front element is: " +front.data);
        
        }
    }
    static void rearQueue()
    {
        if(flag ==1)
        {
            if(front1 == null){
            System.out.println("No Rear element is present because Queue is empty");
            }
        }
        else if( flag ==0){
        
        
        Queue curr = front;
        while(curr.next!=null)
        {
            curr = curr.next;
        }
        System.out.println("Rear element is: "+curr.data);
    }
        
    }
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of Queue:");
        int size = Integer.parseInt(input.readLine());
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++)
        {
            enqueue(Integer.parseInt(input.readLine()));
        }
        display();
        frontQueue();
        rearQueue();
        dequeue(front);
        frontQueue();
        rearQueue();
                
    }
}
