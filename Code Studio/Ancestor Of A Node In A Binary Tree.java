public class Solution {   

    public static BinaryTreeNode<Integer> solve(BinaryTreeNode<Integer> root, int targetNodeVal, int kth []){
        if(root == null){
            return null;
        }


        if(root.data == targetNodeVal){
            return root;
        }
        BinaryTreeNode<Integer> leftAns = solve(root.left, targetNodeVal, kth);

        
        BinaryTreeNode<Integer> rightAns = solve(root.right, targetNodeVal, kth);


        if(leftAns != null & rightAns == null){
            kth[0]--;
            if(kth[0] <= 0){
                kth[0] = Integer.MAX_VALUE;
                return root;
            }
            return leftAns;
        }




         if(leftAns == null & rightAns != null){
            kth[0]--;
             
            if(kth[0] <= 0){
                kth[0] = Integer.MAX_VALUE;
                return root;
            }
            return rightAns;
        }
        return null;
    }

    static int findKthAncestor(BinaryTreeNode<Integer> root, int targetNodeVal, int kth) {
        int k[] = {kth};
        BinaryTreeNode<Integer> ans = solve(root, targetNodeVal, k);
        if(ans == null || ans.data == targetNodeVal){

            return -1;
        }








        return ans.data;
        
       
    }
}   
