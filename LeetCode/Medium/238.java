class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int prodBefore = 1;
        int prodAfter = 1;

        for(int i=0; i<n; i++) {
            res[i] = prodBefore;
            prodBefore *= nums[i];
        }

        for(int i=n-1; i>=0; i--) {
            res[i] *= prodAfter;
            prodAfter *= nums[i];
        }

        return res;
    }
}