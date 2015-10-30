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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        
        if (root == null) return result;
        
        helper(root, new StringBuilder(),result);
        
        return result;
    }
    
    public void helper(TreeNode root, StringBuilder sb, List<String> result){
        if (root.left == null && root.right == null){
            sb.append(root.val);
            result.add(sb.toString());
            return;
        }
        
        sb.append(root.val);
        sb.append("->");
        
        if(root.left != null){
            helper(root.left, new StringBuilder(sb),result);
        }
        
        if(root.right != null){
            helper(root.right, new StringBuilder(sb), result);
        }
        
    }
}
