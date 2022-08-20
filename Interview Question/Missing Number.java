//https://leetcode.com/problems/missing-number/

class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;

		int sumShouldBe = (length) * (length + 1) / 2;

		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum += nums[i];
		}

		return sumShouldBe - sum;
    }
}
