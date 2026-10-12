class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int middle = (left + right) / 2;

            if ((middle == nums.length - 1) && 
                (nums[middle - 1] < nums[middle])) {
                return middle;
            }

            if (nums[middle + 1] > nums[middle]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        return left;
    }
}