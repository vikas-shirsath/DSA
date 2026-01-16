class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            sum += nums[i];
        }

        if(sum % 2 != 0) return false;

        Boolean[][] dp = new Boolean[n][sum + 1];

        return fun(sum / 2, n - 1, nums, dp);
    }

    private boolean fun(int tar, int n, int[] nums, Boolean[][] dp) {
        if(tar == 0) return true;
        if(n == 0) return nums[0] == tar;

        if(dp[n][tar] != null) return dp[n][tar];

        boolean notTake = fun(tar, n - 1, nums, dp);
        boolean take = false;
        
        if(nums[n] <= tar) {
            take = fun(tar - nums[n], n - 1, nums, dp);
        }

        return dp[n][tar] = notTake || take;
    }
}