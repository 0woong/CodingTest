import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==0 && b==0 && c==0) break;
            int sum = a+b+c;
            int max = Math.max(a, b);
            max = Math.max(max, c);
            if(max<(sum-max)) {
            	if(a==b && a==c){
                    sb.append("Equilateral").append("\n");
                } else if(a==b || a==c || b==c){
                    sb.append("Isosceles").append("\n");
                } else{
                    sb.append("Scalene").append("\n");
                }
            } else {
            	sb.append("Invalid").append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}