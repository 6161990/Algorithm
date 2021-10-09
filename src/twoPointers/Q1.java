package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1 {
	public int solution(int n , int m, int[] arr){
		int an =0, sum=0, lt=0; 
		
		for(int rt=0; rt<n; rt++) {
			sum += arr[rt];
			if(sum==m) an++;
			while(sum >=m ) {
				sum-=arr[lt++];
				if(sum==m) an++;
			}
		}

		return an;
	}

	public static void main(String[] args) throws IOException {
		Q1 T = new Q1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(T.solution(n,m, arr));
	}

}
