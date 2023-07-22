import java.util.*;

public class factorialno {

    public static void factorial(int n){
        if(n<0){
            System.out.println("Enter a valid no");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial * i;
        }
        System.out.println("Factorial of "+n+ " is "+factorial);
        return;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();
        factorial(n);
        
    }
}
