class Solution {
    public int uniquePaths(int m, int n) {
        int[][] table = new int[m+1][n+1];
        table[1][1] = 1;
        for (int i = 1 ; i <= m ; i++)
            for (int j = 1 ; j <= n ; j++){
                if (i == j && i == 1)
                    continue;
                table[i][j] = table[i-1][j] + table[i][j-1];
            }
        return table[m][n];
    }
}