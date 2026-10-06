class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[nums.length * 2];

        System.arraycopy(nums, 0, newArr, 0, n);
        System.arraycopy(nums, 0, newArr, n, n);

        return newArr;
    }
}