#1528. Shuffle String

class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        shuffled = ""
        for i in range(0,len(s)):
            for j in range(0, len(indices)):
                if i == indices[j]:
                    shuffled = shuffled + s[j]
                    break

        return shuffled
