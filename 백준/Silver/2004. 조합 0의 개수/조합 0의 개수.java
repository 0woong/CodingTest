import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());

		long cnt5 = five(N) - five(N - M) - five(M);
		long cnt2 = two(N) - two(N - M) - two(M);
		System.out.println(Math.min(cnt5, cnt2));
        br.close();
    }
    static long five(long num) {
		int cnt = 0;
		while (num >= 5) {
			cnt += (num / 5);
			num /= 5;
		}
		return cnt;
	}
 
	static long two(long num) {
		int cnt = 0;
		while (num >= 2) {
			cnt += (num / 2);
			num /= 2;
		}
		return cnt;
	}
}