package Day05;

public class SingleNonDuplicate {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int test[]={3,3,7,7,10,11,11};
        int testres = solution.singleNonDuplicate(test);
        System.out.println(testres);
    }
}

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res = 0;
        int left=0;
        int right= nums.length-1;
        if (nums.length==1)
            res=nums[0];
        while(left<right){
            int mid=(left+right)/2;
            if (nums[mid]==nums[mid+1]){
                if ((mid-left)%2==0){
                    res=nums[mid+2];
                    left=mid+2;
                }
                else {
                    res=nums[mid-1];
                    right=mid-1;
                }

            }
            else if (nums[mid]==nums[mid-1]){
                //如果左边是双数，那么唯一数就在右边，需要把mid给左端点
                if ((mid-1-left)%2==0){
                    res=nums[mid+1];
                    left=mid+1;

                }
                //如果左边是单数，那么唯一数就在左边，需要把mid给右端点
                else {
                    res=nums[mid-2];
                    right=mid-2;
                }


            }
            else{
                res=nums[mid];
                break;
            }

        }
        return res;
    }
}
