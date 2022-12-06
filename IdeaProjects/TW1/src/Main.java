import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,j;
        int [][]marks=new int[5][3];
        int []total={0,0,0,0,0};
        int []avg=new int[5];
        Scanner input=new Scanner(System.in);
        for(i=0;i<5;i++) {
            System.out.println("Enter the marks of student: " + (i + 1));
            for (j = 0; j < 3; j++) {
                marks[i][j] = input.nextInt();
                total[i] = total[i] + marks[i][j];

            }
        }
        for(i=0; i<5;i++){
            avg[i]=computeAvg(marks[i][0],marks[i][1],marks[i][0]);
            System.out.println("For student:"+(i+1));
            System.out.println("Total= "+total[i]);
            System.out.println("Avg= "+avg[i]);
        }
        }


    static int computeAvg(int m1, int m2, int m3){
        int min=m1;
        if(min>m2)
            m2=min;
        if(min>m3)
            m3=min;
        int total=(m1+m2+m3-min);
        return(int)Math.ceil(total/2.0);
    }
}