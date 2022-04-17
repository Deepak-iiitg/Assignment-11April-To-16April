public class FindDublicate {

    public static int findDuplicate(int[] nums) {
        boolean visited[] = new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
           if(visited[nums[i]]){
               return nums[i];
           }
            else{
                visited[nums[i]] = true;
            }
        }
        
        return -1;
    }

    public static void main(String args[]){
        int nums[] = {1,3,2,4,2};
        System.out.println(findDuplicate(nums));
    }
    
}
