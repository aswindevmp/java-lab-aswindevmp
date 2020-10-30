import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a value for X: ");
        int x,factorial=1;
        x = sc.nextInt();
        sc.close();
        for(int j=1; j<=x; j++)
        {
            factorial*=j;
            System.out.println("Factorial Of "+j+" is "+factorial);
        }

    }
}
// Output //
Enter a value for X: 3
    Factorial of 1 is 1
    Factorial of 2 is 2
    Factorial of 3 is 6
