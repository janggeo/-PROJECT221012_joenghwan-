package practice7;

import java.util.Scanner;
import java.util.Vector;

public class Rainfall {
	public static void main(String[] args) {
		int input=-1;
		int average=0;
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("강수량 입력(0 입력시 종료)>>");
			input = scanner.nextInt();
			
			if(input==0) break;
			
			v.add(input);
			average+=input;
			
			for(int i=0; i<v.size(); i++) {
				System.out.print(v.get(i)+" ");
			}
			System.out.println();
			System.out.println("현재 평균 "+(average/v.size()));
		}
		scanner.close();
	}
}
