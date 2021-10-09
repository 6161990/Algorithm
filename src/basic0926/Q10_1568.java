package basic0926;

import java.io.IOException;
import java.util.Scanner;

public class Q10_1568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = 1; 
		int count = 0;
		
		while(N>0) {
			if(N < K) {
				K =1;
			}
			N -=K;
			count++;
			K++;
		}
		System.out.println(count);
	}

}
