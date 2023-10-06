import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Sara", 4597);
		map.put("Dipam", 2296);
		map.put("Radhika", 2508);
		map.put("Bhumit", 2798);
		System.out.println(map);
		System.out.println("Enter your username : ");
		String uname = sc.next();
		if(map.containsKey(uname)) {
			System.out.println("enter your password : ");
			int pwd = sc.nextInt();
			if(map.get(uname).equals(pwd)) {
				System.out.println("Welcome "+uname);
			}
			else {
				System.out.println("password incorrect");
			}
		}
		
		else {
			System.out.println("OOPS! user not found");
			System.out.println("Do want to add ? Y/N");
			String ans = sc.next();
			if(ans.equals("Y")) {
				System.out.println("enter your password : ");
				int p = sc.nextInt();
				map.put(uname, p);
				System.out.println(map);
			}
		}
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
