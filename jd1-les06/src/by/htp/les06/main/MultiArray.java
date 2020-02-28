package by.htp.les06.main;

import java.util.Random;
import java.util.Scanner;

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

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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

		for (int i = 0; i < masA.length; i++) {
			System.out.println();
			for (int j = 0; j < masA[i].length; j++) {
				if (j == p - 1) {
					System.out.printf("%2d ", masA[i][j]);
				}
			}
		}
		System.out.println("");

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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

		for (int i = 0; i < masA.length; i++) {
			System.out.println();
			if (i % 2 == 0) {
				for (int j = masA[i].length - 1; j >= 0; j--) {
					System.out.printf("%2d ", masA[i][j]);
				}
			} else {
				for (int j = 0; j < masA[i].length; j++) {
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

		for (int i = 1; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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
		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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

		for (int i = 0; i < masA.length / 2; i++) {
			for (int j = 0; j < masA[i].length; j++) {
				if (j >= i && j <= x) {
					masA[i][j] = 1;
				}
			}
			x--;
		}

		for (int i = masA.length / 2; i < n; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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
		for (int i = 0; i < masA.length / 2; i++) {
			for (int j = 0; j < masA[i].length; j++) {
				if (j <= i || j >= x) {
					masA[i][j] = 1;
				}
			}
			x--;
		}

		for (int i = masA.length / 2; i < n; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
				if (i == j) {
					masA[i][j] = n;
				}
			}
		}

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
				if (i == (n - z) && j == (z - 1)) {
					masA[i][j] = n;
					z--;
				}
			}
		}

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
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

		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
				masA[i][j] = (double) Math.round(Math.pow(mas[j], i + 1) * 100) / 100;
			}
		}
		printDoubleMas(masA);
		System.out.println("");
	}

	// Получить квадратную матрицу порядка n:
	// 1 2 3 n-1 n
	// n+1 n+2 n+3 2n-1 2n
	// 2n+1 2n+2 2n+3 3n-1 3n
	// . . . .. . . ............
	// (n-1)n+1 (n-1)n+2 .... n2+1 n2

	public static void task25() {

		int n = 6;

		int[][] masA = new int[n][n];

		int temp = 1;
		for (int i = 0; i < masA.length; i++) {
			for (int j = 0; j < masA[i].length; j++) {
				masA[i][j] = temp;
				temp++;

			}
		}
		printMas(masA);
		System.out.println("");
	}

	// С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с
	// массивом следующие действия: а) вычислить сумму отрицательных элементов в
	// каждой строке; б) определить максимальный элемент в каждой строке; в)
	// переставить местами максимальный и минимальный элементы матрицы

	public static void task26() {
		int n = 2;
		int m = 2;
		int[][] mas = readMasFromConsole(n, m);

		printMas(mas);

		int[] masOfNegative = masSumOfNegativeElem(mas);
		print(masOfNegative);

		int[] masOfMax = maxElemOfRow(mas);
		print(masOfMax);

		int max = maxElemOfMas(mas);
		int min = minElemOfMas(mas);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == min) {
					mas[i][j] = max;
				} else if (mas[i][j] == max) {
					mas[i][j] = min;
				}
			}
		}
		printMas(mas);
	}

	// В числовой матрице поменять местами два столбца любых столбца, т. е. все
	// элементы одного столбца поставить на соответствующие им позиции другого, а
	// его элементы второго переместить в первый. Номера столбцов вводит
	// пользователь с клавиатуры.

	public static void task27() {
		int[][] mas = new int[3][3];

		initMas(mas, 0, 9);
		printMas(mas);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("введите номер любого столбца числовой матрицы: ");
		int k = sc.nextInt();
		System.out.print("введите номер любого столбца числовой матрицы: ");
		int p = sc.nextInt();

		while (k < 0 || k > mas.length - 1 || p < 0 || p > mas.length - 1) {
			System.out.print("некорректные данные");
			System.out.print("введите номер любого столбца числовой матрицы: ");
			k = sc.nextInt();
			System.out.print("введите номер любого столбца числовой матрицы: ");
			p = sc.nextInt();
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j == k) {
					int temp = mas[i][k];
					mas[i][k] = mas[i][p];
					mas[i][p] = temp;
				}
			}
		}

		printMas(mas);
	}

	// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
	// столбце. Определить, какой столбец содержит максимальную сумму.

	public static void task28() {
		int[][] mas = new int[3][3];

		initMas(mas, 0, 9);
		printMas(mas);

		int[] mas1 = masSumOfColumn(mas);
		print(mas1);

		int colNumber = indexOfmaxElemOfMas(mas1);
		System.out.println("столбец матрицы, содержащий максимальную сумму,: " + (colNumber + 1));
	}

	// Найти положительные элементы главной диагонали квадратной матрицы

	public static void task29() {
		int[][] mas = new int[3][3];

		initMas(mas, -9, 9);
		printMas(mas);

		int[] mas1 = masDiagonalPosElem(mas);

		print(mas1);
		System.out.println("");
	}

	// Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму
	// матрицу и номера строк, в которых число 5 встречается три и более раз.

	public static void task30() {
		int number = 5;
		int countOfRepeate = 3;

		int[][] mas = new int[10][20];

		initMas(mas, 0, 15);
		printMas(mas);

		int[] mas1 = masOfRepeate(mas, number);

		System.out.println(
				"номера строк, в которых число " + number + " встречаетсся " + countOfRepeate + " и более раз:");
		printOfRepeate(mas1, countOfRepeate);
		System.out.println("");
	}

	// Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать
	// количество двузначных чисел в ней.

	public static void task31() {

		int count;

		int[][] mas = new int[10][10];

		initMas(mas, 0, 99);
		printMas(mas);

		count = calcTwoDigitElem(mas);

		System.out.println("количество двузначных чисел в матрице равно: " + count);
		System.out.println("");
	}

	// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

	public static void task32() {
		int[][] mas = new int[3][3];

		initMas(mas, 0, 99);
		printMas(mas);

		System.out.println("строки матрицы отсортированы по возрастанию");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				int min = mas[i][j];
				int minIndex = j;
				for (int z = j + 1; z < mas[i].length; z++) {
					if (mas[i][z] < min) {
						min = mas[i][z];
						minIndex = z;
					}
				}
				if (j != minIndex) {
					int temp = mas[i][j];
					mas[i][j] = mas[i][minIndex];
					mas[i][minIndex] = temp;
				}
			}
		}

		System.out.println("строки матрицы отсортированы по убыванию");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				int max = mas[i][j];
				int maxIndex = j;
				for (int z = j + 1; z < mas[i].length; z++) {
					if (mas[i][z] > max) {
						max = mas[i][z];
						maxIndex = z;
					}
				}
				if (j != maxIndex) {
					int temp = mas[i][j];
					mas[i][j] = mas[i][maxIndex];
					mas[i][maxIndex] = temp;
				}
			}
		}
		System.out.println("");
		printMas(mas);
	}

	// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

	public static void task33() {
		int[][] mas = new int[4][4];

		initMas(mas, 0, 99);
		printMas(mas);

		System.out.println("стролбцы матрицы отсортированы по возрастанию");
		for (int i = 0; i < mas.length; i++) {
			for (int z = i + 1; z < mas.length; z++) {
				for (int j = 0; j < mas[i].length; j++) {
					if (mas[i][j] > mas[z][j]) {
						int temp = mas[i][j];
						mas[i][j] = mas[z][j];
						mas[z][j] = temp;
					}
				}
			}
		}
		System.out.println("");
		printMas(mas);

		System.out.println("стролбцы матрицы отсортированы по убыванию");
		for (int i = 0; i < mas.length; i++) {
			for (int z = i + 1; z < mas.length; z++) {
				for (int j = 0; j < mas[i].length; j++) {
					if (mas[i][j] < mas[z][j]) {
						int temp = mas[i][j];
						mas[i][j] = mas[z][j];
						mas[z][j] = temp;
					}
				}
			}
		}
		System.out.println("");
		printMas(mas);
	}

	// Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в
	// каждом столбце число единиц равно номеру столбца.

	public static void task34() {
		Random random = new Random();

		int m = random.nextInt(15);
		int n = m;

		int[][] mas = new int[m][n];
		printMas(mas);

		for (int i = 0; i < mas.length; i++) {
			int index = i;
			for (int j = 0; j < mas[i].length; j++) {
				if (j <= index) {
					mas[j][i] = 1;
				}
			}
		}
		System.out.println("");
		printMas(mas);
	}

	// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

	public static void task35() {
		int[][] mas = new int[4][4];

		initMas(mas, 0, 99);
		printMas(mas);

		int max = maxElemOfMas(mas);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] % 2 != 0) {
					mas[i][j] = max;
				}
			}
		}
		System.out.println("");
		printMas(mas);
	}

	// Операция сглаживания матрицы дает новую матрицу того же размера, каждый
	// элемент которой получается как среднее арифметическое соседей
	// соответствующего элемента исходной матрицы. Построить результат сглаживания
	// заданной матрицы

	public static void task36() {
		int[][] mas = new int[4][4];

		initMas(mas, 0, 9);
		printMas(mas);

		int[][] smoothMas = new int[4][4];

		for (int i = 0; i < mas.length; i++) {
			int sum = 0;
			int count = 0;
			for (int j = 0; j < mas[i].length; j++) {
				for (int m = i - 1; m <= i + 1; m++) {
					for (int n = j - 1; n <= j + 1; n++) {
						if (m >= 0 && m <= mas.length - 1 && n >= 0 && n <= mas[i].length - 1 && (m != i || n != j)) {
							sum += mas[m][n];
							count++;
						}
					}
				}

				smoothMas[i][j] = sum / count;
				sum = 0;
				count = 0;
			}
		}
		System.out.println("");
		printMas(smoothMas);
	}

	// Переставить строки матрицы случайным образом.

	public static void task37() {
		int[][] mas = new int[5][5];

		initMas(mas, 0, 9);
		printMas(mas);

		Random random = new Random();

		// номера строк матрицы для перестановки
		int k = random.nextInt(mas.length);
		int p = random.nextInt(mas.length);

		while (p == k) {
			p = random.nextInt(mas.length);
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == k) {
					int temp = mas[k][j];
					mas[k][j] = mas[p][j];
					mas[p][j] = temp;
				}
			}
		}
		printMas(mas);
	}

	// Найдите сумму двух матриц

	public static void task38() {
		int m = 5;
		int n = 5;

		int[][] mas1 = new int[m][n];

		initMas(mas1, 0, 9);
		printMas(mas1);

		int[][] mas2 = new int[m][n];

		initMas(mas2, 0, 9);
		printMas(mas2);

		int[][] sumMas = new int[m][n];

		for (int i = 0; i < sumMas.length; i++) {
			for (int j = 0; j < sumMas[i].length; j++) {
				sumMas[i][j] = mas1[i][j] + mas2[i][j];
			}
		}

		printMas(sumMas);
	}

	// Найдите произведение двух матриц

	public static void task39() {
		int m = 5;
		int n = 5;

		int[][] mas1 = new int[m][n];

		initMas(mas1, 0, 9);
		printMas(mas1);

		int[][] mas2 = new int[m][n];

		initMas(mas2, 0, 9);
		printMas(mas2);

		int[][] sumMas = new int[m][n];

		for (int i = 0; i < sumMas.length; i++) {
			for (int j = 0; j < sumMas[i].length; j++) {
				sumMas[i][j] = mas1[i][j] * mas2[i][j];
			}
		}

		printMas(sumMas);
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

	public static int[][] readMasFromConsole(int n, int m) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int[][] mas = new int[n][m];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print("введите элемент массива mas[" + i + "] [" + j + "]:");
				mas[i][j] = scanner.nextInt();
			}
		}
		return mas;
	}

	public static void print(int[] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%2d ", mas[i]);
		}
		System.out.println();
	}

	public static int[] masSumOfNegativeElem(int[][] mas) {
		int[] mas1 = new int[mas.length];

		int y = 0;
		for (int i = 0; i < mas.length; i++) {
			int sum = 0;
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					sum = sum + mas[i][j];
				}
			}
			mas1[y] = sum;
			y++;
		}
		return mas1;
	}

	public static int[] maxElemOfRow(int[][] mas) {
		int[] mas1 = new int[mas.length];

		int y = 0;
		for (int i = 0; i < mas.length; i++) {
			int max = mas[i][0];
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
				}
			}
			mas1[y] = max;
			y++;
		}
		return mas1;
	}

	public static int maxElemOfMas(int[][] mas) {
		int max;
		max = mas[0][0];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
				}
			}

		}
		return max;
	}

	public static int minElemOfMas(int[][] mas) {
		int min;
		min = mas[0][0];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < min) {
					min = mas[i][j];
				}
			}

		}
		return min;
	}

	public static int[] masSumOfColumn(int[][] mas) {
		int[] mas1 = new int[mas.length];

		int sum = 0;
		int y = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				sum = sum + mas[j][i];
			}
			mas1[y] = sum;
			y++;
			sum = 0;
		}
		return mas1;
	}

	public static int indexOfmaxElemOfMas(int[] mas) {
		int indexOfMax = 0;

		int max;
		max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
				indexOfMax = i;
			}
		}
		return indexOfMax;
	}

	public static int[] masDiagonalPosElem(int[][] mas) {
		int[] mas1 = new int[mas.length];

		int y = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j && mas[i][j] > 0) {
					mas1[y] = mas[i][j];
					y++;
				}
			}
		}
		return mas1;
	}

	public static int[] masOfRepeate(int[][] mas, int n) {
		int count = 0;
		int[] mas1 = new int[mas.length];
		int y = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == n) {
					count++;
				}
			}
			mas1[y] = count;
			y++;
			count = 0;
		}
		return mas1;
	}

	public static void printOfRepeate(int[] mas, int repeateNum) {
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] >= repeateNum) {
				System.out.printf("%2d ", (i + 1));
			}
		}
		System.out.println();
	}

	public static int calcTwoDigitElem(int[][] mas) {
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > 9 && mas[i][j] < 100) {
					count++;
				}
			}
		}
		return count;
	}

}
