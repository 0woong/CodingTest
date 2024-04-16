import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main{
	public static int N;
	public static int[] cur;	//현재 순열 저장 배열
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	N = Integer.parseInt(br.readLine());
    	cur = new int[N];
    	StringTokenizer st = new StringTokenizer(br.readLine()," ");
    	for(int i=0;i<N;i++) {
    		cur[i] = Integer.parseInt(st.nextToken());
    	}
    	if(chk()) {
    		for(int i=0;i<N;i++) {
    			bw.write(cur[i] + " ");
    		}
    	}else
    		bw.write("-1");
    	bw.flush();
    	bw.close();
    	br.close();
    }

    public static boolean chk() {
    	int point = -1;
    	for(int i=N-1;i>0;i--) {
    		if(cur[i-1]>cur[i]) {
    			point = i;
    			break;
    		}
    	}
    	if(point == -1){
    		return false;
        }
    	int change = -1;
    	for(int i=N-1;i>=point;i--) {
    		if(cur[point-1]>cur[i]) {
    			change = i;
    			break;
    		}
    	}
    	swap(point-1, change);
    	change = N-1;
    	while(point<change) {
    		swap(point,change);
    		point++;
    		change--;
    	}
    	return true;
    }
    public static void swap(int x, int y) {
    	int temp = cur[x];
    	cur[x] = cur[y];
    	cur[y] = temp;
    }
}