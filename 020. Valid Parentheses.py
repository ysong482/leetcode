class Solution:
    def isValid(self, s: str) -> bool:
        for i in range(len(s)):
            s=s.replace("()","")
            s=s.replace("[]","")
            s=s.replace("{}","")
        if(len(s) == 0):
            return True
        else:
            return False
