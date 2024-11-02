//2490. Circular Sentence

class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int n = words.length - 1;
        for(int i=0; i<n; i++) {
            if(words[i].charAt(words[i].length()-1) != words[i+1].charAt(0)) {
                return false;
            }
        }

        return (words[n].charAt(words[n].length()-1) == words[0].charAt(0));
    }
}