package practice7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Point {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,Integer> l = new HashMap<String,Integer>();
		
		while(true) {
			System.out.print("이름과 포인터 입력>>");
			String name = sc.next();
			if(name.equals("그만")) break;
			int point = sc.nextInt();
			
			try {
				int temp = l.get(name);
				l.replace(name, temp+point);
			}catch(NullPointerException e) {
				l.put(name,point);
			}
			
			Set<String> keys = l.keySet();
			
			Iterator<String> it = keys.iterator();
			for(int i=0; i<l.size();i++) {
				String temp = it.next();
				System.out.print("("+temp+","+l.get(temp)+")");
			}
		}
		sc.close();
	}
}
