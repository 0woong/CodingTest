import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 0;
        for(int i=n;i<=m;i++){
        	if(i==1) continue;
            int cnt = 0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==1){
                sum += i;
                if(min == 0){
                    min = i;
                }
            }
        }
        if(min==0){
            sb.append(-1);
        } else{
            sb.append(sum).append("\n").append(min);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}