//2427. Number of Common Factors

class Solution {
    public int commonFactors(int a, int b) {
        // Calculate the GCD (Greatest Common Divisor) of a and b
        int gcd = gcd(a, b);
        
        // Count the number of factors of the GCD
        return countFactors(gcd);
    }

    // Helper method to calculate the GCD using Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Helper method to count the number of factors of a given number
    private int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++; // i is a factor
                if (i != n / i) {
                    count++; // n / i is also a factor
                }
            }
        }
        return count;
    }
}
