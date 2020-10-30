import java.util.*;

public class Factor{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter a value for N: ");
    int x;
    x = sc.nextInt();
    sc.close();
    System.out.printf("Factors of %d  are :-",x);
    for(int i=1; i<=x; i++)
    {
        if(x%i==0)
            System.out.print(i+" ");
    }

    
}
}
//Output//
Enter a value for N: 2
    Factors of 2 are :- 0 1 2
