package by.htp.les06.main;

import java.util.Random;

public class MultiArray {

	// Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке
	// была ровно одна единица, и вывести на экран.

	public static void task01() {

		int[][] masA = new int[3][4];

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
				if (j == 0) {
					masA[i][j] = 1;
				}
			}
		}
		printMas(masA);
	}

	// Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из
	// [0, 9].

	public static void task02() {

		int[][] masA = new int[2][3];

		initMas(masA, 0, 9);
		printMas(masA);
	}

	// Дана матрица. Вывести на экран первый и последний столбцы.

	public static void task03() {

		int[][] masA = new int[2][3];

		initMas(masA, 0, 9);
		printMas(masA);

		for (int i = 0; i < masA.length; i++) {
			System.out.println();
			for (int j = 0; j < masA[i].length; j++) {
				if (j == 0) {
					System.out.printf("%2d ", masA[i][j]);
				}
				if (j == masA[i].length - 1) {
					System.out.printf("%2d ", masA[i][j]);
				}
			}
		}
		System.out.println("");
	}

	// Дана матрица. Вывести на экран первую и последнюю строки

	public static void task04() {

		int[][] masA = new int[3][3];

		initMas(masA, 0, 9);
		printMas(masA);

		for (int i = 0; i < masA.length; i++) {
			System.out.println();
			for (int j = 0; j < masA[i].length; j++) {
				if (i == 0) {
					System.out.printf("%2d ", masA[i][j]);
				}
				if (i == masA.length - 1) {
					System.out.printf("%2d ", masA[i][j]);
				}
			}
		}
		System.out.println("");
	}

	// Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

	public static void task05() {

		int[][] masA = new int[4][3];

		initMas(masA, 0, 9);
		printMas(masA);

		for (int i = 0; i < masA.length; i++) {
			System.out.println();
			for (int j = 0; j < masA[i].length; j++) {
				if (i % 2 != 0) {
					System.out.printf("%2d ", masA[i][j]);
				}
			}
		}
		System.out.println("");
	}

	// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
	// больше последнего.

	public static void task06() {

		int[][] masA = new int[2][3];

		initMas(masA, 0, 9);
		printMas(masA);

		for (int i = 0; i < masA.length; i++) {
			System.out.println();
			for (int j = 0; j < masA[i].length; j++) {
				if (j % 2 == 0 && masA[0][j] > masA[masA.length - 1][j]) {
					System.out.printf("%2d ", masA[i][j]);
				}
			}
		}
		System.out.println("");
	}

	// Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
	// элементов.

	public static void task07() {
		int sum = 0;
		int[][] masA = new int[5][5];

		initMas(masA, -9, 9);
		printMas(masA);

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
				if (masA[i][j] < 0 && masA[i][j] % 2 != 0) {
					sum = sum + masA[i][j];
				}
			}
		}
		System.out.println("сумма отрицательных нечетных элементов массива равна " + Math.abs(sum));
		System.out.println("");
	}

	// Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
	// число 7 среди элементов массива.

	public static void task08() {

		int count = 0;
		int n = 5;
		int m = 6;
		int[][] masA = new int[n][m];

		initMas(masA, 0, 9);
		printMas(masA);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (masA[i][j] == 7) {
					count++;
				}
			}
		}
		System.out.println("число 7 среди элементов массива встречается " + count + " раз");
		System.out.println("");
	}

	// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

	public static void task09() {
		int n = 5;

		int[][] masA = new int[n][n];

		initMas(masA, 0, 9);
		printMas(masA);
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.printf("%2d ", masA[i][j]);
				}
			}
		}
		System.out.println("");
	}

	// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

	public static void task10() {

		int n = 5;
		int m = 6;
		int[][] masA = new int[n][m];

		initMas(masA, 0, 9);
		printMas(masA);

		int k = 2;
		int p = 3;

		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < m; j++) {
				if (j == p - 1) {
					System.out.printf("%2d ", masA[i][j]);
				}
			}
		}
		System.out.println("");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == k - 1) {
					System.out.printf("%2d ", masA[i][j]);
				}
			}
		}
		System.out.println();
	}

	// Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая
	// строка справа налево, вторая строка слева направо, третья строка справа
	// налево и так далее.

	public static void task11() {

		int n = 5;
		int m = 6;
		int[][] masA = new int[n][m];

		initMas(masA, 0, 9);
		printMas(masA);

		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println();
			if (i % 2 == 0) {
				for (int j = m - 1; j >= 0; j--) {
					System.out.printf("%2d ", masA[i][j]);
				}
			} else {
				for (int j = 0; j < m; j++) {
					System.out.printf("%2d ", masA[i][j]);
				}
			}
		}
		System.out.println("");
	}

	// Получить квадратную матрицу порядка n:
	// 0 0 0 .. 0 0
	// 0 1 0 .. 0 0
	// 0 0 2 .. 0 0
	// 0 0 0 .. 0 0
	// 0 0 0 .. 0 n-1

	public static void task12() {

		int n = 6;

		int[][] masA = new int[n][n];

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					masA[i][j] = i;
				}
			}
		}
		printMas(masA);
		System.out.println("");
	}

	// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	// 1 2 3 .. n
	// n n-1 n-2 .. 1
	// 1 2 3 .. n
	// n n-1 n-2 .. 1
	// . . . .. n
	// n n-1 n-2 .. 1

	public static void task13() {

		int n = 6;

		int[][] masA = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					masA[i][j] = j + 1;
				} else {
					masA[i][j] = n - j;
				}
			}
		}
		printMas(masA);
		System.out.println("");
	}

	// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	// 0 0 0 .. 0 1
	// 0 0 0 .. 2 0
	// 0 0 0 .. 0 0
	// 0 n-1 0 .. 0 0
	// n 0 0 .. 0 n-1

	public static void task14() {

		int n = 6;

		int[][] masA = new int[n][n];

		int x = n;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == (n - x) && j == (x - 1)) {
					masA[i][j] = i + 1;
					x--;
				}
			}
		}
		printMas(masA);
		System.out.println("");
	}

	// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	// n 0 0 .. 0 0
	// 0 n-1 0 .. 0 0
	// 0 0 n-2 .. 0 0
	// 0 0 0 .. 2 0
	// 0 0 0 .. 0 1

	public static void task15() {

		int n = 6;

		int[][] masA = new int[n][n];
		int x = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					masA[i][j] = x - j;
				}
			}
		}
		printMas(masA);
		System.out.println("");
	}

	// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	// 1*2 0 0 .. 0 0
	// 0 2*3 0 .. 0 0
	// 0 0 3*4 .. 0 0
	// 0 0 0 .. n*(n-1) 0
	// 0 0 0 .. 0 n*(n+1)

	public static void task16() {

		int n = 6;

		int[][] masA = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					masA[i][j] = (1 + i) * (2 + i);
				}
			}
		}
		printMas(masA);
		System.out.println("");
	}

	// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	// 1 1 1 .. 1 1 1
	// 1 0 0 .. 0 0 1
	// 1 0 0 .. 0 0 1
	// . . . .. . . .
	// 1 0 0 .. 0 0 1
	// 1 1 1 .. 1 1 1

	public static void task17() {

		int n = 6;

		int[][] masA = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || (i == (n - 1))) {
					masA[i][j] = 1;
				} else {
					masA[i][0] = 1;
					masA[i][n - 1] = 1;
				}
			}
		}
		printMas(masA);
		System.out.println("");
	}

	// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	// 1 1 1 .. 1 1 1
	// 2 2 2 .. 2 2 0
	// 3 3 3 .. 3 0 0
	// . . . .. . . .
	// n-1 n-1 0 .. 0 0 0
	// n 0 0 .. 0 0 0

	public static void task18() {

		int n = 6;

		int[][] masA = new int[n][n];

		int x = n;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == (n - x) && j <= (x - 1)) {
					masA[i][j] = i + 1;
				}
			}
			x--;
		}
		printMas(masA);
		System.out.println("");
	}

	// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	// 1 1 1 .. 1 1 1
	// 0 1 1 .. 1 1 0
	// 0 0 1 .. 1 0 0
	// . . . .. . . .
	// 0 1 1 .. 1 1 0
	// 1 1 1 .. 1 1 1

	public static void task19() {

		int n = 6;

		int[][] masA = new int[n][n];
		int x = n - 1;

		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= i && j <= x) {
					masA[i][j] = 1;
				}
			}
			x--;
		}

		for (int i = n / 2; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= x && j <= i) {
					masA[i][j] = 1;
				}
			}
			x--;
		}
		printMas(masA);
		System.out.println("");
	}

	// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	// 1 0 0 .. 0 0 1
	// 1 1 0 .. 0 1 1
	// 1 1 1 .. 1 1 1
	// . . . .. . . .
	// 1 1 0 .. 0 1 1
	// 1 0 0 .. 0 0 1

	public static void task20() {

		int n = 6;

		int[][] masA = new int[n][n];
		int x = n - 1;
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n; j++) {
				if (j <= i || j >= x) {
					masA[i][j] = 1;
				}
			}
			x--;
		}

		for (int i = n / 2; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j <= x || j >= i) {
					masA[i][j] = 1;
				}
			}
			x--;
		}
		printMas(masA);
		System.out.println("");
	}

	// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	// n 0 0 .. 0 0 0
	// n-1 n 0 .. 0 0 0
	// n-2 n-1 n .. 0 0 0
	// . . . .. . . .
	// 2 3 4 .. n-1 n 0
	// 1 2 3 .. n-2 n-1 n

	public static void task21() {

		int n = 6;

		int[][] masA = new int[n][n];
		int z = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					masA[i][j] = n;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (masA[i][j] == n) {
					int x = n - 1;
					for (int y = j - 1; y >= 0; y--) {
						masA[i][y] = x;
						x--;
					}
				}
			}
		}
		printMas(masA);
		System.out.println("");
	}

	// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	// 1 2 3 .. n-2 n-1 n
	// 2 3 4 .. n-1 n 0
	// 3 4 5 .. n 0 0
	// . . . .. . . .
	// n-1 n 0 .. 0 0 0
	// n 0 0 .. 0 0 0

	public static void task22() {

		int n = 6;

		int[][] masA = new int[n][n];
		int z = n;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == (n - z) && j == (z - 1)) {
					masA[i][j] = n;
					z--;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (masA[i][j] == n) {
					int x = n - 1;
					for (int y = j - 1; y >= 0; y--) {
						masA[i][y] = x;
						x--;
					}
				}
			}
		}
		printMas(masA);
		System.out.println("");
	}

	// Сформировать квадратную матрицу порядка N по правилу:
	// A[I,J] = sin((I2 - J2/N)

	public static void task23() {

		int n = 6;

		double[][] masA = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				masA[i][j] = (double) Math.round(Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n) * 100) / 100;
			}
		}

		printDoubleMas(masA);

		double sum = calcSumOfPosNum(masA);
		System.out.println("сумма положительных элементов равна " + sum);
		System.out.println("");
	}

	// Дан линейный массив x1, x2, ,, xn-1, xn. Получить действительную квадратную
	// матрицу порядка n:
	// x1 x2 x3 .. xn
	// x12 x22 x32 .. xn2
	// x13 x23 x33 .. xn3
	// . . . .. . . .
	// x1n x2n x3n .. xnn

	public static void task24() {

		double[] mas = new double[] { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
		int n = mas.length;
		double[][] masA = new double[n][n];

		int i = 0;
		int j = 0;
		for (j = 0; i < n; i++) {
			for (i = 0; j < n; j++) {
				masA[i][j] = Math.pow(mas[i], j + 1);
			}
		}
		printDoubleMas(masA);
		System.out.println("");
	}

	public static void printMas(int[][] mas) {

		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.println();
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%2d ", mas[i][j]);
			}
		}
		System.out.println();
	}

	public static void initMas(int[][] mas, int a, int b) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * (b - a)) + a;
			}
		}
	}

	public static void printDoubleMas(double[][] mas) {
		if (mas == null) {
			return;
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.println();
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "  ");
			}
		}
		System.out.println();
	}

	public static double calcSumOfPosNum(double[][] mas) {
		double sum = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > 0) {
					sum = sum + mas[i][j];
				}
			}
		}
		return sum;
	}

}
