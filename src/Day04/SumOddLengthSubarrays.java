package Day04;

public class SumOddLengthSubarrays {
    public static void main(String[] args) {
        int arr[]={1,4,2,5,3};
        Solution2 solution2 = new Solution2();
        int sum = solution2.sumOddLengthSubarrays(arr);
        System.out.println(sum);
    }
}
class Solution2 {
    public int sumOddLengthSubarrays(int[] arr) {
        int res=0;
        int n=1;
        int sum=0;
        while(n<=arr.length){
            for (int i=0;i<arr.length-n+1;i++){
                for (int j=i;j<n+i;j++)
                    sum+=arr[j];
            }
            n+=2;
        }
        return sum;
    }
}
