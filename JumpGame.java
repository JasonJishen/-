public class Solution {
    /**
     * @param A: A list of integers
     * @return: The boolean answer
     */
    public boolean canJump(int[] A) {
        // wirte your code here
        
        if(A==null||A.length == 0){
            return false;
        }
        
        int n = A.length;
        boolean[] f = new boolean[n];
        
        f[0] = true;
        
        for(int i = 1; i<n;i++){
            for(int j = 0; j<i ;j++){
                if(f[j]==true && A[j]+j>=i){//这里分割的思想
                    f[i] = true;
                    break;//不要忘了break
                }
            }
        }
        
        return f[n-1];
    }
}
