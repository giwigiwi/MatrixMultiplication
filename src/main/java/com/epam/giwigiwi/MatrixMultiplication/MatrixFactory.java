package com.epam.giwigiwi.MatrixMultiplication;

public class MatrixFactory {

    public MatrixFactory() {
    }

    public void randomFill(Matrix matrix){
        int size=matrix.getSize();
        int[][] mat = new int[size][size];
        for (int k=0;k <size;k++){
            for (int j=0;j < size;j++){
                mat[k][j]=(int)(Math.random()*10+1);
                matrix.setMatrix(mat);
            }
        }
    }
}
