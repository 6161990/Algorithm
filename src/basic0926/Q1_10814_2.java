package basic0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Q1_10814_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
 
		List<HashMap<String, Object>> members = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			String[] member = br.readLine().split(" ");
			HashMap<String, Object> mm = new HashMap<>();
			mm.put("age", Integer.parseInt(member[0]));
			mm.put("name", member[1]);
			members.add(mm);
		}
		
		Collections.sort(members, new Comparator<HashMap<String, Object>>() {

			@Override
			public int compare(HashMap<String, Object> o1, HashMap<String, Object> o2) {
				Integer age1 = (Integer) o1.get("age");
				Integer age2 = (Integer) o1.get("age");
				return age1.compareTo(age2);
			}
		});
		
		for(int i=0; i<members.size(); i++) {
			System.out.println(members.get(i).get("age")+" "+members.get(i).get("name "));
		}
	}

}
