class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (middle * middle == x) {
                return middle;
            }

            if (middle * middle > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return right;
    }
}