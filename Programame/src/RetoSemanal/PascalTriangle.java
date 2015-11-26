package RetoSemanal;

public class PascalTriangle {
	static int[] PascalTriangleRow(int fila) {
		int num = 1;
		int[] x = new int[++fila];
		for (int i = 0; i <= fila; num = num / ++i * fila) {
			x[--fila] = x[i] = num;
		}
		return x;
	}

	public static void main(String[] args) {
		for (int i : PascalTriangleRow(5)) {
			System.out.println(i);
		}
	}

}
