public class Solution {
    public static boolean findRedundantBrackets(String s) 

    {
        Stack<Character> charStack = new Stack<>();




        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if( ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/'){

                charStack.push(ch);
            }
            else{

                if(ch == ')'){
                    boolean isReduntant = true;






                    while(charStack.peek() != '('){



                        char top = charStack.peek();

                        if( top == '+' || top == '-' || top == '*' || top == '/'){

                            isReduntant = false;
                        }
                        charStack.pop();
                    }
                    if(isReduntant == true){

                        return true;
                    }
                        charStack.pop();

                    
                    
                }
            }
        }

        return false;
    }
}
