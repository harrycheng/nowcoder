package com.hc.nowcoder;

import java.util.LinkedList;
import java.util.List;

public class FirstAppearingOnceSolution {

    public static void main(String[] args) {
        String input = "google";

        String caseout = "";

        FirstAppearingOnceSolution firstAppearingOnceSolution = new FirstAppearingOnceSolution();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            firstAppearingOnceSolution.Insert(c);
            caseout += firstAppearingOnceSolution.FirstAppearingOnce();
        }
        System.out.println(caseout);
    }


    List<Character> charList = new LinkedList<>();

    public void Insert(char ch) {
        charList.add(ch);
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        for (int i = 0; i < charList.size(); i++) {
            char cur = charList.get(i);
            boolean exist = false;
            for (int j = 0; j < charList.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (cur == charList.get(j)) {
                    exist = true;
                    break;
                }
            }
            if (exist == false) {
                return cur;
            }
        }
        return '#';
    }
}
