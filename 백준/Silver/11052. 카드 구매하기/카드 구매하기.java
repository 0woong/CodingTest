import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n + 1];
        int[] d = new int[n + 1];
        for (int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                d[i] = Math.max(d[i], d[i - j] + arr[j]);
            }
        }
        bw.write(d[n]+"");
        bw.flush();
        bw.close();
        br.close();
    }
}