class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0

        vals = set()

        for item in nums:
            vals.add(item)
        
        list_nums = sorted(vals)

        count = 1
        temp_count = 1

        for i in range(len(list_nums)):
            if i > 0 and list_nums[i] == list_nums[i - 1]:
                continue
            
            if i > 0 and list_nums[i] - list_nums[i - 1] == 1:
                temp_count += 1
            elif i > 0 and list_nums[i] - list_nums[i - 1] != 1:
                temp_count = 1
            
            count = max(temp_count, count)
            
        return count
    
        
         