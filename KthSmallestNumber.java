/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        int result = 0;

        while ( !stack.isEmpty() || p!= null) {
            if (p !=null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode temp = stack.pop();
                k--;
                if (k == 0){
                    result = temp.val;
                    continue;
                }
                p = temp.right;
            }
        }
        return result;
    }
}
