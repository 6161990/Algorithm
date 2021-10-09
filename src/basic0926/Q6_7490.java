package basic0926;


import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.*;  
	  
public class Q6_7490 { 
     static int N;  
	 static ArrayList<Character[]> answerList;  
	  
	 public static void main(String[] args) throws IOException {  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		StringTokenizer st = new StringTokenizer(br.readLine());  
	  
		int testCase = Integer.parseInt(st.nextToken());   // 테스트 케이스 
	  
	  
		for(int i=0; i<testCase; i++){  
	         st = new StringTokenizer(br.readLine());  
	         N = Integer.parseInt(st.nextToken());  // 주어진 정수 
	  
	         Character[] dataArr = new Character[N-1];  // +,0," " 이 들어갈 자릿수 = N이 3이면 1 2 3사이의 두 칸
	         ArrayList<Integer> intArr = new ArrayList<>();  
	         answerList = new ArrayList<>();  
	  
	         for(int j=0; j<N; j++){  
	             intArr.add(j+1); // 1부터 정해진 N 까지 ArrayList에 담기 
	         }  
	  
	          fow(0, dataArr);  
	  
	          Collections.sort(answerList, new Comparator<Character[]>() {  // fow 함수를 거친뒤 answerList = {+,-}
	               @Override  
	               public int compare(Character[] o1, Character[] o2) {  // answerList에 담겨있는 연산자 정렬 
	                    String str1 = new String();  
	                    String str2 = new String();  
	    
                        for(int i=0; i<o1.length; i++){  
                             str1 += String.valueOf(o1[i]);  
                        }  
                        for(int i=0; i<o2.length; i++){  
                             str2 += String.valueOf(o2[i]);  
                        }  
                           return str1.compareTo(str2);  
                        }  
             });  
	  
	         for(Character[] c : answerList){  
	            //case start  
            	String str = new String();  // 숫자와 연산자 더하기 
            	String strAnswer;  
            	String calStrArr[];  
            	ArrayList<Character> charStrArr = new ArrayList<>();  
  
            	int sum = 0;  
  
            	for(int j=0;j<c.length;j++){  // 3이 되기 전까지 숫자와 연산자를 str에 담기 
                    str += String.valueOf((j+1)); // 1  
                    str += c[j];  // 1 +
            	}  
                str += String.valueOf(N);  // 1+2-3
  
                strAnswer = new String(str);  
                str = str.replaceAll(" ","");  // 2 3 을 공백 제거해 23으로 읽히도록
  
                //수정된 숫자 배열  calStrArr
                calStrArr = str.split("\\+|\\-");  
  
                //공백 문자가 빠진 문자 배열  
                for(char ch : str.toCharArray()){  
                    if(ch == '+'){  
                        charStrArr.add(ch);  
                    }else if(ch == '-'){  
                        charStrArr.add(ch);  
                    }  
                }  
  
                sum = Integer.parseInt(calStrArr[0]);  //1
  
                for(int k=0; k<charStrArr.size(); k++){  
                    if(charStrArr.get(k) == '+'){  
                        sum += Integer.parseInt(calStrArr[k+1]);  
                    }else if(charStrArr.get(k) == '-')  
                        sum -= Integer.parseInt(calStrArr[k+1]);  
                }  
  
                if(sum == 0){  
                	System.out.println(strAnswer);  
                }  
            }  
	        System.out.println();  
		}  
	  }  
	  
	    static void fow(int idx, Character c[]){  
	        if(c.length == idx){  // ex) N = 3이면 c에는 2까지 들어갈 수 있으므로 , c.length = 2
	            answerList.add(c.clone());  // Character 배열 c에 있는 값들을 ArrayList<Character[]> answerLis 에 복제 
	            return ;  
	        }  
	  
	        if(idx < N - 1){  // 맨처음은 0 < 2
	            c[idx] = '+';  // [0] = '+'
	            fow(idx + 1, c);  // fow(1,2)
	            c[idx] = '-';  // [1] = '-'
	            fow(idx + 1, c);  // fow(2,2)
	            c[idx] = ' ';  
	            fow(idx + 1, c);  
	        }  
	    }  
	    
}
