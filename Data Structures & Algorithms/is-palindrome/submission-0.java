class Solution {
    public boolean isPalindrome(String s) {
        int i;
        int j;

        for (i = 0, j = s.length() - 1; i < s.length() && j >= 0; i++, j--) {
            if (!Character.isLetterOrDigit(s.charAt(i))) i++;

            if (!Character.isLetterOrDigit(s.charAt(j))) j--;

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }

        return true;
    }
}
