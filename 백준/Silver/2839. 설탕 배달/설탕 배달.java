import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(true){
            if(N%5==0) {
            	cnt += N/5;
            	bw.write(cnt+"");
            	break;
            }
            else if(N<0) {
            	System.out.println(-1);
            	break;
            }
            N -= 3;
            cnt++;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}