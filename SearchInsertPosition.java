/*
20150723
Search Insert Position
*/

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0){
            return 0;
        }
        int pos = 0;
        while( pos < nums.length && target > nums[pos] ){
            pos++;
        }
        return pos;
    }
}
