import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int temp = 1;
        int sum = 0;
        for(int i=s.length()-1;i>=0;i--){
            char now = s.charAt(i);
            if(now>='A' && now<='Z'){
                sum += (now-'A'+10)*temp;
            } else{
                sum += (now-'0')*temp;
            }
            temp *= B;
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
}