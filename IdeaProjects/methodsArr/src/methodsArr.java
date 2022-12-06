import java.util.Scanner;
public class methodsArr {

   /* static void update(int a[], int index, int value){
        a[index]=value;
    }*/
    static boolean isprime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
       /*int a[]={1,4,6,5,2};
        update(a,4,25)
        for(int x:a)
            System.out.println(x);*/

        System.out.println(isprime(19));
        System.out.println(isprime(13));
        System.out.println(isprime(10));




    }
}