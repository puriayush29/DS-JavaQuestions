
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
public class Question22 {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of an array");
        int size = Integer.parseInt(input.readLine());
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<size;i++)
        {
            arr[i] = Integer.parseInt(input.readLine());
        }
        Arrays.sort(arr);
        int j=arr.length-1;
        if(j>=0){
        for(int i=0;i<arr.length;i++)
        {
             if(arr.length%2!=0){
            if(i==j)
            {
                System.out.print(",");
                System.out.println(i+1+" smallest number: "+arr[i]);
                break;
            }
          }else if(arr.length%2==0)
          {
              if(i-1 == j)
              {
                  break;
              }
          }
            System.out.print(i+1+" smallest number: "+arr[i]+" ");
            System.out.print(",");
            System.out.print(i+1+" largest number: " + arr[j]+" ");
            if(i<(arr.length/2-1)){
            System.out.print(",");
            }
            j--;
            
            
        }
        }
        
    }
}
