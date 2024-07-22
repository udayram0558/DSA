
import java.util.Scanner;

public class fruits {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // String fruits=in.nextLine();
            // if(fruits.equals("mango")){
            //     System.out.println("hello");
   //   switch (fruits) {
   //     case "mango":
   //         System.out.println("King of fruits");
   //         break;
   //     case "orange":
   //         System.out.println("Round Fruits");
   //         break;
   //     default:
   //     System.out.println("Invalid");
   //         break;
   //   }
            int n= in.nextInt();
            switch(n){
                case 1->System.out.println("Monday");
                case 2->System.out.println("Tuesday");
                case 3->System.out.println("wedday");
                case 4->System.out.println("Thursday");
                case 5->System.out.println("friday");
                case 6->System.out.println("satday");
                case 7->System.out.println("Sunday");
                default->System.out.println("enter a valid day");
            }
        }
    }
}
