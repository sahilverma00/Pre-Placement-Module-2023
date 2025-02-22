class Solution {
    // Fresh count for fresh oranges
    int fresh = 0;
    
    public int orangesRotting(int[][] grid) {
        // Init the queue for BFS from rotten oranges
        Queue<int[]> rotten = new LinkedList<>();
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    fresh++;
                } else if(grid[i][j] == 2) {
                    rotten.offer(new int[]{i, j});
                }
            }
        }
        
        // Corner case
        if(fresh == 0) return 0;
        
        // BFS layer traversal from all rotten oranges
        int ans = 0;
        while(!rotten.isEmpty()) {
            int size = rotten.size();
            ans++;
            
            for(int i = 0; i < size; i++) {
                
                int[] curr = rotten.poll();
                if(checkOrange(grid, curr[0] + 1, curr[1])) rotten.offer(new int[]{curr[0] + 1, curr[1]});
                if(checkOrange(grid, curr[0], curr[1] + 1)) rotten.offer(new int[]{curr[0], curr[1] + 1});
                if(checkOrange(grid, curr[0] - 1, curr[1])) rotten.offer(new int[]{curr[0] - 1, curr[1]});
                if(checkOrange(grid, curr[0], curr[1] - 1)) rotten.offer(new int[]{curr[0], curr[1] - 1});
            }
        }
        
        return fresh == 0 ? ans - 1 : -1; // !!: n layers -> (n - 1) edges between layers
    }
    
    private boolean checkOrange(int[][] grid, int i, int j) {
        // Corner case: out of boundary
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return false;
        
        if(grid[i][j] == 1) {
            grid[i][j] = 2;
            fresh--;
            return true;
        }
        
        return false;
    }