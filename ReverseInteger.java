public class Solution {
    public int reverse(int x) {
        int result = 0;
        while (Math.abs(x) > 0) {
            
            if ( Math.abs(result) > (Integer.MAX_VALUE - Math.abs(x%10))/10){
                return 0;
            }else{
                result = (result*10 + x%10);
            }
            x /= 10;
        }
        
         return result;   
    }
}
