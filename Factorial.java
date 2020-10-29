import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a value for N: ");
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
