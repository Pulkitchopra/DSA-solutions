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

    public static boolean isBalancedBT(TreeNode<Integer> root) {

        if(root == null){
            return true;
        }
        boolean left = isBalancedBT(root.left);
        boolean right = isBalancedBT(root.right);

        boolean difference = Math.abs(heightOfBinaryTree(root.left) - heightOfBinaryTree(root.right)) <= 1;

        if(left && right && difference){

            return true;
        }


        else{

            return false;
        }

    }
}
