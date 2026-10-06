class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int x = 0;
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            x = target - nums[i];

            if (map.containsKey(x)){
                indices[0] = map.get(x);
                indices[1] = i;
                break;
            }

            map.put(nums[i], i);
        }

        return indices;
    }
}
