package edu.training.Lesson10.main;

public class Example14 {

	public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];

        initArray(arr);

        printArray(arr);
    }

    public static int[][] initArray(int[][] mas) {
    	for (int i = 0; i < mas.length; i++) {
            mas[i][mas[i].length - 1 - i] = i + 1;
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
