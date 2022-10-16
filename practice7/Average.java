package practice7;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		double score=0;
		double average=0;
		ArrayList<String> s = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		
		for(int i=0; i<6; i++) {
			String a = scanner.next();
			s.add(a);
		}
		
		for(int i=0; i<6; i++) {
			String grade = s.get(i);
			
			switch (grade) {
			case "A": score+=4.0; break;
			case "B": score+=3.0; break;
			case "C": score+=2.0; break;
			case "D": score+=1.0; break;
			case "F": score+=0; break;
			}
		}
		average = score/6;
		System.out.println(average);
		
		scanner.close();
	}
	
}
