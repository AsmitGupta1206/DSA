class Solution(object):
    def twoSum(self, nums, target):
        seen = {}   # dictionary to store number and its index

        for i in range(len(nums)):
            needed = target - nums[i]

            if needed in seen:
                return [seen[needed], i]

            seen[nums[i]] = i
