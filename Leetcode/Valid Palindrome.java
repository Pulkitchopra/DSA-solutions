class Solution {
    public boolean isPalindrome(String s) {



        if(s.isEmpty()){

            return true;

        }



       int st = 0;

       int e = s.length() - 1;



       while(st<=e){

           char lChar = s.charAt(st);

           char rChar = s.charAt(e);





           if(!Character.isLetterOrDigit(lChar)){

               st++;
           }
           else if(!Character.isLetterOrDigit(rChar)){

               e--;
           }
           else{

            if(Character.toLowerCase(lChar) != Character.toLowerCase(rChar)){
               return false;
           }

           st++;
           e--;
           }

       }

       

       return true;
    }
}
