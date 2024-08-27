#2535. Difference Between Element Sum and Digit Sum of an Array
class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        elementSum = 0
        digitSum = 0
        for num in nums:
            elementSum += num
            while num:
                digitSum += num % 10
                num = num // 10

        return abs(elementSum - digitSum)
