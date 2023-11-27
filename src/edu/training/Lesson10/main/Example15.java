package edu.training.Lesson10.main;

public class Example15 {

	public static void main(String[] args) {
        int n = 8;
        int[][] arr = new int[n][n];

        initArray(arr, n);

        printArray(arr);
    }

    public static int[][] initArray(int[][] mas, int n) {
        for (int i = 0; i < mas.length; i++) {
            mas[i][i] = n;
            n--;
        }
        return mas;
    }

    public static void printArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%d]", mas[i][j]);
            }
            System.out.println();
        }
    }

}
