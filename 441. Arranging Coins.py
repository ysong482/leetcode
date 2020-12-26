class Solution:
    def arrangeCoins(self, n: int) -> int:
        line = 1
        while (line<=n):
            n = n-line
            line = line +1
        return line-1
