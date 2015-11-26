public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
            int start= 0;
            int haveGas = 0;
            int netGas = 0;
        
        for (int i=0; i<gas.length; i++){

            netGas += gas[i] - cost[i];
            haveGas += gas[i] - cost[i];
            if (haveGas < 0){
                start = i+1;
                haveGas = 0;
            }
        }
        if (netGas < 0) return -1;
        return start;
    }
}
