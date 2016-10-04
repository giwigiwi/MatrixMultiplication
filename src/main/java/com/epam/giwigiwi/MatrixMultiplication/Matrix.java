package com.epam.giwigiwi.MatrixMultiplication;

public class Matrix {
    private int size;
    private int [][] matrix;

    public Matrix(){
    }

    public Matrix(int size){
        this.size=size;
    }

    public Matrix(int size, int[][] matrix){
        this.size=size;
        this.matrix=matrix;
    }

    public Matrix multiply(Matrix matrix2)  {
        int s = getSize();
        Matrix result = new Matrix(s);
        int[][]c=new int[s][s];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < matrix2.matrix[0].length; j++) {
                for (int k = 0; k < s; k++) {
                    c[i][j] += this.matrix[i][k] * matrix2.matrix[k][j];
                    result.matrix=c;
                }
            }
        }
        return result;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}

