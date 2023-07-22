
public class pp6 {
    public static void main(String[]args){
    int n=5;
        //outer right up
        for(int i=1;i<=n;i++){
        //space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
        }

        
        // right down
         for(int i=4;i>=1;i--){
        //space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
        }
}
}
