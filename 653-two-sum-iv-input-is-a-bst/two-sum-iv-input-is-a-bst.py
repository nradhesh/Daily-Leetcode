# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import defaultdict
class Solution:
    def findTarget(self, root: Optional[TreeNode], k: int) -> bool:
        def dfs(root, st):
            if not root:
                return False
            if (k-root.val) in st:
                return True
            st.add(root.val)
            return dfs(root.left , st) or dfs(root.right , st)
        return dfs(root , set())
       