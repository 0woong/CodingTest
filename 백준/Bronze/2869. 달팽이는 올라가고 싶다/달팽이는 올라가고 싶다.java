import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int top = Integer.parseInt(st.nextToken());
        int day = (top - down) / (up-down);
        if((top-down)%(up-down) != 0) {
        	day++;
        }
        bw.write(day+"");
        bw.flush();
        bw.close();
        br.close();
    }
}