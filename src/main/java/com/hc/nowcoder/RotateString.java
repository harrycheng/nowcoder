package com.hc.nowcoder;

import java.util.Stack;

public class RotateString {
    public static void main(String[] args) {
        RotateString rs = new RotateString();
        System.out.println(rs.LeftRotateString(" ", 2));
        System.out.println(rs.ReverseSentence("student. a am I"));
    }

    public String LeftRotateString(String str, int n) {

        if (str == "" || str == null) {
            return str;
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }

        str += str;
        return str.substring(n % length, n % length + length);
    }

    public String ReverseSentence(String str) {
        Stack<String> words =   new Stack<String>();
        StringBuilder sb = new StringBuilder();

        if(str == null || str.isEmpty() || str.trim() == ""){
            return str;
        }
        String[] segment = str.split(" ");
        for(String item : segment){
            words.push(item);
        }

        while (!words.isEmpty()){
            sb.append(words.pop() + " ");
        }
        return sb.toString().trim();
    }
}
