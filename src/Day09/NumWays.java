package Day09;

import java.util.HashMap;

public class NumWays {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.numWays(44));
    }
}
class Solution2 {
    HashMap tjAndFf = new HashMap();
    public int numWays(int n) {
        if (tjAndFf.containsKey(n))
            return (int)tjAndFf.get(n);
        if (n==0)
            return 1;
        if (n==1)
            return 1;
        int res = numWays(n-1)+numWays(n-2);
        if (res>1000000007)
            return res%1000000007;
        tjAndFf.put(n,res);
        return res;
    }
}
