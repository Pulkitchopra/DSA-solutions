public class Solution {

	public static void solve(BinaryTreeNode<Integer> root, int k, ArrayList<ArrayList <Integer> > count, ArrayList <Integer>  path){





		if(root == null){

			return;
		}
		path.add(root.data);

		solve(root.left, k, count, path);

		solve(root.right, k, count, path);

		int sum = 0;

		for(int i = path.size() - 1; i >= 0; i--){

			sum += path.get(i);
			if(sum == k){
				ArrayList<Integer> temp = new ArrayList<>();





				for(int j = i; j <path.size(); j++){

					temp.add(path.get(j));
				}
				count.add(temp);
				break;
			}
		}



		path.remove(path.size() - 1);
	}


    public static ArrayList < ArrayList < Integer >> kPathSum(BinaryTreeNode < Integer > root, int k) {

		ArrayList< ArrayList <Integer> > count = new ArrayList<>();

		ArrayList<Integer> path = new ArrayList<>();

		solve(root, k, count, path);
		return count;


    }
}
