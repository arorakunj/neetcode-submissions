class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                continue;
            }

            map.put(nums[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int value = entry.getValue();

            if (value >= k) {
                list.add(entry.getKey());
            }
        }

        int[] vals = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            vals[i] = list.get(i);
        }

        return vals;
    }
}
