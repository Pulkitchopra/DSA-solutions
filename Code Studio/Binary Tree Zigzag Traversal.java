public class Solution {

	public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
		
		List<Integer> result = new ArrayList<>();

		if(root == null){
			return result;
		}
		Queue <BinaryTreeNode <Integer>> q = new LinkedList<>();


		q.add(root);

		boolean LtoR = true;

		while(!q.isEmpty()){

			List<Integer> ans = new ArrayList<>();

			int size = q.size();

			for(int i = 0; i < size; i++){

				BinaryTreeNode<Integer> frontNode = q.poll();
				if(LtoR){
					ans.add(frontNode.data);
				}
				else{
					ans.add(0, frontNode.data);
				}
				if(frontNode.left != null){
					q.add(frontNode.left );
				}




				if(frontNode.right != null){

					q.add(frontNode.right);
				}
			}
			LtoR = !LtoR;
			for(int i: ans){

				result.add(i);
			}
		}
		return result;
	}
}
