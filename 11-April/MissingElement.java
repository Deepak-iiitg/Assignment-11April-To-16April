public class MissingElement {

    static int search(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }

        return arr.length+1;
    }

    public static void main(String args[]){
        int n=5;
        int arr[] = {1,2,3,4};
        int missing = search(arr);
        System.out.println(missing);
    }
    
}
