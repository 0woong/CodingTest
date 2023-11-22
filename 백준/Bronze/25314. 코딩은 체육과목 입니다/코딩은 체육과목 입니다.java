import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int ans = n/4;
        for(int i=0;i<ans;i++){
            sb.append("long ");
        }
        sb.append("int");
        System.out.print(sb);
    }
}