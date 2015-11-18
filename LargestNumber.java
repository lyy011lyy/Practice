public class Solution {
    public String largestNumber(int[] nums) {
        int length = nums.length;
        
        String[] theString = new String[length];
        for ( int i=0; i<length; i++){
            theString[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(theString, new MySort());
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<length; i++){
            sb.append(theString[i]);
        }
        
        String result = sb.toString();
        
        if ("".equals(result.replace("0",""))){
            return "0";
        }
        
        return sb.toString();
    }
    
    private class MySort implements Comparator<String>{
        @Override
        public int compare(String s1, String s2){
            return (s2+s1).compareTo(s1+s2);
        }
        
        
    }
}
