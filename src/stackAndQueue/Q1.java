package stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q1 {
	public String solution(String arr){
		String an= "YES";
		Stack<Character> stack = new Stack<Character>();
		
		for(char x : arr.toCharArray()) {
			if(x=='(') {
				stack.push(x);
			}else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return an;
	}

	public static void main(String[] args) throws IOException {
		Q1 T = new Q1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr = br.readLine();
		
		System.out.println(T.solution(arr));
	}

}
