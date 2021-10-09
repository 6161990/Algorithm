package twoPointers;
import javax.print.DocFlavor;
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

//메쉬코리아 틀렸던 문제

class Result2 {

    /*
     * Complete the 'bitPattern' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts INTEGER_ARRAY num as parameter.
     */

    public static List<String> bitPattern(List<Integer> num) {
        List<String> answer = new ArrayList<String>();
        List<String> answer2 = new ArrayList<String>();

        List<Integer> head = num.subList(0 , num.size()/2);
        List<Integer> tail = num.subList(num.size()/2 , num.size());

        String a = "1", b = "0";
        int dv = 2;

        for(int i=0; i<num.size(); i++){
            if(head.contains(num.get(i))){// 132341
            	 dv=-1;
                 answer.add(String.valueOf(dv));
                 answer2.add(b);
            }else if(tail.contains(num.get(i))){
            	dv=-1;
                answer.add(b);
                answer2.add(String.valueOf(dv));
            }else{
                answer.add(b);
                answer2.add(b);
            }
            dv=1;
        }
        answer.add("\n");
        for(String x : answer2){
            answer.add(x);
        }

        return answer;
    }

}

public class MeshtestQ3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> num = IntStream.range(0, numCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<String> result = Result2.bitPattern(num);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
