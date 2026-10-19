class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int starting = 0;
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(count, max);
            count = 0;

            if (!set.contains(nums[i] - 1)) {
                starting = nums[i];
            }

            while (set.contains(starting)) {
                starting++;
                count++;
            }
        }

        return max;
    }
}
