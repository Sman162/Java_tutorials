import java.util.Scanner;

public class Reverse {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the number to check");
            int a=input.nextInt();

            int count=0;
            int ans=0;
            while(a > 0){
                int rem=0;
                rem=a%10;
                a=a/10;

                ans=ans*10+rem;
            }
            System.out.println(ans);
        }
    }


