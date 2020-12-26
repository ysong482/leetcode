class Solution:
    def reverse(self, x: int) -> int:
        if (x > 2147483647 or x < -2147483647):
            return 0
        a = str(x)
        list1 = list(a)
        if(list1[0]=="-"):
            list1.pop(0)
            list1.reverse()
            list1.insert(0,"-")
        else:
            list1.reverse()
        aws = "".join(list1)
        awi = int(aws)
        if (awi > 2147483647 or awi < -2147483647):
            return 0
        return awi
        
#第一次用py写代码
