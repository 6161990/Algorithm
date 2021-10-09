package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q16 {
	public int[] solution(int input){
		int[] an = new int[input];
		an[0] = 1;
		an[1] = 1;
		
		for(int i=1; i<input-1; i++) {
			an[i+1] = an[i]+an[i-1];
		}
		/**
		 * 또는 
		 * for(int i=2; i<input; i++) {
			 an[i] = an[i-2] + an[i-1];
		   }
		 */
		
		return an;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q16 T = new Q16();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());

		
		for(int x : T.solution(input)) {
			System.out.print(x+" ");
		}
		
		
	}
    
	
}
