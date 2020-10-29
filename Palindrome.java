
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a Number : ");
        int x=0,rem=0,org=0,rev=0;
        x = sc.nextInt();
        sc.close();
        org=x;
        while(x!=0)
        {
            rem=x%10;
            rev=(rev*10)+rem;
            x/=10;
        }
        if(org==rev)
            System.out.println(org+" is a Palindrome");
        else
            System.out.println(org+" is Not a Palindrome");
    

    }
}
