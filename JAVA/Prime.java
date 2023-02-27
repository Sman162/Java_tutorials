import  java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number to be check");
        int num=input.nextInt();
        boolean ans=isPrime(num);
        System.out.println(ans);

    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c =2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
