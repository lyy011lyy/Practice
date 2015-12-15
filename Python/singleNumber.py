class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        result = 0;
        for a in nums:
            result = a ^ result;

        return result;
