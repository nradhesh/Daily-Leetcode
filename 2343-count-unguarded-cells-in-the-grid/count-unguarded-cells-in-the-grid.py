class Solution:
    def countUnguarded(self, m: int, n: int, guards: List[List[int]], walls: List[List[int]]) -> int:
        grid = [['.' for _ in range(n)] for _ in range(m)]

        for r ,c in walls:
            grid[r][c] = 'w'
        
        for r ,c in guards:
            grid[r][c] = 'g'

        for r , c   in guards:
            for i in range(r+1 ,m):
                if grid[i][c] in ('g' , 'w'):
                    break
                grid[i][c] = 'y'

            for i in range(r-1 , -1 , -1):
                if grid[i][c] in ('g' , 'w'):
                    break
                grid[i][c] = 'y'
            for i in range(c+1 ,n):
                if grid[r][i] in ('g' , 'w'):
                    break
                grid[r][i] = 'y'
            for i in range(c-1 , -1 ,-1):
                if grid[r][i] in ('g' , 'w'):
                    break
                grid[r][i] = 'y'
        res = 0
        for i in range(m):
            for j in range(n):
                if grid[i][j] not in ('y' , 'g' , 'w'):
                    res+=1
        return res