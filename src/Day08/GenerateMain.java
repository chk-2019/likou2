package Day08;

import java.util.ArrayList;
import java.util.List;

public class GenerateMain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> generate = solution.generate(31);
        System.out.println(generate);
    }
}
class Solution{
    public List<List<Integer>> generate(int numRows) {

        List wai = new ArrayList();
        for (int i=0;i<numRows;i++){
            List nei = new ArrayList();
            for (int j=0;j<=i;j++){
                nei.add(yhsjsc(i,j));
            }
            wai.add(nei);
        }
        return wai;

    }
    int storage[][] = new int[34][34];


    //杨辉三角
    public int yhsjsc(int i,int j){
        //边界是1
        if (j==0||i==j){
            return 1;
        }
        //如果记忆中的storage[i][j]存在值，就将这个值返回
        if (storage[i][j]!=0){
            return storage[i][j];
        }
        storage[i][j]=yhsjsc(i-1,j-1)+yhsjsc(i-1,j);
        return storage[i][j];
    }


    //杨辉三角（2）
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i=0;i<rowIndex+1;i++){
            int i1 = rowSc(rowIndex, i);
            res.add(i1);
        }
        return res;

    }
    public int rowSc(int i,int j){
        if (j==0||i==j)
            return 1;
        if (storage[i][j]!=0)
            return storage[i][j];
        storage[i][j]=rowSc(i-1,j-1)+rowSc(i-1,j);
        return storage[i][j];
    }
}
