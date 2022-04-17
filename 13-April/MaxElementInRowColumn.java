import java.util.*;

public class MaxElementInRowColumn {

    static ArrayList<Integer> findMaxRow(int[][] matrix){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<matrix[i].length;j++){
                if(max<matrix[i][j]){
                    max = matrix[i][j];
                }
            }
            result.add(max);
        } 
        return result;
    }

    static ArrayList<Integer> findMaxCol(int[][] matrix){
        ArrayList<Integer> result = new ArrayList<>();
        int col_start = 0;
        int col_end = matrix.length-1;
        while(col_start<=col_end){
            int max = Integer.MIN_VALUE;
            for(int i=0;i<matrix.length;i++){
                if(max<matrix[i][col_start]){
                    max = matrix[i][col_start];
                }
            }

            result.add(max);
            col_start++;
        }
        return result;
    }
    public static void main(String args[]){
        int matrix[][] = {{10,2,18},{20,9,17},{30,2,39}};
        ArrayList<Integer> maxRow = findMaxRow(matrix);
        System.out.println("maximum in row : " +maxRow);
        ArrayList<Integer> maxCol = findMaxCol(matrix);
        System.out.println("maximum in column : "+maxCol);
        //int maxCol = findMaxCol(matrix);
    }
    
}
