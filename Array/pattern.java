
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 2; j <=n-i+1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        for (int i = 0; i < n*2-1; i++) {
            int j=i>n?2*n-i:i;
            int nofs=n-j;
            for (int s = 0; s < nofs; s++) {
                System.out.print(" ");
                
            }
            for (int k = 0; k <j; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
   
    
}
