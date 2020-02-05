
import java.util.ArrayList;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        int flag =0;
        ArrayList<String> str = new ArrayList<>();
         ArrayList<Integer> phone = new ArrayList<>();
     Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of entries:");
     int testcase = input.nextInt();
     for(int i=1;i<=testcase;i++)
     {
         
         System.out.println("Enter the "+ i + " name:");
         String name  = input.next();
         str.add(name);
         System.out.println("Enter the " +i+ " phone no:");
         int phone1  = input.nextInt();
         phone.add(phone1);
     }
        System.out.println("Enter the no of queries:");
     int query = input.nextInt();
     for(int i=1;i<=query;i++)
     {
         System.out.println("Enter the name  to fetch the phone number corresponding to that:");
         String name_query = input.next();
         
         for(int j=0;j<str.size();j++){
             
         if(name_query.equals(str.get(j)))
         {
             System.out.println(name_query+"="+phone.get(j));
             flag = 0;
             break;
         }
         else
         {
             flag = 1;
         }
         }
         if(flag == 1)
         {
             System.out.println("Not Found");
         }
     }
    }
}
