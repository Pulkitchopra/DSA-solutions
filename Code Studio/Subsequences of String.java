class Solution {


    public static void solve(String str, String output, int index, ArrayList<String> ans){

        if(index >= str.length()){



            if(output != ""){

            ans.add(output);

            }
            return;
        }

        solve(str, output, index + 1, ans);

        output = output + str.charAt(index);







        solve(str, output, index + 1, ans);
    }


    public static ArrayList<String> subsequences(String str) {

        ArrayList<String> ans = new ArrayList<>();

        String output = "";

        int index = 0;

        solve(str, output, index, ans);

        return ans;
    }
}
