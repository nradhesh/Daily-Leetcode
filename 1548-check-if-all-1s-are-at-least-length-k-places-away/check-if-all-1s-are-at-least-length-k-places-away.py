class Solution:
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        count = 0
        for i , x in enumerate(nums):
            if x == 1:
                nums = nums[i:]
                break
        for i , x in enumerate(nums):
            if x == 1 and count < k and i != 0:
                return False
            if x == 1 and count >= k :
                count = 0
            if x == 0:
                count+=1
        return True