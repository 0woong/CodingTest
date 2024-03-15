import java.io.*;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger b = new BigInteger(br.readLine(), 2);
        String result = b.toString(8);
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}