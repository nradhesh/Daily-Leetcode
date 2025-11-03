class Solution:
    def minCost(self, colors: str, nt: List[int]) -> int:
        prev = colors[0]
        count = 0
        maxval = nt[0]
        ans = 0
        for i ,c in enumerate(colors[1:] , 1):
            if c== prev:
                ans += min(maxval , nt[i])
                maxval = max(maxval  , nt[i])
            else:
                maxval = nt[i]
            prev = c
        return ans