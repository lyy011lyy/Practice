public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,String> myMap = new HashMap<Integer,String>();
        
        for (int n:nums){
            if (myMap.put(n,"a") != null) return true;
        }
        return false;
    }
}
