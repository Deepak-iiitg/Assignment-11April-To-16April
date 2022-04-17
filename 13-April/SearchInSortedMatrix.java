import java.util.*;
public class SearchInSortedMatrix {

    static boolean find(int matrix[],int target){
        int start = 0;
        int end = matrix.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(matrix[mid] == target){
                return true;
            }
            else if(matrix[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        
        return false;
    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 9;
        boolean flag = false;
        for(int i=0;i<matrix.length;i++){
            if(find(matrix[i],target)){
                flag = true;
                System.out.println("true");
                break;
            }

        }
       // System.out.println("false");
       if(!flag){
           System.out.println("false");
       }
        
    }
    
}
