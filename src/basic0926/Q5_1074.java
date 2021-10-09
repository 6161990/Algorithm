package basic0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5_1074 {
	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int hang = Integer.parseInt(st.nextToken()); //행 
		int yeol = Integer.parseInt(st.nextToken()); //열
		int size = (int) Math.pow(2, N); //한 변의 사이즈

		find(size, hang, yeol);
		System.out.println(count);
	}
	
	private static void find(int size, int hang, int yeol) { // 한변의 사이즈와 타겟 위치 인덱스 (hang, yeol)를 넘겨받음
		if(size == 1) { 
			return ;
		} 
		if(hang < size / 2 && yeol < size /2) {  //hang,yeol가 1사분면에 속한다면 앞에서 아무 곳도 방문하지 않았으므로 count를 그냥 둠
			
			find(size/2, hang, yeol);
			
		} else if ( hang < size /2 && yeol >= size /2) { // hang과 yeol가 2사분면에 속함. 앞에서 1사분면을 방문해야하므로 
			
			count += size * size / 4;
			find(size/2, hang, yeol - size/2); // 현재 size의 절반, 2사분면에서의 행,열 상대위치 넘겨준다.
			
		} else if(hang >= size/2 && yeol < size/2) { // 3사분면 앞에서 1,2,사분면 방문해야하므로 count에 더하고
			
			count += (size * size / 4) * 2;
			find(size/2, hang - size/2, yeol); // 현재 size의 절반 3사분면에서의 상대위치 넘겨준다. 
			
		} else {  // 4사분면
			
			count += (size * size / 4) * 3;
			find(size/2, hang - size/2, yeol - size/2);
			
		}
	}

}
