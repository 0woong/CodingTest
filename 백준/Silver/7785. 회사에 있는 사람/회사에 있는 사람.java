import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String state = st.nextToken();

			if (map.containsKey(name)) {
				map.remove(name);
			} else {
				map.put(name, state);
			}
		}

		ArrayList<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list, Collections.reverseOrder());
		
		for(var li : list) {
			sb.append(li+"\n");
		}
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}