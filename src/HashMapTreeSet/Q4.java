package HashMapTreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q4 {
	public int solution(String a, String b){ 
		int an=0, lt=0;
		HashMap<Character, Integer> am = new HashMap<>(); //bacaAacba
		HashMap<Character, Integer> bm = new HashMap<>(); //abc
		
		for(char x : b.toCharArray()) { //찾을 단어(b)를 =hashMap에 담기
			bm.put(x, bm.getOrDefault(x, 0)+1);
		}
		
		int L = b.length()-1; //b=3. so, L=2 
		
		for(int i=0; i<L; i++) { //a를 hashMap에 담기 b.length()-1만큼만  ([0] [1])
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
		}
		
	
		for(int rt=L; rt<a.length(); rt++) { //[2] 부터 
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
			if(am.equals(bm)) an++;
			am.put(a.charAt(lt),  am.get(a.charAt(lt))-1);
			if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
			lt++;
		}
		
		return an;
	}

	public static void main(String[] args) throws IOException {
		Q4 T = new Q4();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		String b = br.readLine();
		
		System.out.print(T.solution(a, b));
	}

}
