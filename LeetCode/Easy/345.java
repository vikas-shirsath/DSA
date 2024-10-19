class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length-1;

        while(left < right) {
            while (left < right && ("aeiouAEIOU".indexOf(chars[left]) == -1)) {
                left++;
            }

             while (left < right && ("aeiouAEIOU".indexOf(chars[right]) == -1)) {
                right--;
            }

            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }
}