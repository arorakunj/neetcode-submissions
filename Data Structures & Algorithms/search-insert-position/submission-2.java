class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        while (left <= right) {
            int middle = (right + left) / 2;

            if (left == right) {
                index = middle + 1;
                break;
            }

            if (target > nums[middle]) {
                left = middle + 1;
            } else if (target < nums[middle]) {
                right = middle - 1;
            }
        }

        return index;
    }
}