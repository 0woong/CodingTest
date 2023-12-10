import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int result = Math.min(x, w-x);
        result = Math.min(result, y);
        result = Math.min(result, h-y);
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}