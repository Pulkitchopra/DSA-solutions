public class Solution {

    public static TreeNode<Integer> solve(TreeNode<Integer> root, int x, int y){

        if(root == null){
            return null;
        }



        if(root.data == x || root.data == y){

            return root;
        }


        TreeNode<Integer> leftAns = solve(root.left, x, y);

        TreeNode<Integer> rightAns = solve(root.right, x, y);


        if(rightAns == null){
            return leftAns;
        }

        if(leftAns == null){
            return rightAns;
        }
        return root;
    }


    public static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) {

        return solve(root, x, y).data;
        
    }
}
