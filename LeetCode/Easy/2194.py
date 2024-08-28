class Solution:
    def cellsInRange(self, s: str) -> List[str]:
        first_alpha = ord(s[0])
        first_num = int(s[1])
        second_alpha = ord(s[3])
        second_num = int(s[4])
        s1 = []
        for i in range(first_alpha,second_alpha+1):
            for j in range(first_num, second_num+1):
                s2 = str(chr(i)) + str(j)
                s1.append(s2)

        return s1