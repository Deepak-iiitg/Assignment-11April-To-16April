import java.util.*;
public class MatrixRotateAnti {

    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n =2;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i>j){
                  int temp = arr[i][j];
                  arr[i][j] = arr[j][i];
                  arr[j][i] = temp;
                }
            }
        }
       
        for(int i=1;i<n;i++){
            int row_start=0,row_end=arr.length-1;
            while(row_start<row_end){
                int j=0;
                while(j<arr[0].length){
                    int temp = arr[row_start][j];
                    arr[row_start][j] = arr[row_end][j];
                    arr[row_end][j] = temp;
                    j++;
                }
                row_start++;
                row_end--;
            }
        }
        //System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
