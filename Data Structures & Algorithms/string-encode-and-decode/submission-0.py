class Solution:
    def encode(self, strs: List[str]) -> str:
        string = ""

        for i in range(len(strs)):
            string += f"{len(strs[i])}~{strs[i]}"
        
        return string

    def decode(self, s: str) -> List[str]:
        strings = []
        i = 0

        while i < len(s):
            j = i

            while s[j] != "~":
                j += 1

            length = int(s[i: j])
            strings.append(s[j + 1: j + 1 + length])

            i = 1 + j + length
        
        return strings
