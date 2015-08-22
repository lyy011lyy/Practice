//Note: Java pass the reference of the array into the function.
//you can only change the content of the array that the reference points to, 
//but you can not change which array that the reference points to.
public class Solution {
    public int removeElement(int[] nums, int val) {
        int cur = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[cur] = nums[i];
                cur++;
            }
        }
        return cur;

    }
}
