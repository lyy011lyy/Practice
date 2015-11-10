public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        int[] t1 = new int[nums.length];
        int[] t2 = new int[nums.length];
        
        t1[0] = 1;
        t2[nums.length-1] = 1;
        
        //multiply from left to right.
        for (int i=0; i<nums.length-1; i++){
            t1[i+1] = nums[i] * t1[i];
        }
        
        //multiply form right to left.
        for (int i=nums.length-1; i>0; i--){
            t2[i-1] = nums[i] * t2[i];
        }
        
        //multiply t1 and t2.
        for (int i=0; i<nums.length; i++){
            result[i] = t1[i] * t2[i];
        }
        
        return result;
    }
}
