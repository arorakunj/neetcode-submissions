class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<>();

        int left = 0;
        set.add(s.charAt(0));
        int length = 1;

        for (int right = 1; right < s.length(); right++) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
            } else {
                char temp = s.charAt(right);
                while (set.contains(temp)) {
                    set.remove(s.charAt(left));
                    left++;
                }

                set.add(temp);
            }

            length = Math.max(right - left + 1, length);
        }

        return length;
    }
}
