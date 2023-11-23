import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[9];
        int max = 0;
        int index = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        sb.append(max).append("\n").append(index+1);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}