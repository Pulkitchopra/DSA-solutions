public class Solution {

    public static int exponentiationFunction(long x, long n, long m) {

        long res = 1;

        while(n>0){



            if(n%2 != 0){

                res = ( (res) * (x)%m )%m;

            }



            x = ( (x)%m * (x)%m )%m;

            n = n>>1;






        }
        return (int) res;
    }


    public static int modularExponentiation(int x, int n, int m) {
                
        return (int) exponentiationFunction( (long) x, (long) n, (long) m);
    }
}
