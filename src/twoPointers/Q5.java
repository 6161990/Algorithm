package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q5 {
	public int solution(int n){
		int an =0, sum=0, lt=0; 
		int m = n/2+1; //연속된 자연수가 몇까지 필요한지. n=15면, 7+8에서 8이 최대수 = m
		int[] arr = new int[m];
		
		for(int i=0; i<m; i++) {
			arr[i]=i+1;
		}
		
		for(int rt=0; rt<m; rt++) {
			sum+=arr[rt];
			if(sum==n) an++;
			while(sum>=n) {
				sum-=arr[lt++];
				if(sum==n) an++;
			}
			
		}
		
		return an;
	}

	public static void main(String[] args) throws IOException {
		Q5 T = new Q5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		
		
		System.out.println(T.solution(n));
	}

}
