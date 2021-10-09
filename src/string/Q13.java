package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q13 {
	public ArrayList<Integer> solution(int n, int[] s){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(s[0]);
		
		for(int k=1; k<n; k++) {
			if(s[k] > s[k-1]) {
				answer.add(s[k]);
			}
		}
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q13 T = new Q13();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[input];
		
		for(int i=0; i<input; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	 
		for(int x : T.solution(input, arr)){
			System.out.print(x+ " ");
		}
		
	}
    
	
}
