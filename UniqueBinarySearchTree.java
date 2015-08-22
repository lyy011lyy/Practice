c class Solution {
	    public int numTrees(int n) {
		            if (n==0) return 1;
			            if (n==1) return 1;
				            
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		int temp;
	for (int i=2; i<=n; i++){
		temp = 0;
		for (int a=0; a<i; a++){
		temp += dp[a]*dp[i-1-a];
		}
		dp[i] = temp;
	}
									            
	return dp[n];
	}
}
