public class Main {

    static void show(int ...a){
        for(int x:a){
            System.out.println(x);
        }

    }
    static void list(String ...S){
        for(int i=0;i<S.length;i++){
            System.out.println(i+1+"."+S[i]);
        }
    }

    static int max(int ...A){
        if(A.length==0)
            return  Integer.MIN_VALUE;
        int max=A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max)
                max=A[i];
        }
        return max;
    }
    public static void main(String[] args) {
            show();
            show(10,20,30,40);
            list("Bruh", "Bro", "brUh", "Last");
            int m2=max();
            int m1=max(10,20,30);
            System.out.println(m2);
            System.out.println(m1);
    }
}