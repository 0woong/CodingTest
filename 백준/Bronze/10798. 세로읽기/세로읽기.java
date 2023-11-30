import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        char[][] c = new char[5][15];
        int max = 0;
        for(int i=0;i<5;i++){
            String s = br.readLine();
            int n = s.length();
            if(n>max){
                max = n;
            }
            for(int j=0;j<n;j++){
                c[i][j] = s.charAt(j);
            }
        }
        for(int i=0;i<max;i++){
            for(int j=0;j<5;j++){
                if(c[j][i]=='\0') continue;
                sb.append(c[j][i]);
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}