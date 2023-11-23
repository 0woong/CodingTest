import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = 0;
        double sum = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]>max){
                max=arr[i];
            }
            sum+=arr[i];
        }
        double avg = ((sum/max)*100)/n;
        bw.write(avg+"");
        bw.flush();
        bw.close();
        br.close();
    }
}