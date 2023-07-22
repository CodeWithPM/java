
import java.util.*;

public class fun1 {
    public static void myName(String name) {
        // System.out.println("************************");
        System.out.println();
        System.out.println(name + " is good person.");
        // System.out.println("************************");

        return;
    }
    public static void star(){
        int n=25;
        for(int i=n;i>=1;i--){
            System.out.print("*");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name = sc.nextLine();
        
        star();//function call
        myName(name);// call kiya function ko
        star();//function call
    }

} 
