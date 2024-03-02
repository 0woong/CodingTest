import java.io.*;
public class Main{
    static Integer[][] dp = new Integer[41][2];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(T --> 0){
			int N = Integer.parseInt(br.readLine());
			fc(N);
			sb.append(dp[N][0] + " " + dp[N][1]).append('\n');
		}
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    	
	static Integer[] fc(int N) {
		if(dp[N][0] == null || dp[N][1] == null) {
			dp[N][0] = fc(N - 1)[0] + fc(N - 2)[0];
			dp[N][1] = fc(N - 1)[1] + fc(N - 2)[1];
		}
		return dp[N];
	}
}