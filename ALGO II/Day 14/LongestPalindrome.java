class Solution {
    public String longestPalindrome(String s) {
         int n = s.length();
       int index  = -1, palindromeLength = 0;
       for (int i = 0; i < n; i++) {
           for (int j = i; j < n; j++) {
               int isPalindrome = 1;
               for (int k = i; k <= j; k++) {
                   if (s.charAt(k) != s.charAt(j - (k - i))) {
                       isPalindrome = 0;
                   }
               }
               if (isPalindrome == 1 && j - i + 1 > palindromeLength) {
                   index = i;
                   palindromeLength = j - i + 1;
               }
           }
       }
       String ans = "";
       for (int i = index; i < index + palindromeLength; i++) {
           ans += s.charAt(i);
       }
       return ans;
    }
}