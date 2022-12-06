public class Main {
    public static void main(String[] args) {
        char c[]={'A','b','h','i'};
        String str1=new String(c);
        System.out.println("Hello world!");
        byte b[]={66,67,68,69};
        String str3="Java Prg";
        String str2=new String(b);
        String str4=new String("in heap");
        String str5="Java";
        String str6="Java";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5==str6);
    }
}