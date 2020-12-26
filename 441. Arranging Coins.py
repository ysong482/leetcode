class Solution:
    def arrangeCoins(self, n: int) -> int:
        line = 1
        while (line<=n):
            n = n-line
            line = line +1
        return line-1
#傻办法
    
class Solution:
    def arrangeCoins(self, n: int) -> int:
        line = 1
        while (line*(1+line)/2 <= n):
            line = line +1
        return line-1
#利用等差数列求和公式
