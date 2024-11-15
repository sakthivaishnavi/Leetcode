class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<List<String>>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        
        int[] leftRow = new int[n];
        int[] lowerDiagnol = new int[2*n-1];
        int[] upperDiagnol = new int[2*n-1];
        solve(0,n,board,leftRow,lowerDiagnol,upperDiagnol,ans);
        return ans;
    }
    
    void solve(int col,int n,char[][] board,int[] leftRow,int[] lowerDiagnol,int[] upperDiagnol,List<List<String>> ans){
        if(col == n){
            ans.add(construct(board));
            return;
        }
        
        for(int row = 0 ; row < n ; row ++ ){
            if(leftRow[row]==0 && lowerDiagnol[row+col] == 0 && upperDiagnol[(n-1) + row-col] == 0){
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagnol[row+col] = 1;
                upperDiagnol[(n-1) + row-col] = 1;
                solve(col+1,n,board,leftRow,lowerDiagnol,upperDiagnol,ans);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagnol[row+col] = 0;
                upperDiagnol[(n-1) + row-col] = 0;
            }
        }
    }
    
    
    List<String> construct(char[][] board) {
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}