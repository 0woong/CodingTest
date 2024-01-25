import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if(n==0){
            n+=2;
        }
        if(n==1){
            n+=1;
        }
        for(int i=n;i<=m;i++){
        	boolean flag = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                	flag = false;
                    break;
                }
            }
            if(flag) {
            	bw.write(i+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}