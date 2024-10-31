//74. Search a 2D Matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right =  (m * n) - 1;

        while(left <= right) {
            int mid = (right - left)/2 + left;
            int val = matrix[mid/n][mid%n];

            if(val == target) {
                return true;
            } else if (target > val) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}