package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] x = input.toCharArray();
		
		int lt =0, rt=input.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(x[lt])) {
				lt ++;
			}else if(!Character.isAlphabetic(x[rt])) {
				rt --;
			}else {
				char tmp = x[lt];
				x[lt] = x[rt];
				x[rt] = tmp;
				lt ++;
				rt --;
			}
		}
	
		System.out.println(String.valueOf(x));
		
	}

}
