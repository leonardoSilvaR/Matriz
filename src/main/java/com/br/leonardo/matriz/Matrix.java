package com.br.leonardo.matriz;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @since 27/02/2018
 * @version 1.0
 */
public class Matrix {

    public static int diffDiagonal(int[][] matriz, int n) {
        int sumDiagonalPrincipal = 0;
        int sumDiagonalSecundaria = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumDiagonalPrincipal += matriz[i][j];
                } else if ((n - 1) == (i + j)) {
                    sumDiagonalSecundaria += matriz[i][j];
                }
            }
        }
        return sumDiagonalPrincipal - sumDiagonalSecundaria;
    }

    public static void main(String... args) {
        int[][] matriz = {
            {1, 5, 3, 2},
            {4, 8, -5, 6},
            {7, 3, 4, 5},
            {2, 5, 9, -9}
        };
        System.out.println(diffDiagonal(matriz, 4));

    }

}
