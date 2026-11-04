class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_sorted = sorted(s)
        t_sorted = sorted(t)

        dict_s = {}
        dict_t = {}

        for i in range(len(s_sorted)):
            dict_s[i] = s_sorted[i]
        
        for i in range(len(t_sorted)):
            dict_t[i] = t_sorted[i]
        

        if dict_s == dict_t:
            return True
        
        return False