
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=n;
        int ans=0;
        while (n>0) {
            int rem =n%10; 
            n/=10;
            ans=ans*10+rem;
            
        }
        System.out.println(ans);
        if(ans==m){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palnidrome");
        }
    }
}
