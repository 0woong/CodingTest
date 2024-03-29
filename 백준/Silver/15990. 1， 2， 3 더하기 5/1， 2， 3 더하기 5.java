import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long result=0;
        long [][] dp = new long[100001][4];
        dp[1][1]=1;
        dp[2][2]=1;
        dp[3][1]=1;
        dp[3][2]=1;
        dp[3][3]=1;
        for(int j=4; j<=100000; j++){
            dp[j][1] = (dp[j-1][2] + dp[j-1][3])%1000000009;
            dp[j][2] = (dp[j-2][1] + dp[j-2][3])%1000000009;
            dp[j][3] = (dp[j-3][1] + dp[j-3][2])%1000000009;
        }
        for(int i=0; i<t; i++){
            int k = Integer.parseInt(br.readLine());
            result = (dp[k][1]+dp[k][2]+dp[k][3])%1000000009;
            System.out.println(result);
        }
        br.close();
    }
}