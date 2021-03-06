package net.watoud.learn.algorithm.leetcode;

public class HouseRobber
{

	public int rob(int[] nums)
	{
		if (nums == null || nums.length == 0)
		{
			return 0;
		}
		int[] result = new int[nums.length];
		if (nums.length == 1)
		{
			return nums[0];
		}

		if (nums.length >= 2)
		{
			result[0] = nums[0];
			result[1] = Math.max(nums[0], nums[1]);
		}

		for (int i = 2; i < nums.length; i++)
		{
			result[i] = Math.max(result[i - 1], result[i - 2] + nums[i]);
		}

		return result[nums.length - 1];
	}
}
