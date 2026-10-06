class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int left_answer = 1;
        int right_answer = 1;

        for (int i = 0; i < nums.length; i++) {
            output[i] = left_answer;

            left_answer *= nums[i];
        }

        for (int i = nums.length - 1; i > -1; i--) {
            output[i] *= right_answer;

            right_answer *= nums[i];
        }

        return output;
    }
}  
