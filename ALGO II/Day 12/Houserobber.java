class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        if(len == 1) return nums[0];
        if(len == 2) return Math.max(nums[0], nums[1]);
        int[] dp = new int[len + 1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i <= len; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        int[] dpp = new int[len + 1];
        dpp[0] = 0;
        dpp[1] = nums[0];
        dpp[2] = dpp[1];
        for(int i = 3; i < len; i++){
            dpp[i] = Math.max(dpp[i - 1], dpp[i - 2] + nums[i - 1]);
        }
        dpp[len] = dpp[len - 1];
        return Math.max(dp[len], dpp[len]);
    }
}