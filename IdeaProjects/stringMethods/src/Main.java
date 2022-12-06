import java.util.Locale;

public class Main {
    public static void main(String[] args) {

    String str="HelloJava";
    int l=str.length();
    String str1=str.toLowerCase();
    String str2=str.toUpperCase();
    String str3=str.substring(2,6);
    String str4=str.replace("o","t");
    System.out.println(l);
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);
    }
}