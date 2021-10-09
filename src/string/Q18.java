package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q18 {
	public boolean isPrime(int num) {
		if(num==1) return false; 
		for(int i=2; i>num; i++) { //2부터 자기자신까지 약수가 발견되면 소수가 아니다.
			if(num % i == 0) {
			   return false;
			}
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n , int[] arr){
		ArrayList<Integer> an = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int tmp = arr[i]; 
			int res = 0;
			while(tmp>0) {
				int t = tmp%10; //어떤 숫자를 10으로 나눈(%) 나머지는 일의 자리 (1230이라면 '0', 123이라면 '3')
				res = res * 10 + t; 
				tmp=tmp/10; //어떤 숫자를 10으로 나눈 몫(/) (1230/10 = 123)
			}
			if(isPrime(res)) an.add(res);
		}

		return an;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q18 T = new Q18();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}

		for(int x : T.solution(n, arr) ) {
			System.out.print(x+" ");
		}
		
		
	}
    
	
}
