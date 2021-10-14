public class MaxAndMinDepth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;

        if(root.right == null && root.left == null)
            return 1;

        if(root.right == null)
            return minDepth(root.left) + 1;

        if(root.left == null)
            return minDepth(root.right) + 1;

        return Math.min(minDepth(root.right), minDepth(root.left)) + 1;
    }

    public int maxDepth(TreeNode root) {
       /*Recursively calculate the height of the tree to the left of the                root.
        Recursively calculate the height of the tree to the right of the                root.
        Pick the larger height from the two answers and add one to it (to           account for the root node).*/
        if(root == null) //Our base case
            return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        if(leftDepth > rightDepth)
            return (leftDepth + 1);
        else
            return (rightDepth + 1);
    }

}
