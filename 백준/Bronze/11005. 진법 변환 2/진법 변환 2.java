import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while(N>0){
        	int num = N%B;
        	char except = (char) (num+55);
            if(num>=10 && num<=35) {
            	sb.append(except);
            } else {
            	sb.append(num);
            }
            N = N/B;
        }
        sb.reverse();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}