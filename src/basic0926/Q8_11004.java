package basic0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q8_11004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());  // 5
		int C = Integer.parseInt(st.nextToken());  // 2
		
		int[] finder = new int[10000000];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			finder[i]= Integer.parseInt(st.nextToken());
		}
		
		for(int j=0; j<finder.length; j++) {
			if(finder[j] == C) {
				System.out.println(j);
			}
		}
		
	}

}
