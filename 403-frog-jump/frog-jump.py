class Solution:
    def canCross(self, stones: List[int]) -> bool:
        dp = {stone : set() for stone in stones}
        dp[0] = {0}
        for stone in stones:
            for x in dp[stone]:
                for k in [x- 1 , x , x+1]:
                    if k > 0 and stone + k in dp:
                        dp[stone+k].add(k)
        print(dp)
        return len(dp[stones[-1]])>0
