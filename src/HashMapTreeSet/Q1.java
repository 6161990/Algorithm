package HashMapTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Q1 {
	public char solution(int n , String arr){
		Map<Character, Integer> map1 = new HashMap<>();
		char an= ' ';
		
		for(char x : arr.toCharArray()) {
			map1.put(x, map1.getOrDefault(x,0)+1); //map1에 x가 없으면 value를 0을 리턴, 있으면 value값을 리턴
		}
		
		System.out.println(map1.containsKey('A'));//특정 key가 있는지 확인 
		System.out.println(map1.size());//key의 종류 개숫를 확인
		System.out.println(map1.remove('A'));//특정 key의 개수 하나를 제거 
		
		int max = Integer.MIN_VALUE;
		for(char key : map1.keySet()) {
			if(map1.get(key)>max) {
				max=map1.get(key);
				an=key;
			}
		}

		return an;
	}

	public static void main(String[] args) throws IOException {
		Q1 T = new Q1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());  //15
		String arr = br.readLine();
		
		System.out.println(T.solution(n, arr));
	}

}
