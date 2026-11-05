class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        maps = {}
        arr = []

        for i in range(len(nums)):
            difference = target - nums[i]

            if difference in maps:
                arr = [maps[difference], i]
                break
            
            maps[nums[i]] = i

        return arr