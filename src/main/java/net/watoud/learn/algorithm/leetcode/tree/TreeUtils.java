package net.watoud.learn.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeUtils
{
	public static TreeLinkNode createTreeLinkNodesFromArray(String[] dat)
	{
		if (dat == null || dat.length == 0)
		{
			return null;
		}

		TreeLinkNode[] result = new TreeLinkNode[dat.length];
		for (int i = 0; i < result.length; i++)
		{
			if (dat[i].equals("X"))
			{
				result[i] = null;
			}
			else
			{
				result[i] = new TreeLinkNode(Integer.valueOf(dat[i]));
			}
		}

		for (int i = 0; i < result.length; i++)
		{
			if (result[i] != null)
			{
				if ((i + 1) * 2 - 1 < result.length)
				{
					result[i].left = result[(i + 1) * 2 - 1];
				}

				if ((i + 1) * 2 < result.length)
				{
					result[i].right = result[(i + 1) * 2];
				}
			}
		}

		return result[0];
	}

	public static int[] inorder(TreeNode root)
	{
		if (root == null)
		{
			return new int[0];
		}
		List<Integer> res = new ArrayList<>();
		inorderAux(root, res);
		int[] dat = new int[res.size()];
		for (int i = 0; i < res.size(); i++)
		{
			dat[i] = res.get(i);
		}
		return dat;
	}

	private static void inorderAux(TreeNode root, List<Integer> res)
	{
		if (root.left != null)
		{
			inorderAux(root.left, res);
		}
		res.add(root.val);
		if (root.right != null)
		{
			inorderAux(root.right, res);
		}
	}

	public static TreeNode createTreeFromArray(String[] dat)
	{
		if (dat == null || dat.length == 0)
		{
			return null;
		}

		TreeNode[] result = new TreeNode[dat.length];
		for (int i = 0; i < result.length; i++)
		{
			if (dat[i].equals("X"))
			{
				result[i] = null;
			}
			else
			{
				result[i] = new TreeNode(Integer.valueOf(dat[i]));
			}
		}

		for (int i = 0; i < result.length; i++)
		{
			if (result[i] != null)
			{
				if ((i + 1) * 2 - 1 < result.length)
				{
					result[i].left = result[(i + 1) * 2 - 1];
				}

				if ((i + 1) * 2 < result.length)
				{
					result[i].right = result[(i + 1) * 2];
				}
			}
		}

		return result[0];
	}

	public static void printTreeNode(TreeNode root)
	{
		if (root == null)
		{
			return;
		}

		printTreeNode(root.left);

		System.out.println(root.val);

		printTreeNode(root.right);
	}

	public static TreeNode createBST(int[] dat)
	{
		if (dat == null || dat.length == 0)
		{
			return null;
		}

		TreeNode root = new TreeNode(dat[0]);

		for (int i = 1; i < dat.length; i++)
		{
			TreeNode pos = root;

			while (true)
			{
				if (dat[i] <= pos.val && pos.left != null)
				{
					pos = pos.left;
				}
				else if (dat[i] > pos.val && pos.right != null)
				{
					pos = pos.right;
				}
				else
				{
					break;
				}
			}

			if (dat[i] <= pos.val)
			{
				pos.left = new TreeNode(dat[i]);
			}
			else
			{
				pos.right = new TreeNode(dat[i]);
			}
		}

		return root;
	}
}
