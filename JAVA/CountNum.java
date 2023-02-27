import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number to check");
        int a=input.nextInt();
        System.out.println("Enter the number to count");
        int n=input.nextInt();
        int count=0;
        while(a > 0){
            int rem=0;
            rem=a%10;
            a=a/10;
            if(rem == n)
            count++;
        }
        System.out.println(count);
    }
}
