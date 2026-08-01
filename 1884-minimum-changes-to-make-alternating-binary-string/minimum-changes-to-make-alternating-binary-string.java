class Solution {
    public int minOperations(String s) {
        int startWith0 = 0;
        int startWith1 = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Expected character if string starts with '0'
            char expected0 = (i % 2 == 0) ? '0' : '1';

            // Expected character if string starts with '1'
            char expected1 = (i % 2 == 0) ? '1' : '0';

            if (c != expected0)
                startWith0++;

            if (c != expected1)
                startWith1++;
        }

        return Math.min(startWith0, startWith1);
    }
}