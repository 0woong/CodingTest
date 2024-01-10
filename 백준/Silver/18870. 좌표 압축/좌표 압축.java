import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;
import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		int[] origin = new int[N];
		int[] sorted = new int[N];
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();	// rank를 매길 HashMap
 
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sorted);
		
		int rank = 0;
		for(int v : sorted) {
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(' ');
		}
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}