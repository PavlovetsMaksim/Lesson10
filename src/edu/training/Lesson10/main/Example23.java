package edu.training.Lesson10.main;

public class Example23 {

	public static void main(String[] args) {
		int n = 3;
		int posMem = 0;
		double[][] mas = new double[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / (double) mas.length);
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "  ");
                if (mas[i][j] > 0) {
                    posMem++;
                }
            }
            System.out.println();
        }
		
		System.out.println("Коливество полож. элементов" + "\n" + posMem);
		System.out.println();
	}

}
