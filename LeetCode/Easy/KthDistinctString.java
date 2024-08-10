package LeetCode.Easy;
class Solution {
    public String kthDistinct(String[] arr, int k) {
        String distinct = "";
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            boolean flag = true;
            for(int j=0; j<arr.length; j++) {
                if(arr[i].equals(arr[j]) && i!=j) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                count++;
                if(count == k) {
                    return arr[i];
                }
            }
        }
        return "";
    }
}