/**
 * CombinationSumIITest.java
 * 2015��10��22��
 */
package net.watoud.learn.algorithm.leetcode;

import org.junit.Test;

/**
 * @author lixudong
 *
 */
public class CombinationSumIITest
{
	@Test
	public void testCombinationSum2()
	{
		CombinationSumII sol = new CombinationSumII();

		ListUtils.print(sol.combinationSum2(new int[] { 10, 1, 1, 2, 7, 6, 2, 1, 5 }, 8));
	}
}