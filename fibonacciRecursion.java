
public class Question18 {
    
    public static int fibo(int num)
    {
        if(num<=1)
        {
            return num;
        }
        else
        {
            return fibo(num-1) + fibo(num-2);
        }
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     int num = input.nextInt();    
    int result = fibo(num);
        System.out.println("fibonacci: "+ result );
    }
}
