package Day03;

class SubrectangleQueries {
    int[][] juZh;
    public SubrectangleQueries(int[][] rectangle) {
        this.juZh=rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i=row1;i<row2+1;i++){
            for (int j=col1;j<col2+1;j++){
                this.juZh[i][j]=newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        int res = this.juZh[row][col];
        return res;
    }
}
