public class Solution {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        
        while(n>0) {
            n--;
            char temp = (char) (n%26 + 'A');
            n /= 26;
            res.append(temp);
        }
        res.reverse();
        return res.toString();
    }
}
