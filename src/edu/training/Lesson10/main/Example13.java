package edu.training.Lesson10.main;

public class Example13 {

	public static void main(String[] args) {
		int n = 5;

		int[][] arr = new int[n][n];

		initArray(arr);

		printArray(arr);

	}

	public static int[][] initArray(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i % 2 == 0) {
					mas[i][j] = j + 1;
				} else {
					mas[i][j] = mas[i].length - j;
				}
			}
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
