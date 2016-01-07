public class Solution {
    public int singleNumber(int[] nums) {
        int[] count = new int[32];
        int result = 0;
        for(int i=0; i<32; i++){
            for(int j=0; j<nums.length; j++ ){
              //For all numbers, when this bit is 1, add it.
                if( ((nums[j] >> i) & 1) == 1) {
                    count[i]++;
                }
            }

            //If the %3 get 1, this bit is one, otherwise 0
            if (count[i] % 3 == 1) {
                result = result | (1 << i);
            }else{
                result = result | (0 << i);
            }
        }
        return result;
    }
}
