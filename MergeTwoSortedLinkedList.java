// Using Collections

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
         LinkedList<Integer> merge = new LinkedList<>();
         System.out.println("Enter the No of Linked Lists:");
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        System.out.println("Enter the size of each Linked List:");
        int size = input.nextInt();
        for(int i=1;i<=k;i++)
        {
             LinkedList<Integer> Ci  = new LinkedList<>();
            System.out.println("Enter the items for the "+ i + " list");
            for(int j=0;j<size;j++){
            int item = input.nextInt();
            Ci.add(item);
            }
            merge.addAll(Ci);  
        }
       Collections.sort(merge);
       Iterator<Integer> itr = merge.iterator();
        System.out.println("Merged and Sorted List:");
       while(itr.hasNext())
       {
           System.out.print(itr.next() +" ");
       }      
    }
}
