class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            String words = String.valueOf(word);

            if (!hash.containsKey(words)) {
                hash.put(words, new ArrayList<>());
            }

            hash.get(words).add(strs[i]);
            
        }

        return new ArrayList<>(hash.values());
    }
}
