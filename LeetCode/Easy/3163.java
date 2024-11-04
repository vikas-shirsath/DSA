//3163. String Compression III


class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int i = 0;
        while(i < word.length()) {
            char curr = word.charAt(i);
            int count = 0;
            while(i < word.length() && word.charAt(i) == curr && count<9) {
                count++;
                i++;
            }
            comp.append(count).append(curr);
        }
        return comp.toString();
    }
}