public class MaxNumberUsingRec {

    static int maximum(int arr[],int i,int max){
        if(i==arr.length){
            return max;
        }
        if(max<arr[i]){
            max = arr[i];
            return maximum(arr,i+1,max);
        }
        else{
            return maximum(arr,i+1,max);
        }
    }
    public static void main(String args[]){
        int arr[] = {6,1,0,4,7,0,3};
        int max = maximum(arr,0,Integer.MIN_VALUE);
        System.out.println(max);
    }
    
}
