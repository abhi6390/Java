import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
                System.out.println("Enter a integer ");
                    int num =input.nextInt();
                    System.out.println("Enter a floating point number ");
                    float num1=input.nextFloat();
                    System.out.println("enter a string ");
                    String str=input.next();
                System.out.println("integer is: "+num);
                System.out.println("F number: "+num1);
                System.out.println("String is "+str);
                input.close();

    }
}