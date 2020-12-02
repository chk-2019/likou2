package Day01;

public class Multiply {
    public static void main(String[] args) {

    }
}
class Solution {
    public int multiply(int A, int B) {
        if (A<B){
            if (A==1)
            return B;
            int res = B+multiply(A-1,B);
            return res;
        }
        else{
            if (B==1)
                return B;
            return A+multiply(A,B-1);
        }
    }
}
