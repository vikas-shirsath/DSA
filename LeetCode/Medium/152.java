class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int beforeProd = 1, afterProd = 1;
        int maxProd = Integer.MIN_VALUE;

        for(int i =0; i< n; i++) {
            if(beforeProd == 0) {beforeProd = 1;}
            if(afterProd == 0) {afterProd = 1;} 

            beforeProd *= nums[i];
            afterProd *= nums[n-i-1];
            maxProd = Math.max(Math.max(beforeProd, afterProd), maxProd);
        }
        return maxProd;
    }
}