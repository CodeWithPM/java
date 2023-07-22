
public class pp5 {
    public static void main(String [] args){
        int n=5;
        //outer
        for(int i=1;i<=5;i++){
        //space
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=n-i+1;j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
