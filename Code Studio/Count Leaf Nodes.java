public class Solution {

  public static void inorder(BinaryTreeNode<Integer> root, int count[]){

    if(root == null){

      return;
    }
    inorder(root.left, count);

    if(root.left == null && root.right == null){
      count[0]++;
    }

    inorder(root.right, count);

  }

	public static int noOfLeafNodes(BinaryTreeNode<Integer> root) {
    


    int count [] = {0};

    inorder(root, count);
    return count[0];
	}
}
