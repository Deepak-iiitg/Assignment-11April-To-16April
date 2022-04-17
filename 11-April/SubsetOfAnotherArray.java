import java.util.*;
public class SubsetOfAnotherArray {

    static boolean find(long a1[],long key){
        
        int start = 0;
        int end = a1.length-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(a1[mid]==key){
                return true;
            }
            else if(a1[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        
        return false;
        
    }
    static String isSubset( long a1[], long a2[], long n, long m) {
       Arrays.sort(a1);
       Arrays.sort(a2);
       for(int i=0;i<m;i++){
           if(!find(a1,a2[i])){
               return "No";
           }
           
       }
       
       return "Yes";
        
    }

    public static void main(String args[]){
        long a1[] = {11,1,13,21,3,7};
        long a2[] = {11,3,7,1};
        System.out.println(isSubset(a1,a2,a1.length,a2.length));
    }
    
}
