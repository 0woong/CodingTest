import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int maxx = -10000;
        int maxy = -10000;
        int minx = 10000;
        int miny = 10000;
        for(int i=0;i<n;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	minx = Math.min(minx, x);
        	miny = Math.min(miny, y);
        	maxx = Math.max(maxx, x);
        	maxy = Math.max(maxy, y);
        }
        bw.write((maxx-minx)*(maxy-miny)+"");
        bw.flush();
        bw.close();
        br.close();
    }
}