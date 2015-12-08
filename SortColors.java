public class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        for (int i=0; i<nums.length; i++){
            switch (nums[i]) {
                case 0:
                    zero ++;
                    break;
                case 1:
                    one ++;
                    break;
                default:
            }
        }

        for (int i=0; i<nums.length; i++){
            if (zero > 0) {
                zero --;
                nums[i] = 0;
                continue;
            }
            if (one > 0) {
                one --;
                nums[i] = 1;
                continue;
            }
            nums[i] = 2;
        }
    }
}
