public class PrintNegativeNumberRec {

    static void print(int arr[],int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]<0){
            System.out.print(arr[i]+" ");
            print(arr,i+1);
        }
        else{
            print(arr,i+1);
        }
    }
    public static void main(String args[]){
        int arr[] = {-19,0,18,-1,-20};
        print(arr,0);
    }
    
}
