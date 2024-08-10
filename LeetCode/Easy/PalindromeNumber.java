class Solution {
    public boolean isPalindrome(int x) {
       if (x < 0) {
            return false;
        }
        int x1 = x;
        int x2 = 0;
        while(x1 != 0) {
            int digit = x1 % 10;
            x2 = (x2 * 10) + digit;
            x1 /= 10;
        }
        return x == x2;
    }
}