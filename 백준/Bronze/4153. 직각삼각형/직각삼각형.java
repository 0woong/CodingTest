import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==0 && b==0 && c==0) break;
            if((a*a+b*b)==c*c){
                sb.append("right").append("\n");
            } else if((c*c+b*b)==a*a){
                sb.append("right").append("\n");
            } else if((a*a+c*c)==b*b){
                sb.append("right").append("\n");
            } else{
                sb.append("wrong").append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}