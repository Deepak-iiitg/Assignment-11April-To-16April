import java.util.*;
public class CyclicallyRotateArray{

    static int[] rotate(int arr[],int n){
        for(int i=0;i<n;i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1;j>=1;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        return arr;
    }
    public static void main(String args[]){
        int n = 2;
        int arr[] = {1,2,3,4,5};
        int result[] = rotate(arr,n);
        System.out.println(Arrays.toString(result));
    }
}