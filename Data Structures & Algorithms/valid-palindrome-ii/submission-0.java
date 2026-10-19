class Solution {
    public boolean validPalindrome(String s) {
        int left;
        int right;

        for (left = 0, right = s.length() - 1; left < right; left++, right--) {
            if (s.charAt(left) != s.charAt(right)) {
                right--;

                if (s.charAt(left) != s.charAt(right)) {
                    right++;
                    left++;

                    if (s.charAt(left) != s.charAt(right)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}