class Solution {
    // Function to arrange all letters of a string in lexicographical
    // order using Counting Sort.
    public static String countSort(String arr) {
        // code here
        if(arr == "") return "";
        
        int[] count = new int[26];
        
        for(int i = 0; i < arr.length(); i++) {
            char c = arr.charAt(i);
            count[c - 'a']++;
        }
        
        StringBuilder sortedStr = new StringBuilder();
        
        for(int i = 0; i < 26; i++) {
            while(count[i] != 0) {
                sortedStr.append((char) ('a' + i));
                count[i]--;
            }
        }
        
        return sortedStr.toString();
        
    }
}