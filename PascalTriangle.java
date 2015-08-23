public class Solution {
    public List<List<Integer>> generate(int numRows) {
         
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows == 0) return result;
        List<Integer> pre;
        
	//The decleration inside the for loop is just valid between {};
	//So there can be allocated multiple times, because it has been 
	//deallocated.
        for (int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for(int k=1; k<i; k++ ){
                pre = result.get(i-1);
                int temp = pre.get(k-1) + pre.get(k);
                row.add(temp);
            }
            if(i!=0){
                row.add(1);
            }
            result.add(row);
        }
    
        return result;
        
    }
}
