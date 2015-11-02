public class Solution {
    public boolean isHappy(int n) {
        HashSet sumSet = new HashSet();
        int sum = 0;
        while (sum != 1 ) {
            sum = 0;
            while (n != 0 ){
                sum += Math.pow((n%10),2);
                n /= 10;
            }
            
            if(sumSet.contains(sum)) return false;
            sumSet.add(sum);
            n = sum;
        }
        return true;
    }
}
