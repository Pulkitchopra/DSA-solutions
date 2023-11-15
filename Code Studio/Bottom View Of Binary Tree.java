class bottomViewQuestion{

        int hd;

        TreeNode node;





        bottomViewQuestion(TreeNode node, int hd){

            this.node = node;
            this.hd = hd;
        }
    }


public class Solution {

    public static List<Integer> bottomView(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();

        Queue<bottomViewQuestion> q = new LinkedList<>();

        if(root == null){

            return ans;
        }


        TreeMap<Integer, Integer> bottomNode = new TreeMap<>();

        q.add(new bottomViewQuestion(root, 0));

        while(!q.isEmpty()){

            TreeNode n = q.peek().node;

            int h = q.peek().hd;
            q.poll();

            bottomNode.put(h, n.val);

            if(n.left != null){
                q.add(new bottomViewQuestion(n.left, h - 1));
            }







             if(n.right != null){


                q.add(new bottomViewQuestion(n.right, h + 1));
            }
        }
        for(Integer t: bottomNode.values()){

            ans.add(t);
        }
        return ans;
    }
}
