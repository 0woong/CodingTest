import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for(int j=0;j<2;j++){
                int number = Integer.parseInt(st.nextToken());
                sum+=number;
            }
            System.out.println(sum);
        }
    }
}