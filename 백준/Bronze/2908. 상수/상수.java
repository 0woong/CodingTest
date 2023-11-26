import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        int a = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
        if(a>b){
            result = a;
        } else if(a<b) {
            result = b;
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}