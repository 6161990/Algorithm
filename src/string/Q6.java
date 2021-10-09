package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6 {
	public String solution(String S){
		String answer = "";
		
		for(int i=0; i<S.length(); i++) {
			if(S.indexOf(S.charAt(i))==i) { //해당 문자가 처음으로 발견되는 위치 == 현재 문자의 위치
				answer+=S.charAt(i);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q6 T = new Q6();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		System.out.println(T.solution(S));
		
	}

}
