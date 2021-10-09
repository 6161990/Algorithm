package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11 {
	public String solution(String str){
		String answer="";
		str=str +" ";
		
		int r = 1;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				++r;
			}else {
				answer+=str.charAt(i);
				if(r>1) answer+=String.valueOf(r);
				r = 1;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q11 T = new Q11();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.print(T.solution(str));
		
	}
    
	
}
