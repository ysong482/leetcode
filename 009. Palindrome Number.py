class Solution:
    def isPalindrome(self, x: int) -> bool:
        a = str(x)
        list1 = list(a)
        if(list1[0] == "-"):
            return False
        l1=[]
        l2=[]
        for i in range(len(list1)):
            temp = list1.pop()
            l1.append(temp)
            l2.append(temp)
        l1.reverse()

        for i in range(len(l1)):
            if(l1[i] != l2[i]):
                return False

        return True
#第二种方法        
class Solution:
    def isPalindrome(self, x: int) -> bool:
        a = str(x)
        list1 = list(a)
        if(list1[0] == "-"):
            return False

        for i in range(len(list1)//2):
            if(list1.pop(0) != list1.pop()):
                return False

        return True
