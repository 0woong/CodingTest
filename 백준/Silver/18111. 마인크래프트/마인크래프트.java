import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        int min = 256;
        int max = 0;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(min>arr[i][j]) min = arr[i][j];
                if(max<arr[i][j]) max = arr[i][j];
            }
        }
        int mintime = Integer.MAX_VALUE;
        int high = 0;
        for(int i=min;i<=max;i++){
            int time = 0;
            int block = B;
            for(int j=0;j<N;j++){
                for(int k=0;k<M;k++){
                    if(i<arr[j][k]){
                        time += (arr[j][k]-i)*2;
                        block += arr[j][k]-i;
                    } else{
                        time += i-arr[j][k];
                        block -= i-arr[j][k];
                    }
                }
            }
            if(block<0) break;
            if(mintime>=time){
                mintime = time;
                high = i;
            }
        }
        bw.write(mintime+" "+high);
        bw.flush();
        bw.close();
        br.close();
    }
}