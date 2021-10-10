package HashMapTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Q3 {
	public ArrayList<Integer> solution(int n, int k, int[] arr){
		ArrayList<Integer> an = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<k-1; i++) { //k=4니까 0,1,2까지만 세팅
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		int lt=0;
		for(int rt=k-1; rt<n; rt++) {  //3부터 7까지
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1); //4가 완성
			an.add(map.size()); // 4가 완성될 때의 map의 종류 갯수
			map.put(arr[lt], map.get(arr[lt])-1); // 맨 앞 값 -1 
			if(map.get(arr[lt])==0) map.remove(arr[lt]); //맨 앞의 값이 더이상 map에 없다면 지우기
			lt++; // 그 다음 lt
		}
		return an;
	}

	public static void main(String[] args) throws IOException {
		Q3 T = new Q3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken()); //7
		int k = Integer.parseInt(st.nextToken()); //4
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int x: T.solution(n, k, arr)) System.out.print(x+" ");
	}

}
