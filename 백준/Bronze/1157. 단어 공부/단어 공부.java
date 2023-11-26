import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[26];
        String str = br.readLine().toUpperCase();
        for(int j=0;j<str.length();j++){
    		arr[str.charAt(j)-65]++;
        }
        char result = '?';
        int max = 0;
        for(int k=0;k<arr.length;k++){
            if(arr[k]>max){
                max = arr[k];
                result = (char)(k+65);
            } else if(arr[k]==max){
                max = arr[k];
                result = '?';
            }
        }
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}