 class Solution {
    public int longestPalindrome(String s) {
       int[] lookup = new int[58];
        for(char c: s.toCharArray()) {
          lookup[c-'A']++;
        }
        int length = 0;
        for(int index = 0; index < 58; index++) {
          if(lookup[index] % 2 == 0) {
            length += lookup[index];
          } else {
            length += lookup[index] - 1;
          }
        }

        if(length < s.length()) {
          length += 1; /** Add one chat at Centre */
        }
        return length; 
    }
}