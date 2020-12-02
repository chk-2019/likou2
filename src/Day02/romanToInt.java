package Day02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;

public class romanToInt {
    public static void main(String[] args) {
//        Solution3 solution3 = new Solution3();
//        int a[]={0,1,2};
//        System.out.println(a[10]);
        Solution3 solution3 = new Solution3();
        int res = solution3.romanToInt2("III");
        System.out.println(res);
    }
}
class Solution3 {
    //思路1：
    public int romanToInt(String s) {
        int res = 0;
        if (s.contains("IV")){
            int i = s.indexOf("IV");
            s=s.replaceAll("IV","");
            res+=4;
        }
        if (s.contains("IX")){
            int i = s.indexOf("IX");
            s=s.replaceAll("IX","");
            res+=9;
        }
        if (s.contains("XL")){
            int i = s.indexOf("XL");
            s=s.replaceAll("XL","");
            res+=40;
        }
        if (s.contains("XC")){
            int i = s.indexOf("XC");
            s=s.replaceAll("XC","");
            res+=90;
        }
        if (s.contains("CD")){
            int i = s.indexOf("CD");
            s=s.replaceAll("CD","");
            res+=400;
        }
        if (s.contains("CM")){
            int i = s.indexOf("CM");
            s=s.replaceAll("CM","");
            res+=900;
        }
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i++){
            switch (chars[i]){
                case 'M':
                    res+=1000;
                    break;
                case 'D':
                    res+=500;
                    break;
                case 'C':
                    res+=100;
                    break;
                case 'L':
                    res+=50;
                    break;
                case 'X':
                    res+=10;
                    break;
                case 'V':
                    res+=5;
                    break;
                case 'I':
                    res+=1;
                    break;
            }
        }
        return res;
    }
    public int romanToInt2(String s){
        int res = 0;
        //解题思路：将罗马数字和阿拉伯数组通过键值对的形式存放在HashMap中，然后通过比对数组，如果前面比后面大就加
        //如果前面比后面小就减
        HashMap<Character,Integer> romanDuiInt= new HashMap<Character,Integer>();
        romanDuiInt.put('M',1000);
        romanDuiInt.put('D',500);
        romanDuiInt.put('C',100);
        romanDuiInt.put('L',50);
        romanDuiInt.put('X',10);
        romanDuiInt.put('V',5);
        romanDuiInt.put('I',1);
        char[] str = s.toCharArray();
        for (int i=0;i<str.length-1;i++){
                if (romanDuiInt.get(str[i])>=romanDuiInt.get(str[i+1]))
                    res+=romanDuiInt.get(str[i]);
                else
                    res-=romanDuiInt.get(str[i]);
        }
        res+=romanDuiInt.get(str[str.length-1]);
        return res;
    }
}
