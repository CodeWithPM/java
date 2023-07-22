public class pp10 {
    public static void main(String[]args){
        int n=3;
        //outer
        for(int i=1;i<=n;i++){
        //space
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=n-i+1;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
        }

        //outer down
        for(int i=2;i>=1;i--){
        //space
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=n-i+1;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
        }
    }
}
