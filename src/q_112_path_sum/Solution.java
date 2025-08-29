package q_112_path_sum;

public class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null) return false;

        return helpar(root, 0, targetSum);
    }

    private boolean helpar(TreeNode root, int currentSum, int targetSum) {

        int temp = currentSum + root.val;


        // leaf
        if (root.left == null && root.right == null) {

            System.out.println("leaf current sum: " + temp + "/n");
            return temp == targetSum;
        }

        boolean left = false;
        boolean right = false;

        if(root.left != null)
            left = helpar(root.left, currentSum + root.val, targetSum);

        if(root.right != null)
            right = helpar(root.right, currentSum + root.val, targetSum);

        return left || right;

    }
}
