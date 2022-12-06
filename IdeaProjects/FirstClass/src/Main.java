//taking input from user (array)


import java.util.Scanner;
public class Main  //name of your file
{

    static void findMax(int arr[]){
      //  System.out.println("In static Fn");
        int max=arr[0];
        for(int i=0; i<5 ; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }



    public static void main(String[] args) {
        int[] arr =new int[100];
        int i=0;
        System.out.println("n=");
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        for(i=0;i<n;i++)
        arr[i]=input.nextInt();
        Main.findMax(arr);


    }
}
