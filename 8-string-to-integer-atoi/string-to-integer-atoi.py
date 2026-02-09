class Solution(object):
    def myAtoi(self, s):
        i = 0
        n = len(s)
        sign = 1
        result = 0

        # 1. Skip leading spaces
        while i < n and s[i] == ' ':
            i += 1

        # 2. Check sign
        if i < n and (s[i] == '+' or s[i] == '-'):
            sign = -1 if s[i] == '-' else 1
            i += 1

        # 3. Convert digits
        while i < n and s[i].isdigit():
            result = result * 10 + int(s[i])

            # 4. Clamp overflow
            if sign * result >= 2**31 - 1:
                return 2**31 - 1
            if sign * result <= -2**31:
                return -2**31

            i += 1

        return sign * result
