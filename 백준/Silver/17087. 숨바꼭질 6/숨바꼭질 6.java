import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] numArray = new int[n];
		for (int i = 0; st.hasMoreTokens(); i++) {
			numArray[i] = Math.abs(Integer.parseInt(st.nextToken()) - s);
		}
		int d = numArray[0];
		for (int i = 0; i < n; i++) {
			d = gcd(d, numArray[i]);
		}
        bw.write(d+"");
        bw.flush();
        bw.close();
        br.close();
	}

	static int gcd(int a, int b) {
		if (b == 0){
			return a;
        } else{
			return gcd(b, a % b);
        }
	}
}