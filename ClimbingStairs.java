public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        
        if(n<=1){
            return 1;
        }
        
        if(n == 2){//2要单独拿出判断，因为出现indexoutofbound
            return 2;
        }
        
        int[] f = new int[n+1];//创建n+1个空间，相对应的for循环里面也是n+1个
        
        f[1] = 1;
        f[0] = 1;
        
        for(int i = 2; i<n+1; i++){//从2开始
            f[i] = f[i-1]+f[i-2];
        }
        
        return f[n];//创建了n+1个空间才可以返回fn
    }
}
