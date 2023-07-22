public class pp17 {
    public static void main(String[]args){
        int n=5;
        //outer
        for(int i=1;i<=n;i++){
        //stars
        for(int j=1;j<=n;j++){
            if(i==1 || i==5 || j==1 || j==5){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();

        }
    }
}
