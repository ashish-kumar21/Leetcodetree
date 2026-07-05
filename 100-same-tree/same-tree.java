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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // case 1 : both are null
        if(p == null && q == null) {
            return true;

        }

        //case 2 : one is null
        if (p == null || q == null) {
            return false;
        }

        // case 3: value are different
        if (p.val != q.val) {
            return false;
        }

        //case 4 : cheak left and right subtree
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}