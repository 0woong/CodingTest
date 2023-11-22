import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0;i<count;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cost = Integer.parseInt(st.nextToken());
            int howmany = Integer.parseInt(st.nextToken());
            int ch = cost*howmany;
            sum += ch;
        }
        if(n == sum){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}