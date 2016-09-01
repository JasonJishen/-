public class Solution {
    public int findMin(int[] nums) {
        if(nums == null||nums.length == 0){
            return -1;
        }
        int min = nums[0];
        for(int i = 0; i<nums.length;i++){
            if(nums[i]<min){//考虑最坏情况，[1,1,1,1,1,1,1,0,1,1,1,1,1,1,]
                min = nums[i];
            }
        }
        
        return min;
    }
}
