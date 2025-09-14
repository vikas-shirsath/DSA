class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            double hours = 0.0;
            for (int pile : piles) {
                hours += Math.ceil((double) pile / mid);
                if (hours > h) break; 
            }

            if (hours <= h) {
                result = mid;
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }

        return result;
    }
}
