package domazizasreduuvece;

import java.util.Scanner;

public class Zadatak4Datum0806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva ima u nizu: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		ucitajNiz(a);
		boolean duplikat = proveraDuplikata(a);
		if (duplikat == true) {
			System.out.println("Postoji duplikat u nizu.");
		} else {
			System.out.println("Ne postoji duplikat u nizu.");
		}
	}

	static void ucitajNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Unesite " + i + ". element niza: ");
			a[i] = sc.nextInt();
		}
	}

	static boolean proveraDuplikata(int[] a) {
		boolean duplikat = false;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					duplikat = true;
				}
			}
		}
		return duplikat;
	}

}
