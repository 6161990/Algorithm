package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q5_2 {
	public int solution(int n){
		int an=0, cnt=1;
		n--;
		while(n>0) {
			cnt++;
			n=n-cnt;
			if(n%cnt==0) an++;
		}
		
		
		return an;
	}

	public static void main(String[] args) throws IOException {
		Q5_2 T = new Q5_2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		
		
		System.out.println(T.solution(n));
	}

}
