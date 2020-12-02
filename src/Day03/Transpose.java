package Day03;

public class Transpose {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [][]A = new int[][]{{3}};
        int[][] transpose = solution.transpose(A);
        for (int i=0;i<transpose.length;i++){
            for (int j=0;j<transpose[i].length;j++){
                System.out.print(transpose[i][j]);
            }
        }
    }
}
class Solution {
    public int[][] transpose(int[][] A) {
        int[][] res = new int[A[0].length][A.length];
            for (int i=0;i<A.length;i++){
                for (int j=0;j<A[i].length;j++){
                    res[j][i]=A[i][j];
                }
            }
        return res;
    }
}

//java.lang.NullPointerException
//        at line 6, Solution.transpose
//        at line 57, __DriverSolution__.__helper__
//        at line 85, __Driver__.main