public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null) return null;
        
        int temp = 1;
        for (int i=digits.length-1; i>=0; i--){
            digits[i] = (digits[i]+temp) % 10;
            
            if (digits[i] == 0 && temp ==1) {
                temp = 1;
            }else{
                temp = 0;
            }
        }
        
        if(temp == 0){
            return digits;
        } else{
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
    }
}
