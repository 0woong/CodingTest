import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String word = br.readLine();
        String[] arr = word.split("");
        int n = Integer.parseInt(br.readLine());
        sb.append(arr[n-1]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}