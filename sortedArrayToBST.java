public TreeNode sortedArrayToBST(int[] nums) {
	int l = nums.length;
	if(nums == null || l == 0)
	{
		return null;
	}
	return constructBSTRecursive(nums,0,l-1);
}
private TreeNode constructBSTRecursive(int[] nums,int left,int right)
{
	if(left > right)
	{
		return null;
	}
	int mid = left + (right - left) / 2;
	TreeNode current = new TreeNode(nums[mid]);
	current.left = constructBSTRecursive(nums,left,mid-1);
	current.right = constructBSTRecursive(nums,mid+1,right);
	return current; 
}


public class TreeNode
{

	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val,TreeNode left, TreeNode right) 
	{
		this.val = val;
		this.left = left;
		this.right = right;
	}

}
