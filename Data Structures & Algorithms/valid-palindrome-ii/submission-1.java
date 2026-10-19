class Solution {
    public boolean validPalindrome(String s) {
        int left;
        int right;
        boolean lefty = true;
        boolean righty = true;

        for (left = 0, right = s.length() - 1; left < right; left++, right--) {
            if (s.charAt(left) != s.charAt(right)) {
                lefty = validPalin(s, left + 1, right);
                righty = validPalin(s, left, right - 1);
                break;
            }
        }

        return lefty || righty;
    }

    public boolean validPalin(String s, int left, int right) {
        for (; left < right; left++, right--) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }

        return true;
    }
}