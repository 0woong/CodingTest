import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        Integer[] arr = new Integer[s.length()];
        for(int i=0;i<s.length();i++){
        	char c = s.charAt(i);
            arr[i] = Character.getNumericValue(c);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0;i<s.length();i++) {
        	sb.append(arr[i]);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}