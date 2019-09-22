package domazizasreduuvece;

import java.util.Random;
import java.util.Scanner;

public class Zadatak2Datum0806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite koliko elemenata ima u nizu: ");
		int n = sc.nextInt();
		System.out.print("Unesite gornju granicu: ");
		int gg = sc.nextInt();
		int[] a = new int[n];
		generisiNiz(a, gg);
		System.out.print("Unesite broj za proveru: ");
		int prov = sc.nextInt();
		boolean pro = provera(a, prov);
		if (pro == true)
			System.out.println("Broj postoji u nizu.");
		else
			System.out.println("Broj ne postoji u nizu.");
		ispisNiza(a);
	}

	static void generisiNiz(int[] a, int gg) {
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			int broj = r.nextInt(gg);
			a[i] = broj;
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

	static void ispisNiza(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("Element " + i + " niza je: " + a[i]);
		}
	}

}
