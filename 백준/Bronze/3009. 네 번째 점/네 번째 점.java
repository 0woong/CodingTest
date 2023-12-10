import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] a2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] a3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int x, y;
        if(a1[0]==a2[0]) {
        	x=a3[0];
        } else if(a2[0]==a3[0]) {
        	x=a1[0];
        } else {
        	x=a2[0];
        }
        if(a1[1]==a2[1]) {
        	y=a3[1];
        } else if(a2[1]==a3[1]) {
        	y=a1[1];
        } else {
        	y=a2[1];
        }
        bw.write(x+" "+y);
        bw.flush();
        bw.close();
        br.close();
    }
}