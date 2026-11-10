class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0

        vals = set()

        for item in nums:
            vals.add(item)
        
        count = 1
        temp_count = 1

        for num in vals:
            if num - 1 not in vals:
                while True:
                    if num + 1 in vals:
                        temp_count += 1
                        num += 1
                    else:
                        break
            
            count = max(count, temp_count)
            temp_count = 0
        
        return count
    
        
         