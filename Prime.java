import java.util.*;

public class Prime {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter a Number: ");
    int n,fl=0;
    n = sc.nextInt();
    sc.close();
 
    for(int j=2; j<=n/2; j++)
    {
        if (n%j==0) 
        {
            fl=1;
            break;
        }
    }

    if(fl==0)
        System.out.println(n +" is a Prime Number");
    else
        System.out.println(n +" is not a Prime Number ");

}
}
//Output//
Enter a Number: 3
    3 is a Prime Number
Enter a Number: 9
    9 is not a prime Number
    
