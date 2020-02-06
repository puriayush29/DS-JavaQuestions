
import java.util.Arrays;
import java.util.Scanner;

public class Question16 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
        System.out.println("Enter the size of an array:");
    int size = input.nextInt();
    int[] arr = new int[size];
    for(int i=0;i<size;i++)
    {
        arr[i]=input.nextInt();
        
    }
    Arrays.sort(arr);
        System.out.println("Array Without Duplicates:");
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i] != arr[i+1])
        {
            System.out.println(arr[i]);
        }
    }
        System.out.println(arr[arr.length-1]);
    }
   
}
