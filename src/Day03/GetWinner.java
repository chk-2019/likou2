package Day03;

import javax.naming.MalformedLinkException;

public class GetWinner {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
//        int arr[]={1,3,6,2,2,5,5,1};
//        System.out.println(solution.selectMax(arr));
        int arr[]={1,25,35,42,68,70};
        int winner = solution.getWinner(arr, 1);
        System.out.println(winner);
    }
}
class Solution2 {
    public int getWinner(int[] arr, int k) {
        int res=arr[0];
        int liansheng=0;
        //如果连胜的长度等于或者大于数组长度-1，那么最终连胜k局的只能是数组中最大的数。
        if (k>arr.length-2)
            res=selectMax(arr);
        else {
            int index=0;

            for (int i=0;i<arr.length;i=index){
                if (liansheng==k){
                    return arr[index];
                }
                if (index==arr.length-1)
                    return selectMax(arr);
                for (int j=i+1;j<arr.length;j++){
                    index++;
                    if (arr[i]>arr[j]){
                        liansheng++;
                        if (liansheng==k)
                            return arr[i];
                    }
                    else{
                        liansheng=1;
                        break;
                    }

                }
            }
        }
        return res;
    }
    public int selectMax(int arr[]){
        int res = 0;
        int max = arr[0];
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                if (arr[i]>max)
                    max=arr[i];
            }
            else {
                if (arr[i+1]>max)
                    max=arr[i+1];
            }
        }
        return max;
    }
}
