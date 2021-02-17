package com.hc.nowcoder;

public class StrToIntClass {
    public static void main(String[] args){
        System.out.println(StrToIntClass.StrToInt("1234567"));
        System.out.println(StrToIntClass.StrToInt("+1234567"));
        System.out.println(StrToIntClass.StrToInt("-2147483648"));
    }

    static public int StrToInt(String str) {
        if(str == null || str.isEmpty()){
            return 0;
        }

        int positive = 1;
        int starter = 0;
        if(str.charAt(0) == '+' || str.charAt(0) == '-'){
            positive = str.charAt(0) == '+' ? 1: -1;
            starter = 1;
        }

        long sum = 0;
        int length = str.length();
        for (int i=length - 1; i>=starter; i--){
            int val = str.charAt(i) - '0';
            if(val > 9){
                return 0;
            }
            sum += val * Math.pow(10, length-1 - i);
        }
        return (int) sum * positive;
    }
}
