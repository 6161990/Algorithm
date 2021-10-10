package HashMapTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Q5 {
	public int solution(int n, int k, int[] arr){
		//set은 중복 제거 하려고 사용 , 정렬은 hashMap 
		int an=-1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());  //큰 숫자가 앞에 오도록 내림차순
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l=j+1; l<n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		
		//Tset.remove(143); 특정 값 treeSet에서 삭제 
		Tset.size(); // 원소의 개수를 출력
		Tset.first(); // 오름차순이면 최소값, 내림차순이면 최댓값을 출력
		Tset.last(); // 오름차순이면 최댓값, 내림차순이면 최솟값 출력
		
		int cnt=0;
		for(int x: Tset) {
			cnt++;
			if(cnt==k) return x;
		}
		return an;
	}

	public static void main(String[] args) throws IOException {
		Q5 T = new Q5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken()); 
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		System.out.print(T.solution(n, k, arr));
	}

}
