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
        int[][] f = new int[n][n];//初始化长度不能落下
        
        for(int i = 0; i<n;i++){
            f[n-1][i] = triangle[n-1][i];//初始化是最后一行n-1
        }
        
        for(int i = n-2;i>=0;i--){//循环倒着来，因为是从下向上
            for(int j = 0; j<=i ; j++){//j的值是小于等于i的，虽然创建了一个二维数组，但是最后存的时候还是一个三角形的
                f[i][j] = Math.min(f[i+1][j],f[i+1][j+1])+triangle[i][j];
            }
        }
        
        return f[0][0];
    }
}
