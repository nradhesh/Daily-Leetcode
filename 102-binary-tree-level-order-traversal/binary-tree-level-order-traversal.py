# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def levelOrder(self, node: Optional[TreeNode]) -> List[List[int]]:
        if not node:
            return []
        res = []
        q = deque([node])
        while q:
            n = len(q)
            level = []
            for _ in range(n):
                node =q.popleft()
                level.append(node.val)

                if node.left:
                    q.append(node.left)
                if node.right :
                    q.append(node.right)
            res.append(level)
        return res
