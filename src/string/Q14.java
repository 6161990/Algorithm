package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q14 {
	public int solution(int n, int[] s){
		int answer = 1, max = s[0]; //맨 처음 값은 들어감 
		
		for(int i=1; i<n; i++) {
			if(max < s[i]) {
				max = s[i];
				answer ++;
			}
		}
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q14 T = new Q14();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());  
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[input];
		
		for(int i=0; i<input; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	 
		
		System.out.print(T.solution(input, arr));
		
		
	}
    //8
	//130 135 148 140 145 150 150 153
	
}
