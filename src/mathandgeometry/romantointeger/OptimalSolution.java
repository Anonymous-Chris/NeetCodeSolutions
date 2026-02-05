package mathandgeometry.romantointeger;

import print.PrintItem;

public class OptimalSolution {
    static void main(String[] args) {
        String val = "III";
        PrintItem.print(romanToInt(val));
        String val1 = "XLIX";
        PrintItem.print(romanToInt(val1));
    }
    public static int romanToInt(String s) {
        int sum = 0;
        int previous = 0;
        //iterate from right to left
        for(int i=s.length()-1; i>=0;i--){
            int current = value(s.charAt(i));
            if(current<previous){
                sum = sum - current;
            }else{
                sum = sum + current;
            }
            previous = current;
        }
        return sum;
    }

    private static int value(char c){
        switch (c){
            case 'I' :
                return 1;
            case 'V' :
                return 5;
            case 'X' :
                return 10;
            case 'L' :
                return 50;
            case 'C' :
                return 100;
            case 'D' :
                return 500;
            case 'M' :
                return 1000;
            default:
                return 0;
        }
    }
}
