public class Main {
    public static void main(String[] args) {

    int a[]=new int[10];
    int b[]={1,2,4,5,6};
    for(int i=0;i<b.length;i++) {
        System.out.println(b[i]);
    }
    System.out.println();
    for(int i=b.length-1;i>=0;i--)//reverse
        System.out.println(b[i]);
System.out.println();
    System.out.println(b.length);
    System.out.println();
    for(int x:b)
            System.out.println(x);

    }


}