import java.util.*;

public class ifelseif {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int no=sc.nextInt();
        
        if(no == 1){
            System.out.println("You entered no is "+ no);
        }  else if(no != 1){
            System.out.println("You enterd no is "+ no);

        }else {
            System.out.println("Success.");
        }
    }
}
