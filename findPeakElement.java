public class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;//看清楚题目，如果说明了至少有四个元素，可以start = 1, end = nums.length-2
        int end = nums.length-1;
        int mid;
        
        while(start + 1<end){
            mid = start + (end - start)/2;
            if(nums[mid-1]>nums[mid]){
                end = mid;
            }
            else if(nums[mid]<nums[mid+1]){
                start = mid;
            }else{
                end = mid;
            }
        }
        
        if(nums[start]>nums[end]){
            return start;
        }
        return end;
    }
}
