package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12 {
	public String solution(int n, String s){
		String answer="";
		for(int i=0; i<n; i++) {
			String tmp = s.substring(0, 7).replace('#','1').replace('*', '0');
			int num = Integer.parseInt(tmp,2); //10진수를 2진수로
			answer+=(char) num;
			s= s.substring(7);
		}
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q12 T = new Q12();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		String str = br.readLine();
		System.out.print(T.solution(input, str));
		
	}
    
	
}
