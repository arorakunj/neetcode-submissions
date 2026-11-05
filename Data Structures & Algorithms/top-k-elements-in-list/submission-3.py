class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        maps = {}

        for i in range(len(nums)):
            maps[nums[i]] = maps.get(nums[i], 0) + 1
        
        sorted_vals = sorted(maps, key=maps.get)
        
        return sorted_vals[-k:]