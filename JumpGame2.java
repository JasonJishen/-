public class Solution {
    /**
     * @param A: A list of lists of integers
     * @return: An integer
     */
    public int jump(int[] A) {
        // write your code here
        
        if(A==null||A.length == 0){
            return -1;
        }
        
        int n = A.length;
        int[] f = new int[n];
        boolean[] reachable = new boolean[n];
        
        f[0] = 0;
        reachable[0] = true;
        for(int i = 1; i<n;i++){
            reachable[i]=false;
            for(int j = 0; j<i; j++){
                if(reachable[j] == true && A[j]+j>=i){
                    f[i] = f[j]+1;
                    reachable[i]=true;
                    break;
                }
            }
        }
        
        return f[n-1];
    
        
    }
}
