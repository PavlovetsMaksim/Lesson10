package edu.training.Lesson10.main;

public class Example16 {

	public static void main(String[] args) {
		int n = 8;
		int[][] arr = new int[n][n];

		initArray(arr);

		printArray(arr);
	}

	public static void initArray(int[][] mas) {
		int n = 1;
		
		for (int i = 0; i < mas.length; i++) {
			mas[i][i] = n * (n + 1);
			n++;
		}
	}

	public static void printArray(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d]", mas[i][j]);
			}
			System.out.println();
		}
	}

}
