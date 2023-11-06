public class Solution {

    public static int heightOfBinaryTree(TreeNode<Integer> root){

        if(root == null){
            return 0;
        }
        int left = heightOfBinaryTree(root.left);


        int right = heightOfBinaryTree(root.right);

        int ans = Math.max(left, right) + 1;
        return ans;
    }

    public static int diameterOfBinaryTree(TreeNode<Integer> root) {

        if(root == null){
            return 0;
        }

        int l = diameterOfBinaryTree(root.left);
        int r = diameterOfBinaryTree(root.right);
        int result = heightOfBinaryTree(root.left) + heightOfBinaryTree(root.right);

        int ans = Math.max(l, Math.max(r, result));
        return ans;
    }
}
