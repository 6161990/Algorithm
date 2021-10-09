package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8 {
	public String solution(String str){
		String answer = "NO";
		
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if(tmp.equals(str)) {
			answer ="YES";
		}

		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q8 T = new Q8();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(T.solution(str));
		
	}

}
