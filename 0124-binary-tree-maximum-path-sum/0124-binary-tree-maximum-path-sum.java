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
    private int maxSum;
    public int maxPathSum(TreeNode root){
        maxSum = Integer.MIN_VALUE;
        maxPathSum1(root);
        return maxSum;
    }
    public int maxPathSum1(TreeNode root) {
        if(root == null) return 0;

        int leftSum = Math.max(0,maxPathSum1(root.left));
        int rightSum = Math.max(0,maxPathSum1(root.right));

        int currentSum = root.val + leftSum+rightSum;

        maxSum = Math.max(currentSum,maxSum);
        return root.val+Math.max(leftSum,rightSum);
    }
}