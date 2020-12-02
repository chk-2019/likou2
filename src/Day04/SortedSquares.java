package Day04;

public class SortedSquares {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int A[]={1,6,7,5};
        int[] ints = solution.XzSortAsc(A);
        for (int i=0;i<ints.length;i++){
            System.out.print(ints[i]+" ");
        }
    }
}
class Solution {
    public int[] sortedSquares(int[] A) {
        for (int i=0;i<A.length;i++){
            A[i]=A[i]*A[i];
        }
        int[] res = MpSortAsc(A);
        return res;
    }
    public int[] MpSortAsc(int []A){
        for (int i=0;i<A.length-1;i++){
            for (int j=0;j<A.length-1-i;j++){
                int temp=0;
                if (A[j]>A[j+1]){
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        return A;
    }
    public int[] XzSortAsc(int []A){

        for (int i=0;i<A.length-1;i++){
            int maxIndex=0;
            for (int j=0;j<A.length-1-i;j++){
                if (A[j]<A[j+1]){
                    if (A[j+1]>A[maxIndex])
                        maxIndex=j+1;
                }
            }
            int temp = A[maxIndex];
            A[maxIndex]=A[A.length-1-i];
            A[A.length-1-i]=temp;
        }
        return A;
    }
}
