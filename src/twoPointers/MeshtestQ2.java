package twoPointers;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//메쉬코리아 테스트 문제

class Result {


    public static String fizzBuzz(int n) {

    	StringBuilder sb = new StringBuilder();
    	int th = 3, fi = 5;
    	for(int i=1; i<=n; i++) {
    		if((i % th == 0) && (i % fi == 0)) {
    			sb.append("fizzBizz"+"\n");
    		} else if (i%fi == 0){
    			sb.append("Bizz"+"\n");
    		} else if(i%th == 0){
    			sb.append("fizz"+"\n");
    		} else {
    			sb.append(i+"\n");
    		}
    	}

    	return sb.toString();
    }

}

public class MeshtestQ2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println(Result.fizzBuzz(n));

        bufferedReader.close();
    }
}
