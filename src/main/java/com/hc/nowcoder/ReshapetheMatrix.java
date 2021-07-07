package com.hc.nowcoder;

public class ReshapetheMatrix<T> {

    public static void main(String[] args) {
        int[][] src = new int[][]{{1, 2}, {3, 4}};
        int[][] r = new ReshapetheMatrix().matrixReshape(src, 4, 1);

        new ReshapetheMatrix<Integer>().printArray(r);
    }

    public void printArray(int[][] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[0].length; j++) {
                System.out.print(intArray[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] retMatric = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int cur = i * c + j;
                int rowSrc = cur / n;
                int colSrc = cur % n;
                retMatric[i][j] = mat[rowSrc][colSrc];
            }
        }
        return retMatric;
    }

}
