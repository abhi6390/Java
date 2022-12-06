import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
            System.out.println("Enter a: ");
            int a=input.nextInt();
            System.out.println("Enter b: ");
            int b=input.nextInt();
            if(a>b){
                System.out.println("A bada");
            }
            else{
                System.out.println("B bada");
            }
        input.close();

    }
}