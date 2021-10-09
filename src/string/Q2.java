package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String isUpperOrLower = sc.next();
		String answer ="";
		
		for(char caseChar : isUpperOrLower.toCharArray()) {
			//방법 3 아스키 넘버 활용
			if(caseChar >= 65 && caseChar <= 90) { //97~122는 소문자 
				answer += (char)(caseChar+32);  //아스키넘버에서 소문자와 대문자 차잇수가 32
			}else {
				answer += (char)(caseChar-32);
			}
			/*
			if(Character.isUpperCase(caseChar)) {
				answer += Character.toLowerCase(caseChar);
			}else {
				answer += Character.toUpperCase(caseChar);
			}*/
		}
		System.out.println(answer);
		
		/*내가 짠 코드 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * String input = br.readLine(); ArrayList<Character> inputToChar = new
		 * ArrayList<>();
		 * 
		 * for(char g : input.toCharArray()) { if(Character.isUpperCase(g)) {
		 * inputToChar.add(Character.toLowerCase(g)); }else {
		 * inputToChar.add(Character.toUpperCase(g)); } } for(char a : inputToChar) {
		 * System.out.print(a); }
		 */
	
	}

}
