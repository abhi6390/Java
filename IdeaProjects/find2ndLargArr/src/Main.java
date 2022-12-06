public class Main {
    public static void main(String[] args) {

        int A[]={1,2,3,4,5,6,7,8,9,10};
        /*int sum=0;
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];

        }
        System.out.println(sum);*/
       /* int key=5;
        for(int i=0;i<A.length;i++){
            if(A[i]==key) {
                System.out.println("Element found");
                System.exit(0);
            }

        }
        System.out.println("not found");*/

        int max=A[0];
        for(int i=0;i<A.length;i++) {
            if(A[i]>max)
                max=A[i];
        }
            System.out.println(max);


    }
}