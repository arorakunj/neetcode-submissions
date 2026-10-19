class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int left = 0;
        int right = nums.length - 1;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int original = -(nums[i]);
            left = i + 1;
            right = nums.length - 1;

            while (left < right) {
                if (nums[left] + nums[right] == original) {
                    List<Integer> vals = List.of(nums[left], nums[right], nums[i]);
                    list.add(vals);
                    left++;
                    right--;
                } else if (nums[left] + nums[right] < original) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return list;
    }
}
