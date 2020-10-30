import java.util.*;

public class NatSum {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //Scanner for taking inputs from the keyboard
    System.out.println("Enter a value for N: ");
    int n,sum=0;
    n = sc.nextInt();
    sc.close();
    for(int i=1; i<=n; i++)
    {
        sum+=i;
    }

    System.out.printf("Sum of first %d natural no.s = %d",n,sum);
}
}
// Output //
Enter a value for N: 3
    Sum of first 3 natural no.s = 6 
