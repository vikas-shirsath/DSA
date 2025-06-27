// User function Template for Java
import java.util.*;
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        
        if(m==0 || m > arr.size()){ return -1; }
        
        //Arrays.sort(arr);
        Collections.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        
        for(int i = 0; i + m - 1 < arr.size(); i++) {
            int diff = arr.get(i+m-1) - arr.get(i);
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
        
    }
}