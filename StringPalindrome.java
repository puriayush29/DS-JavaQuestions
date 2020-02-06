
import java.util.Scanner;

/**
 *
 * @author Coder
 */
public class Question17 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
        System.out.println("Enter the String:");
    String str = input.next();
    char[] ch = str.toCharArray();
    int flag =0;
    for(int i=0;i<ch.length;i++)
    {
        for(int j= ch.length-1;j>=0;j--)
        {
            if(ch[i] == ch[j])
            {
                flag = 1;
            }
            else
            {
                flag =0;
                break;
            }
            i++;
        }
        if( flag ==0)
        {
            break;
        }
    }
    if(flag ==1)
    {
        System.out.println("Palindrome");
    }
    else
    {
        System.out.println("Not a Palindrome");
    }
    
    
    }
    
}
