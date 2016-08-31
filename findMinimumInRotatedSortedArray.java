public class Solution {
    public int findMin(int[] nums) {
        if(nums == null||nums.length == 0){
            return -1;
        }
        
        int start = 0;
        int end = nums.length - 1;
        int target = nums[end];
        
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(nums[mid] <= target){
                end = mid;
            }
            
            if(nums[mid]>target){
                start = mid;
            }
        }//这个判断纯是为了判断在左支还是右支，start这个指针永远不可能到右支。因为第二个限定条件
        
        if(nums[start]<=target){
            return nums[start];
        }else{
            return nums[end];
        }
    }
}
