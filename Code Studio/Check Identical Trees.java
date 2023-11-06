public class Solution {
    public static boolean identicalTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
        

        if(root1 == null && root2 == null){

            return true;
        }




        if((root1 != null && root2 == null) || (root1 == null && root2 != null) ){
            return false;
        }

        boolean left = identicalTrees(root1.left, root2.left);

        boolean right = identicalTrees(root1.right, root2.right);

        boolean value = root1.data == root2.data;

        if(left && right && value){
            return true;
        }

        else {
            return false;
        }
    }
}
