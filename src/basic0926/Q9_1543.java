package basic0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9_1543 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String finderLine = br.readLine();
		String word = br.readLine();

		int answer = 0;
		
		for(int i=0; i<finderLine.length()-word.length()+1; i++) { //10-2 = 9 0123456789
			if(finderLine.substring(i, i+word.length()).equals(word)) { 
				i+=word.length()-1;
				answer++;
			}
		}
		System.out.println(answer);

	}

}
