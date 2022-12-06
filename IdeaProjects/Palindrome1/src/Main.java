import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n, r, sum=0, temp;
            System.out.println("Enter n: ");
            n= sc.nextInt();
            temp=n;
            while(n!=0){
                r=n%10;
                sum=(sum*10)+r;
                n=n/10;
            }
            if(sum==temp){
                System.out.println("Number is a palindrome");
            }
            else {
                System.out.println("Number is not a palindrome");
            }
    }
}