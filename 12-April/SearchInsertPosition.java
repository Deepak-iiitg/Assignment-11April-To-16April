public class SearchInsertPosition {
    static int search(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int result = 0;
        
         if(arr[start]>target){
                return 0;
            }
            
        if(arr[end]<target){
                return end+1;
            }
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            result = mid;
            
            if(arr[mid] == target){
                return mid;
            }
            
            else if(arr[mid]<target){
                start = mid+1;
                result = mid+1;
            }
            else{
                end = mid-1;
                result = mid;
            }
            
        }
        
        return result;
    }
    

    public static void main(String args[]){
        int arr[] = {1,3};
        int target = 2;
        System.out.println(search(arr,target));
    }
    
}
