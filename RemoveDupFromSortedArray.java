public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        
        for(int i=1; i<length; i++){
            if(nums[i] == nums[i-1]){
                for(int k=i; k<nums.length-1; k++){
                    nums[k] = nums[k+1];
                }
                i--;
                length --;
            }
        }
        
       return length;  
    }
}
