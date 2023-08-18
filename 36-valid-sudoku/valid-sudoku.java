class Solution {
    public boolean isValidSudoku(char[][] board) {
        int r = board.length;
        int c = board[0].length;

        Set<String> set = new HashSet<>();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                char number = board[i][j];
                if(number != '.'){
                    if(set.contains(number + "_R_" + i) || set.contains(number + "_C_" + j) || set.contains(number + "_B_" + i/3 + "_" + j/3)){
                        return false;
                    }
                    else{
                        set.add(number + "_R_" + i);
                        set.add(number + "_C_" + j);
                        set.add(number + "_B_" + i/3 + "_" + j/3);
                    }
                }
            }
        }
        return true;
    }
}