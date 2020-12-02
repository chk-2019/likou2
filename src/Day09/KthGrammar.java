package Day09;

public class KthGrammar {
    public static void main(String[] args) {

    }
}
class Solution {
    public int kthGrammar(int N, int K) {
        if (N == 1) return 0;
//        return (~K & 1) ^ kthGrammar(N-1, (K+1)/2);
        if (kthGrammar(N-1,(K+1)/2)==0){
            return 1-(K%2);
        }
        return K%2;
    }
}