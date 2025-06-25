class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
    int n = arr.length;
    
    if(n == 0) {
        return new Pair<>(null, null);
    }
    
    if(n == 1) {
        return new Pair<>(arr[0], arr[0]);
    }
    
    int minVal, maxVal;
    
    if(arr[0] > arr[1]) {
        maxVal = arr[0];
        minVal = arr[1];
    } else {
        maxVal = arr[1];
        minVal = arr[0];
    }
    
    for(int i = 2; i <= n-2; i += 2) { 
        int localMin, localMax;
        
        if(arr[i] > arr[i+1]) {
            localMin = arr[i+1];
            localMax = arr[i];
        } else {
            localMin = arr[i];
            localMax = arr[i+1];
        }
        
        if(localMin < minVal) {
            minVal = localMin;
        }
        
        if(localMax > maxVal) {
            maxVal = localMax;
        }
    }
    
    if(n % 2 != 0) {
        int last = arr[n-1];
        
        if(last < minVal) {
            minVal = last;
        }
        
        if(last > maxVal) {
            maxVal = last;
        }
    }
    
    return new Pair<>(minVal, maxVal);
}
}