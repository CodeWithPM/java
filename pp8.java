
public class pp8{
    public static void main(String [] args){
        int n=5;
        //outer
        for(int i=5;i>=1;i--){
        //space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*" +" ");
        }
        System.out.println();
        }
    }
}
