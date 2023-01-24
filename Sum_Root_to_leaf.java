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
    public int sumPathNumber(TreeNode root, int val){
        if(root == null){
            return 0;
        }
        val = (val*10 + root.val);
        if(root.left == null && root.right == null){
            return val;
        }

        return sumPathNumber(root.left,val)+sumPathNumber(root.right, val);
    }
    public int sumNumbers(TreeNode root) {
        int val = sumPathNumber(root,0);
        return val;
    }
}
