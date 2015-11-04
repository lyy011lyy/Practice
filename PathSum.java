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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        int result = 0;
        ArrayList<Integer> myList = new ArrayList<Integer>();
        helper(root, result, myList);
        if(myList.contains(sum)){
            return true;
        }else {
            return false;
        }
        
    }
    
    public void helper(TreeNode root, int result, ArrayList<Integer> myList){
        if (root == null) {
            return;
        }else {
            result += root.val;
            if (root.left != null) helper(root.left, result, myList);
            if (root.right != null) helper(root.right, result, myList);
            if (root.left == null && root.right == null) myList.add(result);
        }
        
    }
}


/**
 * Internet method,
 *
 *public boolean hasPathSum(TreeNode root, int sum) {
    if(root == null)
        return false;
    if(root.left == null && root.right==null && root.val==sum)
        return true;
    return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
}
 */

