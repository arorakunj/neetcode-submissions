class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        index = 0
        product = 1
        left = 0
        values = []

        for i in range(len(nums)):
            while (left < len(nums)):
                if left == index:
                    left += 1
                    continue
                
                product *= nums[left]
                left += 1                

            values.append(product)

            index += 1
            left = 0
            product = 1
        
        return values



