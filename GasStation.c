int canCompleteCircuit(int* gas, int gasSize, int* cost, int costSize) {
    int start = 0;
    int curGas = 0;
    int netGas = 0;
    for (int i=0; i<gasSize; i++){
        curGas += gas[i] - cost[i];
        netGas += gas[i] - cost[i];
        
        if(curGas < 0){
            start = i+1;
            curGas = 0;
        }
    }
    if (netGas < 0) return -1;
    return start;
}
