public class invertedrotstar {
    public static void main(String args[]){
        int n=5;

        for(int i=1;i<=n;i++){

            for(int s=0;s<(n-i);s++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print('*');
            }

            System.out.println("");
        }
    }
}
