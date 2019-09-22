package domazizasreduuvece;

import java.util.Scanner;

public class Zadatak3Datum0806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva ima u nizu: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		ucitajNiz(a);
		double sredina = aritmeticka(a);
		int[] b = veciOdSredine(a, sredina);
		ispisNiza(b);

	}

	static void ucitajNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Unesite " + i + ". element niza: ");
			a[i] = sc.nextInt();
		}
	}

	static double aritmeticka(int[] a) {
		double suma = 0;
		for (int i = 0; i < a.length; i++) {
			suma += a[i];
		}
		return suma / a.length;
	}

	static int[] veciOdSredine(int[] a, double sredina) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > sredina) {
				j++;
			}
		}
		int[] b = new int[j];
		j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > sredina) {
				b[j] = a[i];
				j++;
			}
		}
		return b;
	}

	static void ispisNiza(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + ". element novog niza je: " + a[i]);
		}
	}

}
