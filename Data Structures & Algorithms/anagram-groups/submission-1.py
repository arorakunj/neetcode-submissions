class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map_words = {}

        for i in range(len(strs)):
            sorted_word = "".join(sorted(strs[i]))

            if sorted_word in map_words:
                map_words[sorted_word].append(strs[i])
            else:
                map_words[sorted_word] = [strs[i]]
        
        return list(map_words.values())