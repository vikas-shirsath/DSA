class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        
        while(i>=0 && nums[i] >= nums[i+1]) {
            i--;
        }


        for(int j = n - 1; j > i && i>=0; j--) {
            if(nums[j] > nums[i]) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        reverse(nums, i+1, n-1);

    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}