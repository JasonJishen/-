public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        if(nums == null||nums.length == 0){
            result[0] = -1;//result 的方法
            result[1] = -1;
            return result;
        }
        
        int start = 0;
        int end = nums.length - 1;
        int mid;
        int first;
        int last;
        while(start + 1 < end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                first = mid;
                end = mid;
            }
            if(nums[mid] > target){
                end = mid;
            }
            if(nums[mid] < target){
                start = mid;
            }
        }
        if(nums[start] == target){
            first = start;
        }
        else if(nums[end]==target){
            first = end;
        }else{
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        start = 0;
        end = nums.length-1;
        while(start + 1 < end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                last = mid;
                start = mid;
            }
            if(nums[mid] > target){
                end = mid;
            }
            if(nums[mid] < target){
                start = mid;
            }
        }
        if(nums[end] == target){
            last = end;
        }
        else if(nums[start]==target){
            last = start;
        }else{
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        result[0] = first;
        result[1] = last;
        return result;
        
    }
}
