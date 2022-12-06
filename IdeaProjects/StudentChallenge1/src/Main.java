import java.awt.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int a,b,c;
        double r1, r2;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter value of a b c: ");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        r1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
        r2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
        System.out.println("Roots are "+r1+" "+r2);

    }
}


       /* double b, h;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the base : ");
        b=input.nextInt();
        System.out.println("Enter the height: ");
        h=input.nextInt();
        double area=0.5*b*h;

        System.out.println("area = "+area);
        System.out.println("Hello world!"); */

/* double a, b, c, area, s;
    Scanner input= new Scanner(System.in);
    System.out.println("Enter the 3 sides: ");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        s=(a+b+c)/2f;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area); */