class Solution {

    public int primePalindrome(int n) {

        // Special cases
        if (n <= 2) return 2;
        if (n <= 3) return 3;
        if (n <= 5) return 5;
        if (n <= 7) return 7;
        if (n <= 11) return 11;

        // Generate odd-length palindromes
        for (int left = 1; left < 100000; left++) {

            String s = String.valueOf(left);

            // Create palindrome by reversing left
            String rev = new StringBuilder(s).reverse().toString();

            // Remove last digit to make odd length
            String palindrome = s + rev.substring(1);

            int num = Integer.parseInt(palindrome);

            if (num >= n && isPrime(num)) {
                return num;
            }
        }

        return -1;
    }

    private boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        if (num % 2 == 0) {
            return num == 2;
        }

        for (int i = 3; i * i <= num; i += 2) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}