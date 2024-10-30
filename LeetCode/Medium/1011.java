//1011. Capacity To Ship Packages Within D Days

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = getMax(weights);
        int right = getSum(weights);

        while(left < right) {
            int mid = (right - left)/2 + left;
            if(canShip(weights, days, mid)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int getMax(int[] weights) {
        int max = 0;
        for(int weight : weights) {
            max = Math.max(weight, max);
        }
        return max;
    }

    private int getSum(int[] weights) {
        int sum = 0;
        for(int weight : weights) {
            sum += weight;
        }
        return sum;
    }

    private boolean canShip(int[] weights, int d, int cap) {
        int ds = 1;
        int currentWeight = 0;

        for(int weight : weights) {
            currentWeight += weight;
            if(currentWeight > cap) {
                currentWeight = weight;
                ds++;

                if(ds > d) {
                    return false;
                }
            }
        }
        return true;
    }
}