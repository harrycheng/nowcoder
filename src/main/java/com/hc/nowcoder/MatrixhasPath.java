package com.hc.nowcoder;

import java.util.Collections;

public class MatrixhasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean flags[][] = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isHasPath(matrix, rows, cols, str, i, j, flags, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isHasPath(char[] matrix, int rows, int cols, char[] str, int i, int j, boolean[][] flags, int index) {
        int position = cols * i + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || str[index] != matrix[position] || index >= str.length || flags[i][j] == true) {
            return false;
        }

        if (index == str.length - 1) {
            return true;
        }

        flags[i][j] = true;
        if (isHasPath(matrix, rows, cols, str, i, j-1, flags, index + 1)
                || isHasPath(matrix, rows, cols, str, i, j+1, flags, index + 1)
                || isHasPath(matrix, rows, cols, str, i-1, j, flags, index + 1)
                || isHasPath(matrix, rows, cols, str, i+1, j, flags, index + 1)) {
            return true;
        }
        flags[i][j] = false;
        return false;
    }

    public static void main(String[] args){
        MatrixhasPath mp = new MatrixhasPath();
        boolean r1 = mp.hasPath(new char[]{'a','b', 'c',  'e',  's',  'f', 'c'  ,'s', 'a', 'd', 'e', 'e'}, 3,4, new char[]{'b','c','c','e','d'});
        boolean r2 = mp.hasPath(new char[]{'a','b', 'c',  'e',  's',  'f', 'c'  ,'s', 'a', 'd', 'e', 'e'}, 3,4, new char[]{'a','b','c','d'});
        System.out.println(r1);
        System.out.println(r2);
    }
}
