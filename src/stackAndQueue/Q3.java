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

public class Q3 {
	public int solution(int[][] board, int[] moves){
		int an=0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int pos : moves) {
			for(int i=0; i<board.length; i++) {  //board.length 행크기 , board[0].length열크기
				if(board[i][pos-1] !=0) { // 배열은 0부터 시작하므로 -1
					int tmp=board[i][pos-1];
					board[i][pos-1]=0;
					if(!stack.isEmpty() && tmp == stack.peek()){
						an += 2;
						stack.pop();
					}
					else stack.push(tmp);
					break;
				}
			}
		}		
	
		return an;
	}

	public static void main(String[] args) throws IOException {
		Q3 T = new Q3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] board = new int[N][N];
		
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<N; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		int[] moves = new int[M];
		for(int k=0; k<M; k++) {
			moves[k]=Integer.parseInt(st.nextToken());
		}
		
		System.out.println(T.solution(board,  moves));
	}

}
