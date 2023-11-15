class topViewQuestion{

        int hd;

        TreeNode node;





        topViewQuestion(TreeNode node, int hd){

            this.node = node;
            this.hd = hd;
        }
    } 


public class Solution {
    public static List<Integer> getTopView(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();
        Queue<topViewQuestion> q = new LinkedList<>();

        if(root == null){
            return ans;
        }    





        TreeMap<Integer, Integer> topNode = new TreeMap<>();

        q.add(new topViewQuestion(root, 0));

        while(!q.isEmpty()){

            TreeNode n = q.peek().node;

            int h = q.peek().hd;
            q.poll();

            if(!topNode.containsKey(h)){
                topNode.put(h, n.data);
            }
            if(n.left != null){

                q.add(new topViewQuestion(n.left, h - 1));
            }





            if(n.right != null){


                q.add(new topViewQuestion(n.right, h + 1));
            }
        }
        for(Integer t: topNode.values()){

            ans.add(t);
        }
        return ans;
    }
}
