package EncadenaPalabras;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	private static boolean Ejercicio(String n) {
		StringTokenizer st = new StringTokenizer(n);
		String palabras[] = new String[st.countTokens()];
		boolean isTrue = true;
		int i = 0;
		while (st.hasMoreTokens()) {
			palabras[i] = st.nextToken();
			i++;
		}
		for (int j = 0; j < palabras.length - 1; j++) {
			if (!palabras[j].substring(palabras[j].length() - 2, palabras[j].length())
					.equals(palabras[j + 1].substring(0, 2))) {
				isTrue = false;
			}
		}
		return isTrue;
	}

	public static void main(String[] args) {
		String n;
		Scanner scan = new java.util.Scanner(System.in);
		n="d";
		while (scan.hasNextLine()) {
			n = scan.nextLine();
			if (Ejercicio(n)) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}

	}
}
