int divide(int dividend, int divisor) {
    // Special case:  -2147483648 / -1
    if (dividend == -2147483648 && divisor == -1)
        return 2147483647;

    int negative = 0;

    if (dividend < 0)
        negative = !negative;

    if (divisor < 0)
        negative = !negative;

    long long a = dividend;
    long long b = divisor;

    if (a < 0)
        a = -a;

    if (b < 0)
        b = -b;

    long long quotient = 0;

    while (a >= b) {
        long long temp = b;
        long long multiple = 1;

        while (a >= temp + temp) {
            temp = temp + temp;
            multiple = multiple + multiple;
        }

        a = a - temp;
        quotient = quotient + multiple;
    }

    if (negative)
        quotient = -quotient;

    if (quotient > 2147483647)
        return 2147483647;

    if (quotient < -2147483648LL)
        return -2147483648LL;

    return (int)quotient;
}