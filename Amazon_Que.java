
import java.util.Collections;

import java.util.LinkedList;

import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of linked lists:");
        int size = input.nextInt();
        LinkedList<Integer> l1 = new LinkedList<>();
        
        for(int i=1;i<=size;i++)
        {
            
            System.out.println("Enter the elements for Linked List " + i);
            
            String name = input.next() + input.nextLine();
            String str[] = name.split(" ");
            
            for(int j=0;j<str.length;j++)
            {
                System.out.println(str[j]);
                 l1.add(Integer.parseInt(str[j]));
            }
            
        }
        Collections.sort(l1);
        for(int j=0;j<l1.size();j++)
        {
            System.out.print(l1.get(j) + " ");
        }
    }
}
