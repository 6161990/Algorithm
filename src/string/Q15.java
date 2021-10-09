package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q15 {
	public String solution(int[] a1, int[] a2){
		String an = "";
		for(int i=0; i<a1.length; i++) {
			int mi = a1[i] - a2[i];
			if(mi == 1 || mi == -2) {
			  an+= "A";
			}else if(mi==0) {
			  an+= "D";
			}else if(mi == -1 || mi == 2){ //여기서는 else 로 조건 처리 없이 해도댐. A가 이기는 경우는 1과 -2, 비기는 경우 0 , 그 외 나머지는 다 B이므로
			  an+= "B";
			}
		}
		
		/**
		 * 선생님 답안
		 * fot(int i=0; i<n; i++){
		 * if(a[i] == b[i] ) answer +="D";
		 * else if(a[i] ==1 && b[i] == 3) answer +="A";
		 * else if(a[i] ==2 && b[i] == 1) answer +="A";
		 * else if(a[i] ==3 && b[i] == 2) answer +="A";
		 * else answer +="B";
		 * }
		 */
		
		return an;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Q15 T = new Q15();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());  // 가위바위보 횟수 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[input];
		int[] arr2 = new int[input];
		
		for(int i=0; i<input; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr2[i] = Integer.parseInt(st2.nextToken());
		}
	 
		for(char s : T.solution(arr, arr2).toCharArray()) {
			System.out.println(s);
		}
		
	}
    
	
}
