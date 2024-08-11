//Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int start = 0;
        int end = height.length-1;
        while(start < end) {
            int high = Math.min(height[start],height[end]);
            int currArea = high * (end - start);
            if(currArea>area) {
                area = currArea;
            }
            if(height[start]>height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return area;
    }
}