import java.util.*;

public class calculator {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no for calculation");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter option 1.Addition  2.Substraction  3.multiplication  4.division");

        int option=sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Addition of two no is :"+(a+b));
                break;

            case 2:
                System.out.println("Substraction of two no is :"+(a-b));

                break;

            case 3:
            
                System.out.println("Multiplication of two no is :"+(a*b));

                break;

            case 4:
                System.out.println("Division of two no is :"+(a/b));

                break;
        
            default:
                System.out.println("Enter valid option");
                break;
        }
    }
}
