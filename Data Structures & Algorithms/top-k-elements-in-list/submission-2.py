class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        maps = {}
        freqs = []

        for i in range(len(nums)):
            maps[nums[i]] = maps.get(nums[i], 0) + 1
        
        for key, value in maps.items():
            if value >= k:
                freqs.append(key)
        
        return freqs