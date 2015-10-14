package EncadenaPalabras;

import java.util.StringTokenizer;

public class Maino {
	static java.util.Scanner in;

	public static void analizaCadena(String cad) {
		StringTokenizer token = new StringTokenizer(cad);
		String compara = token.nextToken();
		boolean isTrue = true;
		// SE PROCESAN LAS PALABRAS DE UNA EN UNA
		// LA ULTIMA PALABRA SE ALMACENA PARA COMPARARSE CON LA SIGUIENTE
		
		while (token.hasMoreElements()) {
			String pal = token.nextToken();
			if (!sacaSilaba(pal, compara))
				
				// CAMBIAR EL ESTADO SI NO COINCIDEN
				
				isTrue = false;
			compara = pal;
		}
		//IMPRIMIR RESULTADO
		if (isTrue)
			System.out.println("SI");
		else
			System.out.println("NO");
	}

	private static boolean sacaSilaba(String pal, String compara) {
		// SE PROCESA POR STRINGBUILDER
		StringBuilder pal1 = new StringBuilder(pal);
		StringBuilder comp = new StringBuilder(compara);
		// INVERTIR
		comp.reverse();
		// SACAR LAS 2 PRIMERAS
		String silComp = comp.substring(0, 2);
		StringBuilder compRes = new StringBuilder(silComp);
		// INVERTIR DE NUEVO
		compRes.reverse();
		silComp = compRes.toString();
		// COMPARAR
		String silPal = pal1.substring(0, 2);
		if (silPal.equals(silComp))
			return true;
		else
			return false;

	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		String n;
		// MIENTRAS NO SE PASE EL PARAMETRO DE SALIDA SIGUE PIDIENDO ELEMENTOS
		while (in.hasNextLine()) {
			n = in.nextLine();
			analizaCadena(n);
		}
	}
}