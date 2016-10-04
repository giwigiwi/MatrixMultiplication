package com.epam.giwigiwi.MatrixMultiplication;

import org.apache.log4j.Logger;

public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        MatrixFactory factory = new MatrixFactory();
        MatrixPrinter printer = new MatrixPrinter();
        Matrix matrix1 =new Matrix(3);
        Matrix matrix2 =new Matrix(3);
        factory.randomFill(matrix1);
        factory.randomFill(matrix2);
        Matrix result=matrix1.multiply(matrix2);
        System.out.println("\n First matrix");
        printer.printInConsole(matrix1);
        System.out.println("\n Second matrix");
        printer.printInConsole(matrix2);
        System.out.println("\n The multiplication result");
        printer.printInConsole(result);
    }
}
