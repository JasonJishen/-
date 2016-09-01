public class Solution {
    public void rotate(int[] nums, int k) {
        if(nums==null||nums.length == 0){
            return;
        }
        k = k%nums.length;
        int length = nums.length;
        reverse(nums, 0, length-1-k);
        reverse(nums, length-k,length-1);
        reverse(nums, 0,length-1);
    }
    
    public void reverse(int[] nums, int start, int end){
        for(int i = start, j = end; i<j; i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
