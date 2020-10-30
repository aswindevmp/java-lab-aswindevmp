import java.util.*;

public class Oddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner for taking inputs from the keyboard
        System.out.println("Enter a Number: ");
        int num;
        num = sc.nextInt();
        sc.close();
        if(num%2==0)
        {
            System.out.println(num+" is Even");
        }
        else if(num%2==1)
        {
            System.out.println(num+" is Odd");
        }
        else
            System.out.println("zero");
    }
}
// Output//
Enter a Number: 3
    3 is Odd
Enter a Number: 6
    6 is Even
Enter a Number: 0
    zero
