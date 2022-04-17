import java.util.*;

public class UnionOfTwoSortedArray {

    static ArrayList<Integer> union(int arr1[],int arr2[]){
        int i=0,j=0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                result.add(arr1[i]);
                i++;
            }

            if(arr2[j]<arr1[i]){
                result.add(arr2[j]);
                j++;
            }

            if(arr1[i] == arr2[j]){
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            result.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            result.add(arr2[j]);
            j++;
        }
        return result;
    }
    public static void main(String args[]){
        int arr1[] = {5,10,13,14,20,21};
        int arr2[] = {2,3,6,7,8,9,20};
        ArrayList<Integer> result = new ArrayList<Integer>();
        result = union(arr1,arr2);
        System.out.println(result);

    }
    
}
