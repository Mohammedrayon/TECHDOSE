def merge(self, nums: List[List[int]]) -> List[List[int]]:
        nums.sort(key = lambda x:x[0])
        l=[nums[0]]
        for i in range(1,len(nums)):
            if(l[-1][0] <= nums[i][0]):
                if(l[-1][1] >= nums[i][0]):
                    if (l[-1][1] <=nums[i][1]):
                        l[-1][1] =nums[i][1]
                    else:
                        pass    
                else:
                    l.append(nums[i])
        return l 

print(merge([[1,2],[3,4]]))