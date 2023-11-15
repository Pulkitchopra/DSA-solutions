public class Solution {

    public static void solve(BinaryTreeNode<Integer> root, List<Integer> ans, int level){

        if(root == null){
            return;
        }





        if(level == ans.size()){

            ans.add(root.data);
        }
        solve(root.right, ans, level + 1);

        solve(root.left, ans, level + 1);

    }

    public static ArrayList<Integer> printRightView(BinaryTreeNode<Integer> root) {

        ArrayList<Integer> ans = new ArrayList<>();

        solve(root, ans, 0);

        return ans;
    }
}
