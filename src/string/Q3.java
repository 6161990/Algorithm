package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		ArrayList<String> as = new ArrayList<>();
		
		for(int i=0; i<st.countTokens(); i++) {
			while(st.hasMoreTokens()) {
				as.add(st.nextToken());
			}
		}
		
		for(int j=0; j<as.size(); j++) {
			Collections.sort(as, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o2.length() - o1.length();

				}
			});
		}
		System.out.println(as.get(0));
		
		//It is time to study
		
		int m = Integer.MIN_VALUE, pos; //자바에서의 정수 최솟값 MIN_VALUE
		String answer ="";
		String read = br.readLine();
		while((pos=read.indexOf(" "))!= -1) { //read에서 띄어쓰기가 있는 index가 -1이 일 때까지(띄어쓰기가 더이상 없을때까지) 현재 pos는  2 , 그러나 마지막 단어는 포함하지 않게된다. (study 뒤에 띄어쓰기가 더이상 없으므로)
			String tmp = read.substring(0,pos); //It is~~ 에서 [0]부터 띄어쓰기가 있는 [2] 바로 전까지 = It
			int len = tmp.length(); //2
			if(len>m) { //2(It) > 0 
				m=len; // m = 2 (It) 기준점 change
				answer=tmp; // "It"
			}
			read = read.substring(pos+1); //read값 초기화 (빈칸 포함해서 계산됨)
		}
		if(read.length()>m) answer=read; //마지막 단어가 현재 기준점보다 크다면 그게 답
	}
	
	// 방법 2
	/*
	 * 
	 * int m = Integer.MIN_VALUE;
		String answer ="";
		String[] str = br.readLine().split(" ");
		for(String x : str) {
			int leng = x.length();
			if(leng>m) { //새로들어온 애(leng) = m(기준점이된 애)
				m=leng; //기준점을 바꾸고 
				answer=x; //답도 바꾸고
			}
		}
	 */
	
	// 방법 3
}
