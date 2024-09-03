// 1945. Sum of Digits of String After Convert

class Solution {
    public int getLucky(String s, int k) {
        StringBuilder num = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            int temp = (int)(s.charAt(i)) - (int)('a') + 1;
            num.append(temp);
        }
        while(k > 0) {
            k--;
           int sum = 0;
            for(int i = 0; i < num.length(); i++) {
                sum += num.charAt(i) - '0';
            }
            num = new StringBuilder(String.valueOf(sum));
        }
        return  Integer.parseInt(num.toString());
    }
}
