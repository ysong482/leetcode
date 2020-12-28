class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        templist = []
        ans =[[]]
        lengthnums = pow(2,len(nums))
        for index in range(lengthnums):
            c = bin(index)
            listc = list(c)
            listc.pop(0)
            listc.pop(0)
            while(len(listc)< len(nums)):
                listc.insert(0,"0")
            for j in range(len(listc)):
                if(listc[j] == "1"):
                    templist.append(nums[j])
            if(templist != []):
                ans.append(templist)
            templist = []
        return ans

