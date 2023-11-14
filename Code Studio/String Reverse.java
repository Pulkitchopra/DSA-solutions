class Solution {

  public static String stringReverse(char[] arr) {

    int s = 0;
    int e = arr.length - 1;





    while(s<=e){


      char temp = arr[s];

      arr[s] = arr[e];

      arr[e] = temp;

      s++;
      e--;

    }
    return new String(arr);

  }
}
