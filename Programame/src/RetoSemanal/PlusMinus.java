package RetoSemanal;

public class PlusMinus {

	public static void main(String[] args) {
		int[] array = { 4, -3, -9, 0, 4, 1 };
		for (double d : PlusMinus(6, array)) {
			System.out.println(d);
		}

	}

	static double[] PlusMinus(int N, int[] R) {
		double[] a = { 0, 0, 0 };
		for (int i : R) {
			a[i > 0 ? 0 : i < 0 ? 1 : 2]++;
		}
		for (int i = 0; i < 3; i++) {
			a[i] = Math.round(a[i] / N * 1E3) / 1E3;
		}
		return a;
	}

}
