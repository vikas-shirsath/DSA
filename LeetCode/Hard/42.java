class Solution {
    public int trap(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int water = 0;
        int leftMax = 0;
        int rightMax = 0;

        while(left < right) {
            if( nums[left] <= nums[right]) {
                //left is smaller
                if(nums[left] >= leftMax) {
                    leftMax = nums[left];
                } else {
                    water +=  leftMax - nums[left];
                }
                left++;
            } else {
                //right is smaller
                if(nums[right] >= rightMax) {
                    rightMax = nums[right];
                } else {
                    water += rightMax - nums[right];
                }
                right--;
            }
        }
        return water;
    }
}