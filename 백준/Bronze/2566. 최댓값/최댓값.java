import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] arr = new int[9][9];
        int max = 0;
        int w = 0;
        int h = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<9;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]>max){
                    max = arr[i][j];
                    w = i;
                    h = j;
                }
            }
        }
        sb.append(max).append("\n").append(w+1).append(" ").append(h+1);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}