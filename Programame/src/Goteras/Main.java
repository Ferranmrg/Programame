package Goteras;

public class Main {
	static java.util.Scanner in;

	public static void casosDePrueba() {
		int horas = 0;
		int minutos = 0;
		int segundos = in.nextInt();

		while (segundos >= 60) {
			if (segundos >= 60) {
				segundos -= 60;
				minutos += 1;
			}
			if (minutos >= 60) {
				minutos -= 60;
				horas += 1;
			}
		}
		if (horas < 24) {
			if (horas + 1 >= 11) {
				System.out.print(horas + ":");
			} else {
				System.out.print("0" + horas + ":");
			}
			if (minutos + 1 >= 11) {
				System.out.print(minutos + ":");
			} else {
				System.out.print("0" + minutos + ":");
			}
			if (segundos + 1 >= 11) {
				System.out.print(segundos);
			} else {
				System.out.print("0" + segundos);
			}
			System.out.println("");

		} else {
			System.out.println("24:00:00");
		}
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		int numCasos;
		numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++) {
			casosDePrueba();

		}
	}
}
