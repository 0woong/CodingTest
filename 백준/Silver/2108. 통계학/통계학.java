import java.io.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        double sum = 0;
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
        }
        Arrays.sort(arr);
        
        // 1
        sb.append(Math.round(sum/N)).append("\n");
        // 2
        sb.append(arr[(N-1)/2]).append("\n");
        
        int cnt = 0;
        boolean flag = false;
        int mode = arr[0];
        int max = -1;
        for(int i=0;i<N-1;i++){
            if(arr[i]==arr[i+1]){
                cnt++;
            } else{
                cnt = 0;
            }
            
            if(max<cnt){
                max = cnt;
                mode = arr[i];
                flag = true;
            } else if(max==cnt && flag){
                mode = arr[i];
                flag = false;
            }
        }
        // 3
        sb.append(mode).append("\n");
        
        // 4
        sb.append(arr[N-1] - arr[0]);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}