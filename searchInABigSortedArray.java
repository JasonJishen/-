/**
 * Definition of ArrayReader:
 * 
 * class ArrayReader {
 *      // get the number at index, return -1 if index is less than zero.
 *      public int get(int index);
 * }
 */
public class Solution {
    /**
     * @param reader: An instance of ArrayReader.
     * @param target: An integer
     * @return : An integer which is the index of the target number
     */
    public int searchBigSortedArray(ArrayReader reader, int target) {
        // write your code here
        if(reader.get(0)==target){
            return 0;
        }
        
        int index = 1;//重点！！！！！！！！！！！！！！！！！！
        while(reader.get(index)<target){
            index = index * 2;
        }
        
        int start = 0;
        int end = index;
        while (start + 1 < end){
            int mid = start + (end - start)/2;
            if(reader.get(mid)==target){
                end = mid;
            }
            if(reader.get(mid)<target){
                start = mid;
            }
            if(reader.get(mid)>target){
                end = mid;
            }
        }
        
        if(reader.get(start)==target){
            return start;
        }
        
        if(reader.get(end)==target){
            return end;
        }
        return -1;
    }
}
