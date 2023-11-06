public class Solution {

    public static int findSum(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }


        if(root.left == null && root.right == null){
            return root.val;
        }
        return 2 * root.val;
    }  
    
    public static boolean isSumTree(TreeNode<Integer> root){

        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }

        int left = findSum(root.left);
        int right = findSum(root.right);





        if(root.val == left + right && isSumTree(root.left) && isSumTree(root.right) ){

            return true;
        }
        else{

            return false;
        }
    }
}
