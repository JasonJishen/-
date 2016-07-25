public class Solution {
    /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here 
        int[][] grid = new int[m][n];
        int[][] f = new int[m][n];
        
        f[0][0] = 1;
        for(int i = 1; i<m;i++){
            f[i][0] = 1;//写成了1+f[i-1][0]，只有一条路径，初始化为1
        }
        
        for(int i = 1; i<n;i++){
            f[0][i] = 1;//写成了1+f[0][i-1]，因为只有一条路径，所以应该初始化为1
        }
        
        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                f[i][j] = f[i-1][j]+f[i][j-1]; //不能加1
            }
        }
        
        return f[m-1][n-1];
        
    }
}
