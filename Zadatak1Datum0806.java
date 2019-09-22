package domazizasreduuvece;

import java.util.Scanner;

public class Zadatak1Datum0806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite koliko elemenata ima u nizu: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		ucitajNiz(a);
		System.out.print("Unesite broj za proveru: ");
		int prov = sc.nextInt();
		boolean pro = provera(a, prov);
		if (pro)
			System.out.println("Broj postoji u nizu.");
		else
			System.out.println("Broj ne postoji u nizu.");
	}

	static void ucitajNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("Unesite " + i + ". element niza: ");
			a[i] = sc.nextInt();
		}
	}

	static boolean provera(int[] a, int prov) {
		boolean pro = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == prov) {
				pro = true;
			}
		}
		return pro;
	}

}
