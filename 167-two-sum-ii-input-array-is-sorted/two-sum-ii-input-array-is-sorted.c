#include <stdio.h>

int* twoSum(int* numbers, int numbersSize, int target, int* returnSize) {
    static int ans[2];

    int left = 0;
    int right = numbersSize - 1;

    while (left < right) {
        int sum = numbers[left] + numbers[right];

        if (sum == target) {
            ans[0] = left + 1;   // 1-indexed
            ans[1] = right + 1;
            *returnSize = 2;
            return ans;
        }
        else if (sum < target) {
            left++;
        }
        else {
            right--;
        }
    }

    *returnSize = 0;
    return ans;
}