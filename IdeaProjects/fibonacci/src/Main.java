import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=0, n2=1, i, n, n3;
        System.out.println("Enter the total no of digits you want: ");
        n= sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        for(i=2;i<n;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }

    }
}