package com.epam.giwigiwi.MatrixMultiplication;

import org.apache.log4j.Logger;

public class MatrixPrinter {

    public MatrixPrinter(){
    }

    public void printInConsole(Matrix matrix) {
        int size=matrix.getSize();
        System.out.println("  ");
        for (int i=0;i < size;i++,System.out.println()){
            for (int j=0;j < size;j++){
                System.out.print(matrix.getMatrix()[i][j]+" ");
            }
        }
    }
}
