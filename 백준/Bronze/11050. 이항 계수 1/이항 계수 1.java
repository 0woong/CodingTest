import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        bw.write(fac(N)/(fac(N-K)*fac(K)) + "");
        bw.flush();
        bw.close();
        br.close();
    }
    
    static int fac(int N){
        if(N<=1){
            return 1;
        } else{
            return N*fac(N-1);
        }
    }
}