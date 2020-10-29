import java.util.*;

public class Fibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a Number: ");
        int x,s=0,fir=0,sec=1;
        x = sc.nextInt();
        sc.close();
        System.out.printf("First %d terms of Fibanocci Series :- \n",x);
        for(int j=1; j<=x; j++)
        {
            System.out.print(fir+" ");
            s=fir+sec;
            fir=sec;
            sec=s;    
        }

        
    
}
}
