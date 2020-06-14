/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> values = new ArrayList<Integer>();
		if(root == null) return values;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty())
		{
			TreeNode current = stack.pop();
			values.add(0,current.val);
			if(current.left != null)
			{
				stack.push(current.left);
			}
			if(current.right != null)
			{
				stack.push(current.right);
			}
		}
		return values;
	}
}
