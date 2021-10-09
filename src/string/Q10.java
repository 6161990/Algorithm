package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10 {
	public int[] solution(String str, char c){
		
		int[] answer = new int[str.length()];
		int p = 1000;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				p=0;
				answer[i]=p;
			}else {
				p++;
				answer[i]=p;
			}
		}
		p=1000;
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i) == c) p=0;
			else {
				p++;
				answer[i]=Math.min(answer[i], p);
			}
		}
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q10 T = new Q10();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String str1 = st.nextToken();
		char c  = st.nextToken().charAt(0);
	
		for(int x: T.solution(str1, c)) {
			System.out.print(x+" ");
		}
	}
    
	// teachermode e
}
