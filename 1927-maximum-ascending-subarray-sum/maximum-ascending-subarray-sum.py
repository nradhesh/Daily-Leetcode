class Solution:
    def maxAscendingSum(self, nums: List[int]) -> int:
        n = len(nums)
        res = 0
        sum1 = 0
        for i in range(0 , n):
            if i == 0:
                sum1 += nums[0]
            elif nums[i] > nums[i-1]:
                sum1 += nums[i]
                print(sum1)
            else:
                res = max(res , sum1)
                # print(res)
                sum1 = nums[i]
            res = max(res , sum1)

        return res
            