package Day06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallest {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(56);
//        arrayList.add(89);
//        arrayList.add(1);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);
        Solution solution = new Solution();
    }
}
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> sortList = new ArrayList<Integer>();
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                sortList.add(matrix[i][j]);
            }
        }
        Collections.sort(sortList);
        Object[] objects = sortList.toArray();
        return (int)objects[k-1];

    }
}
