import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] coin = {25, 10, 5, 1};
        for(int i=0;i<n;i++){
            int m = Integer.parseInt(br.readLine());
            for(int j=0;j<coin.length;j++){
                int count = 0;
                while(true){
                	int check = m-coin[j];
                	if(check<0) break;
                    m -= coin[j];
                    count++;
                }
                sb.append(count).append(" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}