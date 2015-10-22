package RetoSemanal;

public class NRomano {
	public static void main(String[] args) {
		System.out.println(RomanNumerals("XLIX"));
	}

	static int RomanNumerals(String s) {
		int total = 0, anterior = 0;
		for (int i = 0; i < s.length(); i++) {
			char letra = s.charAt(i);
			int num = 0;
			switch (letra) {
			case 'I':
				num = 1;
				break;
			case 'V':
				num = 5;
				break;
			case 'X':
				num = 10;
				break;
			case 'L':
				num = 50;
				break;
			case 'C':
				num = 100;
				break;
			case 'D':
				num = 500;
				break;
			case 'M':
				num = 1000;
				break;
			default:
				break;
			}
			total += num - anterior * 2 % num;
			anterior = num;
		}
		return s.matches("^M*(D?C{0,3}|C[MD])(L?X{0,3}|X[CL])(V?I{0,3}|I[XV])$") ? total : -1;
	}

}
