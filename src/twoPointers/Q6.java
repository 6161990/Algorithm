package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q6 {
	
	public int solution(int n, int k, int[] arr){
		int an = 0, cnt=0, lt=0;
		for(int rt=0; rt<n; rt++) {
			if(arr[rt]==0) cnt++;
			while(cnt>k) {
				if(arr[lt]==0) cnt--;
				lt++;
			}
			an=Math.max(an, rt-lt+1);
		}

		return an;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q6 T = new Q6();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}

		
		System.out.print(T.solution(n, k, arr));
		
		
		
	}
    
	
}
