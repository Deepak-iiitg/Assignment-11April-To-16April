public class UpperTrianglePrime {

    static boolean prime(int n){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    static void lowerTriangle(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i<=j){
                    if(prime(matrix[i][j])){
                        System.out.print(matrix[i][j]+" ");
                    }
                }
              

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,0},{4,5,6,10},{7,8,9,20},{20,30,40,50}};
        lowerTriangle(matrix);
    }
    
}
