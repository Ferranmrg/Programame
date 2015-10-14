package RetoSemanal;

public class Main {

	int[][] pyramidMatrix(int N) {

		int matriz[][] = new int[N][N];
		int token = 1;
		for (int k = 0; k < N; k++) {

			for (int i = 0 + k; i < matriz.length - k; i++) {
				for (int j = 0 + k; j < matriz[i].length - k; j++) {
					matriz[i][j] = token;
				}
			}
			token++;
		}

		return matriz;

	}
}