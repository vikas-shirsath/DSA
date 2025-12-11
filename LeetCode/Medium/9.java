class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs) {
            int[] count = new int[26];
            for(char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int freq : count) {
                sb.append('#');
                sb.append(freq);
            }
            String key = sb.toString();

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}  


// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         HashMap<String,List<String>> map = new HashMap<>();
//         for(String str: strs){
//             char[] c = str.toCharArray();
//             Arrays.sort(c);
//             String cStr = new String(c); // here is already sorted
//             map.putIfAbsent(cStr, new ArrayList<>());
//             map.get(cStr).add(str);
//         }
//         return new ArrayList<>(map.values());
//     }
// }