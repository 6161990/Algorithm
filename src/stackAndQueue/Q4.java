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

public class Q4 {
	public int solution(String arr){
		int an= 0;
		Stack<Integer> stack = new Stack<>();
		
		for(Character x : arr.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push(x-48); //48==0
			} else {
				int rt=stack.pop();
				int lt = stack.pop();
				if(x=='+') stack.push(lt+rt);
				else if(x=='-') stack.push(lt-rt);
				else if(x=='*') stack.push(lt*rt);
				else if(x=='/') stack.push(lt/rt);
			}
		}
		an=stack.get(0);
		return an;
	}

	public static void main(String[] args) throws IOException {
		Q4 T = new Q4();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr = br.readLine();
		
		System.out.println(T.solution(arr));
	}

}
