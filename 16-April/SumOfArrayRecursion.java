public class SumOfArrayRecursion {

    static int sum(int arr[],int i){
        if(i == arr.length-1){
            return arr[arr.length-1];
        }
        return arr[i]+sum(arr,i+1);
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sum(arr,0));
    }
    
}
