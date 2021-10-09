package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7 {
	public String solution(String str){
		String answer = "NO";
		
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer="YES"; //대문자소문자는 무시
		
		
		/* 방법 2
		 * str=str.toUpperCase(); 
		 * int len = str.length();
		 * 
		 * for(int i=0; i< len/2; i++) { 
		 * if(str.charAt(i)!=str.charAt(len-i-1)) 
		 * return "NO"; 
		 * }
		 */
		
		/*내가 푼 방법
		 * int lt=0, rt=str.length()-1; 
		 * while(!(lt==str.length()/2)) { //짝수가됐건 홀수가 됐건 ,어차피 홀수는 가운데 지 혼자만 있으므로 
		 * if((str.charAt(lt)==str.charAt(rt))) { 
		 *    answer="YES";
		 *    lt++; 
		 *    rt--; 
		 *   }else { 
		 *    answer="NO"; 
		 *    break; 
		 *   } 
		 * }
		 */

		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q7 T = new Q7();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(T.solution(str));
		
	}

}
