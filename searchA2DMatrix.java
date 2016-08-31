public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null||matrix.length==0){
            return false;
        }
        
        if(matrix[0] == null || matrix[0].length == 0){
            return false;
        }
        
        int row = matrix.length;
        int column = matrix[0].length;
        
        int start = 0;
        int end = row*column-1;
        
        while(start + 1 < end){
            int mid = start + (end - start)/2;//写反了
            int number = matrix[mid/column][mid%column];//用column而不是用排
            if(number == target){
                return true;
            }
            
            if(number < target) {
                start = mid;
            }
            
            if(number > target) {
                end = mid;
            }
        }
        
        if(matrix[start/column][start%column] == target){//用column
            return true;
        }
        if(matrix[end/column][end%column] == target){//用column
            return true;
        }
        return false;
    }
}
