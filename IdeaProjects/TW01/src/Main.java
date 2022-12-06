import java.util.Scanner;
import java.util.Arrays;
    public class PW1
    {
        int []total=new int[5];
        float []avg=new float[5];

        public void readMks(int mksArr[][]){
            int i,j;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the marks:");
            for(i=0;i<5;i++){
                for(j=0;j<3;j++){
                    mksArr[i][j]=sc.nextInt();
                }
            }
        }
        public void computeAvg(int[][] mksArr,int i){
            int sum=0;
            int[] array=new int[3];
            for(int j=0;j<3;j++){
                array[j]=mksArr[i][j];
            }
        }
    }