
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question27 {
    static deque itr;
    static int count=0,countExtra=0;
  static class deque
    {
        int data;
        deque next;
        deque(int d){
            data =d;
        }
    }
  static void insert(int data)
  {
      
      deque new_element = new deque(data);
      new_element.next = null;
      if(itr == null)
      {
          itr = new_element;
      }
      else
      {
       deque curr = itr;
       while(curr.next!=null)
       {
           curr = curr.next;
       }
       curr.next = new_element;
      }
      count++;
  }
  static void insertLast(int data)
  {
      deque new_element = new deque(data);
      new_element.next = null;
      if(itr == null)
      {
          itr = new_element;
      }
      else
      {
       deque curr = itr;
       while(curr.next!=null)
       {
           curr = curr.next;
       }
       curr.next = new_element;
      }
      count++;
      countExtra++;
  }
  static void insertFirst(int data)
  {
      deque new_element = new deque(data);
      if(itr == null)
      {
          itr = new_element;
      }
      else
      {
          new_element.next = itr;
          itr = new_element;
      }
      count++;
      countExtra++;
  }
  static void printDeque()
  {
      System.out.println("Printing Deque:");
      deque curr = itr;
      while(curr!=null)
      {
          System.out.println(curr.data);
          curr = curr.next;
      }
  }
  static void deleteFront()
  {
      if(itr == null)
      {
          System.out.println("Deque is already empty");
      }
      else
      {
          System.out.println("First element deleted");
          itr = itr.next;
      }
      count--;
  }
  static void deleteLast()
  {
      if(itr == null)
      {
          System.out.println("Deque is already empty");
      }
      else
      {
          deque curr = itr;
          while(curr.next.next!=null)
          {
              curr= curr.next;
          }
          System.out.println("Last element deleted");
          curr.next = null;
          
      }
      count--;
  }
  
  static void getFront()
  {
      if(itr == null)
      {
          System.out.println("Deque is empty");
      }
      else
      {
          System.out.println("Front element is: "+itr.data);
      }
  }
  static void getLast()
  {
      
      if(itr == null)
      {
          System.out.println("Deque is empty");
      }
      else
      {
          deque curr = itr;
          while(curr.next!=null)
          {
              curr= curr.next;
          }
          System.out.println("Last element is:" + curr.data);
      }
  }
  static void isEmpty()
  {
      if(itr == null)
       
      {
          System.out.println("Deque is Empty");
      }
      else
      {
          System.out.println("Deque is not Empty");
      }
  }
  static void isFull(int size)
  {
      int total = size + countExtra;
      if(count == total)
      {
          System.out.println("Deque is full");
      }
      else
      {
          System.out.println("Deque is not full and " + (total - count) + " elements can be added");
      }
  }
          public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of deque:");
        int size = Integer.parseInt(input.readLine());
              System.out.println("Enter the elements of deque:");
        for(int i=0;i<size;i++)
        {
            insert(Integer.parseInt(input.readLine()));
        }
        printDeque();
              System.out.println("Enter the element you want to insert at last:");
        insertLast(Integer.parseInt(input.readLine()));
        printDeque();
              System.out.println("Enter the element you want to insert at first:");
        insertFirst(Integer.parseInt(input.readLine()));
        printDeque();
        deleteFront();
        printDeque();
        deleteLast();
        printDeque();
        getFront();
        getLast();
        isEmpty();
        isFull(size);
    }
}
