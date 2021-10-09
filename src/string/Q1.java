package string;

import java.util.Scanner;

public class Q1 {
	public int solution(String line, char charword) {
		int x = 0;
		line = line.toUpperCase();
		charword = Character.toUpperCase(charword);
		
		for(int i=0; i<line.length(); i++) {
			if(line.charAt(i) == charword) {
				x++;
			}
		}
		
		/**
		 * 향상된 for문 이용해보기
		 * for(char a : line.toCharArray()) { toCharArray() : String을 char array에 하나씩 담아주는 메소드 
				if(a == charword) {
					x++;
				}
			}
		 */
			
		return x;
	}
	
	public static void main(String[] args) {
		Q1 qq = new Q1();
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		char charword = sc.next().charAt(0);
		
		System.out.println(qq.solution(line, charword));
		
		

	}

}
