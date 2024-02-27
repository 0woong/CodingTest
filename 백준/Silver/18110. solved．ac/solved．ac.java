import java.io.*;
import java.util.Collections;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;
        int n = Integer.parseInt(br.readLine());
        int cut = (int) Math.round(n * 0.15);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        int size = n-(cut*2);
        for (int a=cut; a<size+cut; a++) {
            result += list.get(a);
        }
        result = (int) Math.round((double) result / size);
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}