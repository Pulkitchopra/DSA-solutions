public class Solution {
    public static int heightOfBinaryTree(TreeNode root) {


        if(root == null){
            return 0;
        }
        int left = heightOfBinaryTree(root.left);


        int right = heightOfBinaryTree(root.right);

        int ans = Math.max(left, right) + 1;

        return ans;
    }
}
