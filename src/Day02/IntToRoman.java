package Day02;

public class IntToRoman {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.intToRoman(3459));
    }
}
class Solution2 {
    public String intToRoman(int num) {
        String s = "";
        int Q = num/1000;
        int B = (num%1000)/100;
        int S = ((num%1000)%100)/10;
        int G = ((num%1000)%100)%10;
       StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append(Q);
//        stringBuffer.append(B);
//        stringBuffer.append("--");
//        stringBuffer.append(S);
//        stringBuffer.append(G);
//        String s1 = stringBuffer.toString();
        switch (Q){
            case 0:
                stringBuffer.append("");
                break;
            case 1:
                stringBuffer.append("M");
                break;
            case 2:
                stringBuffer.append("MM");
                break;
            case 3:
                stringBuffer.append("MMM");
        }
        switch (B){
            case 0:
                stringBuffer.append("");
                break;
            case 1:
                stringBuffer.append("C");
                break;
            case 2:
                stringBuffer.append("CC");
                break;
            case 3:
                stringBuffer.append("CCC");
                break;
            case 4:
                stringBuffer.append("CD");
                break;
            case 5:
                stringBuffer.append("D");
                break;
            case 6:
                stringBuffer.append("DC");
                break;
            case 7:
                stringBuffer.append("DCC");
                break;
            case 8:
                stringBuffer.append("DCCC");
                break;
            case 9:
                stringBuffer.append("CM");
        }
        switch (S){
            case 0:
                stringBuffer.append("");
                break;
            case 1:
                stringBuffer.append("X");
                break;
            case 2:
                stringBuffer.append("XX");
                break;
            case 3:
                stringBuffer.append("XXX");
                break;
            case 4:
                stringBuffer.append("XL");
                break;
            case 5:
                stringBuffer.append("L");
                break;
            case 6:
                stringBuffer.append("LX");
                break;
            case 7:
                stringBuffer.append("LXX");
                break;
            case 8:
                stringBuffer.append("LXXX");
                break;
            case 9:
                stringBuffer.append("XC");
        }
        switch (G){
            case 0:
                stringBuffer.append("");
                break;
            case 1:
                stringBuffer.append("I");
                break;
            case 2:
                stringBuffer.append("II");
                break;
            case 3:
                stringBuffer.append("III");
                break;
            case 4:
                stringBuffer.append("IV");
                break;
            case 5:
                stringBuffer.append("V");
                break;
            case 6:
                stringBuffer.append("VI");
                break;
            case 7:
                stringBuffer.append("VII");
                break;
            case 8:
                stringBuffer.append("VIII");
                break;
            case 9:
                stringBuffer.append("IX");
        }
        String s1 = stringBuffer.toString();
        return s1;
}
}
