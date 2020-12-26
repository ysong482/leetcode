class Solution:
    def findComplement(self, num: int) -> int:
        a = bin(num)
        list1 = list(a)
        list1.pop(0)
        list1.pop(0)
        b = "".join(list1)
        b=b.replace("1","2")
        b=b.replace("0","1")
        b=b.replace("2","0")
        c = int(b,2)
        return c  
