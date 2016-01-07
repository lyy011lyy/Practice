public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();

        if (nums == null || nums.length == 0) return result;
        int start = 0;
        int end = 0;

        while(end < nums.length) {
            if (end+1 < nums.length && nums[end+1] == nums[end] + 1){
                end++;
            }else{
                if (start == end) {
                    result.add(Integer.toString(nums[start]));
                } else {
                    result.add(nums[start] + "->" + nums[end]);
                }
                end++;
                start = end;
            }
        }

        return result;
    }
}
