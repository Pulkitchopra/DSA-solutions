class Solution {

    public static void solve(String digit, StringBuilder output, int index, List<String> ans, String mapping []){


        if(index >= digit.length()){

            ans.add( new String(output));

            return;
        }


        int number = digit.charAt(index) - '0';

        String value = mapping [number];

        for(char c: value.toCharArray()){

            output.append(c);

            solve(digit, output, index + 1, ans, mapping);

            output.deleteCharAt(output.length()-1);
        }
    }





    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if(digits.length() == 0){

            return ans;
        }
        StringBuilder output = new StringBuilder("");

        String mapping [] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        solve(digits, output, 0, ans, mapping);

        return ans;
    }
}
