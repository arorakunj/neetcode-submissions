class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        product = 1
        values = []

        for i in range(len(nums)):
            values.append(product)
            product *= nums[i]
        
        product = 1
        
        for i in range(len(nums) - 1, -1, -1):
            values[i] = values[i] * product
            product *= nums[i]
        
        return values



