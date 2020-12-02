package Day08;

import java.util.HashMap;

public class ClimbStairs {
    public static void main(String[] args) {

    }
}
class Solution3 {
    HashMap jieAndMethods = new HashMap();
    public int climbStairs(int n) {
        if (jieAndMethods.containsKey(n))
            return (int)jieAndMethods.get(n);
        if (n<=2)
            return n;
        int res=climbStairs(n-1)+climbStairs(n-2);
        jieAndMethods.put(n,res);
        return res;
    }
}
