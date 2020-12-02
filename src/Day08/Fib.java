package Day08;

import java.util.HashMap;

public class Fib {
    public static void main(String[] args) {
        Solution2  solution2 = new Solution2();
        System.out.println(solution2.fib(44));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(solution2.fib2(45));
    }
}
class Solution2 {
    HashMap keyValue = new HashMap();
    public int fib(int N) {
        if (keyValue.containsKey(N))
            return (int)keyValue.get(N);
        if (N<2)
            return N;
        int res=fib(N-1)+fib(N-2);
        keyValue.put(N,res);
        return res;
}
    public int fib2(int n){
        if (keyValue.containsKey(n))
            return (int)keyValue.get(n);
        if (n<2)
            return n;
        int res=fib(n-1)+fib(n-2);
        if (res>1000000007){
            return res%1000000007;
        }
        keyValue.put(n,res);
        return res;
    }
}
//        1000000007
//        1134903170