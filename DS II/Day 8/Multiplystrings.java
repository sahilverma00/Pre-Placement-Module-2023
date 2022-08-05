class Solution {
    public String multiply(String num1, String num2) {
       int uno = num1.length();
        int dos = num2.length();
        int[] tgt = new int[uno + dos];
        
        for (int i = uno - 1; i >= 0; i--)
        {
            int curr = num1.charAt(i) - '0';
            
            for (int j = dos - 1; j >= 0; j--)
            {
                int mult = curr * (num2.charAt(j) - '0');
                int sum = mult + tgt[i + j + 1];
                tgt[i + j] += sum / 10;
                tgt[i + j + 1] = sum % 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int n : tgt)
        {
            if (!(sb.length() == 0 && n == 0))
            {
                sb.append(n);
            }
        }
        
        return sb.length() == 0 ? "0" : sb.toString(); 
    }
}