import java.io.*;
public class Main{
    static int dp[] = new int [11];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for(int i=4;i<=10;i++) {
			dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
		}
		for(int i=0;i<n;i++) {
			int m = Integer.parseInt(br.readLine());
			sb.append(dp[m]).append("\n");
		}
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}