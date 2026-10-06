class Solution {
    public boolean isSubsequence(String s, String t) {
        int i;
        int j;

        for (i = 0, j = 0; i < s.length() && j < t.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                continue;
            }
        }

        if (i == s.length()) return true;

        return false;
    }
}