package Day07;

import java.util.Arrays;

public class LargestPerimeter {
    public static void main(String[] args) {
        int test[] = {3,2,3,4};
        Solution solution = new Solution();
        int i = solution.largestPerimeter(test);
        System.out.println(i);

    }
}
class Solution {
    public int largestPerimeter(int[] A) {
        int res=0;
        Arrays.sort(A);
        for(int i=A.length-1;i>=2;i--){
            int longestSide=A[i];
            int secondSide=A[i-1];
            int thirdSide=A[i-2];
            //如果两边之和大于第三边，就返回这个结果
            if (thirdSide+secondSide>longestSide){
                res = longestSide+secondSide+thirdSide;
                return res;
            }

        }
        return res;
    }
}
