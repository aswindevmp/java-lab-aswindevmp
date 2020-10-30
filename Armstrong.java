import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a Number : ");
        int num=0,rem=0,org=0,res=0;
        num = sc.nextInt();
        sc.close();
        org=num;
        while(org!=0)
        {
            rem=org%10;
            res+=(rem*rem*rem);
            org/=10;
        }
        if(num==res)
            System.out.println(num+" is Armstrong Number");
        else
            System.out.println(num+" is Not Armstrong Number");
    

    }
}
//output//
 Enter a Number : 2
     2 is Not Armstrong Number
 Enter a Number : 0
     0 is Armstrong Number
