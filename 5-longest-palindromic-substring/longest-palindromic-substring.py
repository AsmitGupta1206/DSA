class Solution(object):
    def longestPalindrome(self, s):
        if not s:
            return ""

        result = ""

        for i in range(len(s)):
            # Odd length palindrome
            p1 = self.expand(s, i, i)
            # Even length palindrome
            p2 = self.expand(s, i, i + 1)

            if len(p1) > len(result):
                result = p1
            if len(p2) > len(result):
                result = p2

        return result

    def expand(self, s, left, right):
        while left >= 0 and right < len(s) and s[left] == s[right]:
            left -= 1
            right += 1
        return s[left + 1:right]

        