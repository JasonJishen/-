public class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        
        int start = 0;
        int end = nums.length-1;
        int mid;
        
        while (start+1 < end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[start]<nums[mid]){
                if(nums[start]<=target && target <= nums[mid]){
                    end = mid;
                }
                else{
                    start = mid;
                }
            }
            else{
                if(nums[mid]<=target&&nums[end]>=target){//别忘了这儿的等于，还有分类具体怎么分，先判断mid在左右，再判断target和mid的关系
                    start = mid;
                }
                else{
                    end = mid;
                }
            }
        }
        
        if(nums[start]==target){
            return start;
        }
        if(nums[end] == target ){
            return end;
        }
        return -1;
        
    }
}
