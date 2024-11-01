//1827. Minimum Operations to Make the Array Increasing

class Solution {
    public int minOperations(int[] nums) {
        int operations = 0;

        for(int i=1; i<nums.length; i++) {
            if(nums[i-1] >= nums[i]){
                int incre = nums[i-1] - nums[i] +1; 
                operations += incre;
                nums[i] = nums[i-1] + 1;
            }
        }

        return operations;
    }
}