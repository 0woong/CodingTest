import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double sumpoint = 0;
        double sum = 0;
        for(int i=0;i<20;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String sub = st.nextToken();
            double point = Double.parseDouble(st.nextToken());
            double score = -1;
            String s = st.nextToken();
            switch(s) {
                case "A+":
                    score = 4.5;
                    break;
                case "A0":
                    score = 4.0;
                    break;
                case "B+":
                    score = 3.5;
                    break;
                case "B0":
                    score = 3.0;
                    break;
                case "C+":
                    score = 2.5;
                    break;
                case "C0":
                    score = 2.0;
                    break;
                case "D+":
                    score = 1.5;
                    break;
                case "D0":
                    score = 1.0;
                    break;
                case "F":
                    score = 0.0;
                    break;
                default:
                    break;
            }
            if(score != -1){
                sum += point*score;
                sumpoint += point;
            }
        }
        double result = sum/sumpoint;
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}