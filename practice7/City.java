package practice7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Location{
	String name;
	String longitude;
	String latitude;
	
	Location(String name, String latitude, String longitude){
		this.name =name;
		this.longitude = longitude;
		this.latitude = latitude;
	}
}
public class City {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		scanner.useDelimiter("[,\n]");
		HashMap<String, Location> s = new HashMap<String, Location>();
		
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			
			String name = scanner.next();
			String lati = scanner.next();
			String longi = scanner.next();
			
			Location l = new Location(name,lati,longi);
			s.put(name, l);	
		}
		Set<String> keys = s.keySet();
		
		Iterator<String> it = keys.iterator();
		for(int i=0; i<4; i++) {
			String name = it.next();
			System.out.println(s.get(name).name+" "+s.get(name).latitude+" "+s.get(name).longitude);
		}
		
		while(true) {
			System.out.print("도시 이름>>");
			String search = scanner2.next();
			
			if(search.equals("그만")) break;
			try {
				System.out.println(s.get(search).name+" "+s.get(search).latitude+" "+s.get(search).longitude);
			}
			catch(NullPointerException e) {
				System.out.println(search + "는 없습니다.");
			}
		}
		
		scanner.close();
		scanner2.close();
	}
	
}
