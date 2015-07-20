/**
LeetCode : Invert a binary tree
July 19th, 2015
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (q.peek() != null){
        TreeNode node = q.peek(); q.poll();
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        if(node.left!=null) q.add(node.left);
        if(node.right!=null) q.add(node.right);
        }
        
        return root;
    }

    public TreeNode invertTree(TreeNode root) {
    	if (root == null) return null;
	TreeNode tmp = root.left;
	root.left = invertTree(root.right);
	root.right = invertTree(tmp);
	return root;
    }
}
