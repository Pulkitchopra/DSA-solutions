public class Solution {

    public static TreeNode solve(int inorder[], int preorder[], int inOrderStart, int inOrderEnd, int preOrderStart, int preOrderEnd, Map<Integer, Integer> map){
        
        if(preOrderStart > preOrderEnd || inOrderStart > inOrderEnd){
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[preOrderStart]);
        int leftIndex = map.get(root.data);
        int element = leftIndex - inOrderStart;
        
        root.left = solve(inorder, preorder, inOrderStart, leftIndex - 1, preOrderStart + 1, preOrderStart + element, map);
        root.right = solve(inorder, preorder, leftIndex + 1, inOrderEnd, preOrderStart + element + 1, preOrderEnd, map);
        return root;
    }


    public static TreeNode buildBinaryTree(int[] inorder, int[] preorder) {
        

        int inOrderStart = 0;
        int inOrderEnd = inorder.length - 1;

        int preOrderStart = 0;
        int preOrderEnd = preorder.length - 1;


        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }


        TreeNode ans = solve(inorder, preorder, inOrderStart, inOrderEnd, preOrderStart, preOrderEnd, map);
        return ans;
    }
}
