class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        int[] lastIndex = new int[256]; //ascii size

        for(int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }

        int start = 0;
        int maxLen = 0;

        for(int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            if(lastIndex[ch] >= start) {
                start = lastIndex[ch] + 1;
            }

            lastIndex[ch] = end;

            int currLen = end - start + 1;

            if(currLen > maxLen) {
                maxLen = currLen;
            }
        }

        return maxLen;
    }
}