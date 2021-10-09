package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q17 {
	public int solution(int n){
		int an = 0;
		int[] ch = new int[n+1]; //인덱스 번호를 20까지 만들어야하므로 +1
		for(int i=2; i<=n; i++) {//input까지 
			if(ch[i] == 0) {
				an++;
				for(int j=i; j<=n; j=j+i) { //i의 배수씩 증가
					ch[j] = 1;
				}
			}
		}
		return an;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q17 T = new Q17();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());

		
		System.out.println(T.solution(input));
		
		
	}
    
	
}
