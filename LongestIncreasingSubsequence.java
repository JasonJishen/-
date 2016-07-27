public class Solution {
    /**
     * @param nums: The integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public int longestIncreasingSubsequence(int[] nums) {
        // write your code here
        
        if(nums == null|| nums.length == 0){
            return 0;//返回0
        }
        
        int n = nums.length;
        int[] f = new int[n];
        int max = 0;
        f[0] = 1;
        
        for(int i = 1; i<n; i++){
            f[i] = 1;
        }
        
        for(int i = 1; i<n; i++){
            for(int j = 0; j <i; j++){
                if(nums[i]>=nums[j]){//一样的也算是上升序列
                    f[i] = f[i] > f[j] + 1 ? f[i] : f[j] + 1;//这里应该用一个三目运算符,我写的是f[i]=f[j]+1
                }
            }
            if(f[i]>max){
                max = f[i];//加这个判断的目的是因为这个上升序列的最后一个不一定是在nums的最后一个值，要加在这里因为上一个for判断了f[i]的值
            }
            
        }
        
        return max;
    }
}
