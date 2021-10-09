package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9 {
	public int solution(String str){
		int answer =0;
		String answer3 = "";
		//방법 3
		for(char x: str.toCharArray()) {
			if(Character.isDigit(x)) answer3+=x;
		}
		//return Integer.parseInt(answer3); //방법 3의 return 값		
		
		/*
		 * 방법 2
		 * for(char x: str.toCharArray()) { if(x>=48 && x<=57) { answer = answer * 10 +
		 * (x-48); } }
		 */
		
		/* 내가 한 방법
		 * str = str.replaceAll("[^1-9]", ""); answer = Integer.parseInt(str);
		 */
		 return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q9 T = new Q9();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(T.solution(str));
		
	}

}
