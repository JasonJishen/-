public class Solution {
    /**
     * @param triangle: a list of lists of integers.
     * @return: An integer, minimum path sum.
     */
    public int minimumTotal(int[][] triangle) {
        // write your code here
        if(triangle == null || triangle.length == 0 ) {
            return -1;
        }
        
        if(triangle[0] == null || triangle[0].length == 0){
            return -1;
        }
        
        int n = triangle.length;
        int[][] f = new int[n][n];
        
        f[0][0] = triangle[0][0];
        
        for (int i = 1; i < n; i++) {//初始化应该初始化的是三角形的两个边，
            f[i][0] = f[i - 1][0] + triangle[i][0];//初始化f[i][0]和f[i][i]
            f[i][i] = f[i - 1][i - 1] + triangle[i][i];
        }
        for(int i = 1; i<n;i++){
            for(int j = 1; j<i; j++){//写成了j = 1; j<=i;j++
                f[i][j] = Math.min(f[i-1][j],f[i-1][j-1])+triangle[i][j];
            }
        }
        
        int best = f[n-1][0];//写成了int best = 0，如果写成0，那么就都是和0比，如果整个数都是正的，那么就会造成0肯定是最小的，不管怎么算都是0
        for(int i = 0; i<n; i++){
            best = Math.min(f[n-1][i],best);//写成了f[i][n-1]变成了比较三角形最左边
        }
        return best;//最后返回的时候如果不进行这样的一个比较的话，就返回了整个最后一行
    }
}
