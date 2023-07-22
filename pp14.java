public class pp14 {
    public static void main(String[]args){
        int n=3;
        //outer
        for(int i=1;i<=n;i++){
        //space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //stars or spaces
        for(int j=1;j<=2*i-1;j++){
           
            if(j==1 || j==2*i-1){
                System.out.print("*");
             }
            else{
                System.out.print(" ");
            }
           
        }
         System.out.println();
        }
    }
}
