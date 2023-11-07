public class Solution {

    public static void traverseLeft(TreeNode root, List<Integer> ans){

        if((root == null) || (root.left == null && root.right == null) ){
            return;
        }



        ans.add(root.data);

        if(root.left != null){

            traverseLeft(root.left, ans);
        }
        else{

            traverseLeft(root.right, ans);
        }
    }

    public static void traverseLeaf(TreeNode root, List<Integer> ans){

        if(root == null){
            return;
        }





        if(root.left == null && root.right == null){
            
            ans.add(root.data);
            
            return;
        }
        traverseLeaf(root.left, ans);
        
        traverseLeaf(root.right, ans);    
    }

    public static void traverseRight(TreeNode root, List<Integer> ans){

        if((root == null) || (root.left == null && root.right == null) ){
            return;
        }
        if(root.right != null){






            traverseRight(root.right, ans);
        }

        else{
            traverseRight(root.left, ans);
        }
        ans.add(root.data);
    }
    public static List<Integer> traverseBoundary(TreeNode root){
        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }
        ans.add(root.data);
        traverseLeft(root.left, ans);


        traverseLeaf(root.left, ans);
        traverseLeaf(root.right, ans);
        traverseRight(root.right, ans);
        return ans;
       
    }
}
