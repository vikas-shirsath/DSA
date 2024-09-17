//171. Excel Sheet Column Number

class Solution {
    public int titleToNumber(String columnTitle) {
        int count = 0;
        int num = 0;
        for(int i = columnTitle.length() -1; i>=0; i--) {
            int current = columnTitle.charAt(i) - 'A' + 1;
            current = current * (int)Math.pow(26, count);
            num = num + current;
            count ++;
        }
        
        return num;
    }
}