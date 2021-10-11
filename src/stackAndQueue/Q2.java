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

public class Q2 {
	public String solution(String arr){
		String an= "";
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char x : arr.toCharArray()) {
			if(x==')') {
				while(stack.pop()!='(');
			}else {
				stack.push(x);
			}
		}
		
		for(int i=0; i<stack.size(); i++) {
			an+=stack.get(i);
		}
		return an;
	}

	public static void main(String[] args) throws IOException {
		Q2 T = new Q2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr = br.readLine();
		
		System.out.println(T.solution(arr));
	}

}
