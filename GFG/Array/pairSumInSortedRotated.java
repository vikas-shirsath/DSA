
class Solution {
    static boolean pairInSortedRotated(int nums[], int target) {
        // Your code here
        int n = nums.length;
        int pivot = -1;
        
        for(int i = 0; i < n - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                pivot = i;
                break;
            }
        }
        
        if(pivot == -1) pivot = n - 1;
        
        int left = (pivot + 1) % n;
        int right = pivot;
        
        while(left != right) {
            int sum = nums[left] + nums[right];
            if(sum == target) {
                return true;
            } else if( sum < target) {
                left = (left + 1) % n;
            } else {
                right = (n + right -1) % n;
            }
            
        }
        
        return false;
    }
}
