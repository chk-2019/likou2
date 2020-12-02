package Day06;

public class MySqrt {
    public static void main(String[] args) {
//        System.out.println(-1>>1);
////        System.out.println(-1/2);
//        System.out.println(Integer.toBinaryString(2147395599));
//        System.out.println(Integer.toBinaryString(-1>>1));
//        System.out.println(Integer.toBinaryString(-4));
//        System.out.println(Integer.toBinaryString(-4>>1));
//        System.out.println(Integer.toBinaryString(-2));
//        System.out.println(Integer.toBinaryString(-2>>1));
        Solution2  solution2 = new Solution2();
        System.out.println(solution2.mySqrt(1));
    }
}
class Solution2{
    public int mySqrt(int x) {
        long res = 0;
        long left = 1;
        long right = x;
        //
        while(left<=right){
            long mid = (left+right)>>1;
            //如果中位数的平方大于X，那么说明实际开根号的值应该小于中位数，
            // 真正的结果在中位数的左边
            if (mid*mid>x){
                //这个mid是不符合题目要求的，所以不可以赋值给res
                res=mid-1;
                right=mid-1;
            }
            else if (mid*mid<x){
                //这个mid是符合题目要求的，所以可以赋值给res
                res=mid;
                left=mid+1;
            }
            else if(mid*mid==x){
                res=mid;
                left++;
                right--;
            }

        }
        return (int)res;
    }
}
