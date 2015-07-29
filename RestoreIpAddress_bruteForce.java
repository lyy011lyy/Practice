/*20150728
 * Restor valid IP address
 */

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        if(s.length() < 4 || s.length() > 12) return res;
        
        int posSum = 0;
        String input = "";
        for (int i1 = 1; i1<= 3; i1++){
            for (int i2=1; i2<= 3; i2++){
                for (int i3 = 1;i3<= 3; i3++){
                    for(int i4 = 1; i4<= 3; i4++){
                        input = "";
                        posSum = i1+i2+i3+i4;
                        if( posSum != s.length() ) continue;
                            if(isValid(s.substring(0,i1))) {
                                input += s.substring(0,i1)+".";
                            }else{
                                input = "";
                                continue;
                            }
                            
                            if(isValid(s.substring(i1,i1+i2))) {
                                input += s.substring(i1,i1+i2)+".";
                            }else{
                                input="";
                                continue;
                            }
                            
                            if(isValid(s.substring(i1+i2, i1+i2+i3))) {
                                input += s.substring(i1+i2,i1+i2+i3)+".";
                            }else{
                                input="";
                                continue;
                            }
                            
                            if(isValid(s.substring(i1+i2+i3))) {
                                input += s.substring(i1+i2+i3);
                                res.add(input);
                                input = "";
                            }else{
                                continue;
                            }
                    }
                    
                }
                
                
            }
            
        }
        
        return res;
    }
    
    
    public boolean isValid(String part){
        int input = Integer.parseInt(part);
        if(input >= 0 && input<=255 ){
            if(input==0 && part.length() > 1){
                return false;
            }
            if(input>0 && part.substring(0,1).equals("0")){
                return false;
            }
            
            return true;
        }else{
            return false;
        }
    }
}
