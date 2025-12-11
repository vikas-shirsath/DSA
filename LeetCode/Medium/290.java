class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        Map<Character, String> hm = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            char ch = pattern.charAt(i);
            String word = arr[i];
            if(!hm.containsKey(ch)) {
                if(hm.containsValue(word)) {
                    return false;
                }
                hm.put(ch, word);
            } else if(!hm.get(ch).equals(word)) {
                return false;
            }
        }

        return true;
    }
}