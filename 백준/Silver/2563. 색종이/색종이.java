import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		boolean[][] check = new boolean[100][100];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for (int j = a; j < a + 10; j++) {
				for (int k = b; k < b + 10; k++) {
					if (check[j][k] == false) {
						check[j][k] = true;
						result++;
					}
				}
			}
		}
		bw.write(result + "");
		bw.flush();
		bw.close();
		br.close();
	}
}