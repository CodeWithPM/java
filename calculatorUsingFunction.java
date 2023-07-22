import java.util.*;

public class calculatorUsingFunction {
    //using functions we create calculator

        public static void add(int a,int b ){
            System.out.println("Addition of two no is :" + a+b);
            return ;
        }
        public static void sub(int a,int b ){
            float substraction=a-b;
            System.out.println("Substraction of two no is :" + substraction);
            return ;
        }
        public static void mul(int a,int b ){
            System.out.println("Multiplication of two no is :" + a*b);
            return ;
        }
        public static void div(int a,int b ){
            System.out.println("Division of two no is :" + a/b);
            return ;
        }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 No for calculation");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter your choice: 1.add 2.sub 3.mul 4.div");
        int choice=sc.nextInt();

        if(choice == 1){
            add( a,b);
        }else if(choice == 2){
            sub(a,b);
        }else if(choice == 3){
            mul(a,b);
        }else if(choice == 4){
            div(a,b);
        }else{
            System.out.println("Enter correct choice");
        }

    }
}
