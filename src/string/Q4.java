package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q4 {
	public ArrayList<String> solution(int N, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
			
		}
		
		
		/* 방법 1
		 * for(String x : str) { String tmp = new StringBuilder(x).reverse().toString();
		 * //String은 replace를 한다거나 concat하면 새로운 객체가 생성된다. //String은 한번 변경된 것을 다시 바꿀 수
		 * 없기에 새 객체에 담아야한다. //근데 문자열을 추가한다거나, replace한다면 처음 만든 객체로 다 진행한다. //메모리 낭비도 없다.
		 * String연산이 많아지만 StringBuilder를 사용한다. answer.add(tmp); }
		 */
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q4 T = new Q4();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] str = new String[N];
		for(int i=0; i<N; i++) {
			str[i]=br.readLine();
		}
		
		for(String x : T.solution(N, str)) {
			System.out.println(x);
		}
		
	}

	/*
	 * 3 good time big
	 */
}
