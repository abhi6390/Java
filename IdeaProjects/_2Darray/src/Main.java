
public class Main  //name of your file
{


    void findMax(int arr[][]){
        //Find the greatest element in each row
        int max,i,j;
        for(i=0;i<2;i++){
            max = arr[i][0];
            for(j=0;j<5;j++)
                if(arr[i][j]>max) {
                    max = arr[i][j];
                }
                System.out.println("Max in row"+i+": "+max);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,5,4,3},
                {4,5,6,3,8}
        };

        //Create an Object
        Main obj = new Main();
        obj.findMax(arr);


    }
}
