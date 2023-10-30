public class Solution {
    public static boolean isValidParenthesis(String s) {


        Stack<Character> charStack = new Stack<>();

        for(int i = 0; i < s.length(); i++){





            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[' ){

                charStack.push(ch);
            }
            else{

                if(charStack.isEmpty()){

                    return false;
                }






                char top = charStack.peek();
                
                
                
                if( (ch == ')' && top == '(') || (ch == '}' && top == '{') ||

                     (ch == ']' && top == '[') ){
                          charStack.pop();
                          }
                          else{
                              return false;  
                              }
            }
        }
        return charStack.isEmpty();
    }
}
