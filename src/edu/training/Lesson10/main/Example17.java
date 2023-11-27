package edu.training.Lesson10.main;

public class Example17 {

	public static void main(String[] args) {
        int n = 8;
        int[][] arr = new int[n][n];

        initArray(arr);

        printArray(arr);
    }

    public static void initArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[0][j] = 1;
                mas[i][0] = 1;
                mas[mas.length - 1][j] = 1;
                mas[i][mas[i].length - 1] = 1;
            }
        }
    }

    public static void printArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%d]",mas[i][j]);
            }
            System.out.println();
        }
    }

}
