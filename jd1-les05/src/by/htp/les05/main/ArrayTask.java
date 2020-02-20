package by.htp.les05.main;

import java.util.Random;

public class ArrayTask {

	// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
	// кратны данному К.

	public static void task01() {
		int n = 10;
		int k = 3;

		int sum = 0;

		int[] masA = new int[n];

		initMas(masA);
		printMas(masA);

		for (int i = 0; i < masA.length; i++) {
			if (masA[i] % k == 0) {
				sum = sum + masA[i];
			}
		}

		System.out.println("сумма элементов массива, кратных " + k + " равна " + sum);
		System.out.println("");
	}

	// В целочисленной последовательности есть нулевые элементы. Создать массив из
	// номеров этих элементов.

	public static void task02() {
		int zeroCount = 0;

		int[] mas1 = new int[] { 1, 2, 5, 7, 10, 0, 14, 0 };
		printMas(mas1);

		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] == 0) {
				zeroCount++;
			}
		}

		int[] mas2 = new int[zeroCount];
		int j = 0;

		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] == 0) {
				mas2[j] = i;
				j++;
			}
		}
		printMas(mas2);
		System.out.println("");
	}

	// Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число
	// встречается раньше - положительное или отрицательное.

	public static void task03() {
		boolean flag = true;
		int[] mas1 = new int[] { -1, 2, 5, 7, 10, -5, 14, 0 };
		
		printMas(mas1);

		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] < 0) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("положительное число встречается раньше");
		} else {
			System.out.println("отрицательное число встречается раньше");
		}
		System.out.println("");
	}

	// Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет
	// ли она возрастающей.

	public static void task04() {
		int n = 10;
		boolean flag = true;

		double[] masA = new double[n];

		initDoubleMas(masA);
		printDoubleMas(masA);

		for (int i = 0; i < masA.length; i++) {
			if (masA[i] > masA[i + 1]) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("последовательность чисел в массиве возрастающая");
		} else {
			System.out.println("последовательность чисел в массиве не возрастяющая");
		}
		System.out.println("");
	}

	// Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из
	// четных чисел этой последовательности. Если таких чисел нет, то вывести
	// сообщение об этом факте.

	public static void task05() {
		int n = 10;
		int count = 0;

		int[] masA = new int[n];

		initMas(masA);
		printMas(masA);

		for (int i = 0; i < masA.length; i++) {
			if (masA[i] % 2 == 0) {
				count++;
			}
		}
		
		if (count == 0) {
			System.out.println("четных чисел в массиве нет");
			return;
		}

		int[] masB = new int[count];
		int j = 0;

		for (int i = 0; i < masA.length; i++) {
			if (masA[i] % 2 == 0) {
				masB[j] = masA[i];
				j++;
			}
		}

		printMas(masB);
		System.out.println("");
	}

	// Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину
	// числовой оси, содержащую все эти числа.

	public static void task06() {
		int n = 10;

		int[] masA = new int[n];

		initMas(masA);
		printMas(masA);

		int max = masA[0];
		for (int i = 0; i < masA.length; i++) {
			if (masA[i] > max) {
				max = masA[i];
			}
		}
		System.out.println("наименьшая длина числовой оси равна " + max);
		System.out.println("");
	}

	// Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее
	// члены, большие данного Z, этим числом. Подсчитать количество замен.

	public static void task07() {
		int n = 10;
		double z = 5.2;

		int count = 0;

		double[] masA = new double[n];

		initDoubleMas(masA);
		printDoubleMas(masA);

		for (int i = 0; i < masA.length; i++) {
			if (masA[i] > z) {
				masA[i] = z;
				count++;
			}
		}
		
		printDoubleMas(masA);
		System.out.println("количество замен равно " + count);
		System.out.println("");
	}

	// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
	// в нем отрицательных, положительных и нулевых элементов.

	public static void task08() {
		int n = 10;

		int zeroCount = 0;
		int plusCount = 0;
		int minusCount = 0;

		double[] masA = new double[n];

		initDoubleMas(masA);
		printDoubleMas(masA);

		for (int i = 0; i < masA.length; i++) {
			if (masA[i] == 0) {
				zeroCount++;
			} else if (masA[i] > 0) {
				plusCount++;
			} else {
				minusCount++;
			}
		}

		System.out.println("отрицательных элементов в массиве: " + minusCount);
		System.out.println("нулевых элементов в массиве: " + zeroCount);
		System.out.println("положительных элементов вмассиве: " + plusCount);
		System.out.println("");
	}

	// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
	// наименьший элементы.

	public static void task09() {
		int n = 10;
		double[] masA = new double[n];

		initDoubleMas(masA);
		printDoubleMas(masA);

		double max = maxNum(masA);
		double min = minNum(masA);

		int posMax = indexOfMax(masA);
		int posMin = indexOfMin(masA);

		for (int i = 0; i < masA.length; i++) {
			if (i == posMax) {
				masA[i] = min;
			} else if (i == posMin) {
				masA[i] = max;
			}
		}
		printDoubleMas(masA);
		System.out.println("");
	}

	// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
	// которых аi > i.

	public static void task10() {
		int n = 10;
		int[] masA = new int[n];

		initMas(masA);
		printMas(masA);

		for (int i = 0; i < masA.length; i++) {
			if (masA[i] > i) {
				System.out.print(masA[i] + " ");
			}
		}
		System.out.println("");
	}

	// Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток
	// от деления на М равен L (0 < L < М-1).

	public static void task11() {
		int n = 10;

		int[] masA = new int[n];

		initMas(masA);
		printMas(masA);

		int m = 5;
		int l;

		for (l = 1; l < (m - 1); l++) {
			System.out.print(l + " : ");
			for (int i = 0; i < masA.length; i++) {
				if (masA[i] % m == l) {
					System.out.print(masA[i] + " ");
				}
			}
		}
		System.out.println("");
	}

	// Задана последовательность N вещественных чисел. Вычислить сумму чисел,
	// порядковые номера которых являются простыми числами

	public static void task12() {
		int n = 10;
		double[] masA = new double[n];

		initDoubleMas(masA);
		printDoubleMas(masA);

		double sum = 0;

		for (int i = 2; i < masA.length; i++) {
			if (isPrimeNum(i)) {
				sum = sum + masA[i];
			}
		}

		System.out.println("сумма элементов, порядковые номера которых являются простыми числами, равна " + sum);
		System.out.println("");
	}

	// Определить количество элементов последовательности натуральных чисел, кратных
	// числу М и заключенных в промежутке от L до N.

	public static void task13() {
		int k = 10;

		int[] masA = new int[k];

		initMas(masA);
		printMas(masA);

		int m = 2;
		int l = 3;
		int n = 9;

		int count = 0;

		for (int i = 0; i < masA.length; i++) {
			if (masA[i] % m == 0 && masA[i] >= l && masA[i] <= n) {
				count++;
			}
		}

		System.out.println("количество элементов в массиве, кратных " + m + " , равно " + count);
		System.out.println("");
	}

	// Дан одномерный массив A[N]. Найти: max( a2, a4, , , ,a2n ) + min(a1 ,a3 ,
	// ,an-1 )

	public static void task14() {
		int n = 10;

		double[] masA = new double[n];

		initDoubleMas(masA);
		printDoubleMas(masA);

		double[] masOdd = oddNumMas(masA);
		printDoubleMas(masOdd);
		double[] masEven = evenNumMas(masA);
		printDoubleMas(masEven);

		double max = maxNum(masEven);
		double min = minNum(masOdd);

		double sum = max + min;

		System.out.println("max + min = " + sum);
		System.out.println("");
	}

	// Дана последовательность действительных чисел a1, a2,, an . Указать те ее
	// элементы, которые принадлежат отрезку [с, d].

	public static void task15() {
		int n = 10;

		double[] masA = new double[n];

		initDoubleMas(masA);
		printDoubleMas(masA);

		int c = -5;
		int d = 7;

		for (int i = 0; i < masA.length; i++) {
			if (masA[i] >= c && masA[i] <= d) {
				System.out.print(masA[i] + " ");
			}
		}
		System.out.println("");
	}

	// Даны действительные числа a1,a2 ,, an. Найти max( a1+an, a2+an-1, , , , )

	public static void task16() {
		int n = 10;

		double[] masA = new double[n];

		initDoubleMas(masA);
		printDoubleMas(masA);

		int m = masA.length / 2;
		double[] mas1 = new double[m];
		
		int j = 0;
		for (int i = 0; i < m; i++) {
			mas1[j] = masA[i] + masA[masA.length - 1 - i];
			j++;
		}

		double max = maxNum(mas1);

		System.out.println("max = " + max);
		System.out.println("");
	}

	public static void initMas(int[] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(15);
		}
	}

	public static void initDoubleMas(double[] mas) {
		Random random = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (double) Math.round((random.nextDouble() * 30 - 15) * 10) / 10;
		}
	}

	public static void printMas(int[] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%2d ", mas[i]);
		}
		System.out.println();
	}

	public static void printDoubleMas(double[] mas) {
		if (mas == null) {
			return;
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "   ");
		}
		System.out.println();
	}

	public static double minNum(double[] mas) {
		double min = mas[0];

		for (int i = 1; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		return min;
	}

	public static double maxNum(double[] mas) {
		double max = mas[0];

		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		return max;
	}

	public static int indexOfMax(double[] mas) {
		int indexOfMax = 0;
		double max = maxNum(mas);

		for (int i = 1; i < mas.length; i++) {
			if (mas[i] == max) {
				indexOfMax = i;
			}
		}
		return indexOfMax;
	}

	public static int indexOfMin(double[] mas) {
		int indexOfMin = 0;
		double min = minNum(mas);

		for (int i = 1; i < mas.length; i++) {
			if (mas[i] == min) {
				indexOfMin = i;
			}
		}
		return indexOfMin;
	}

	public static boolean isPrimeNum(int num) {
		boolean flag = true;
		int sqrtNum = (int) (Math.sqrt(num));

		for (int i = 2; i < sqrtNum; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static int calcEvenElem(double[] mas) {
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	public static double[] evenNumMas(double mas[]) {
		int count = calcEvenElem(mas);
		double[] mas1 = new double[count];

		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 != 0) {
				mas1[j] = mas[i];
				j++;
			}
		}
		return mas1;
	}

	public static int calcOddElem(double[] mas) {
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static double[] oddNumMas(double mas[]) {
		int count = calcOddElem(mas);
		double[] mas1 = new double[count];

		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				mas1[j] = mas[i];
				j++;
			}
		}
		return mas1;
	}

}
