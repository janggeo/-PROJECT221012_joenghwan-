package practice7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Word{
	String kor;
	String eng;
	Word(String eng, String kor){
		this.eng=eng;
		this.kor=kor;
	}
}
public class WordQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=7;
		int choice;
		Vector<Word> v =new Vector<Word>();
		v.add(new Word("love","사랑"));
		v.add(new Word("animal","동물"));
		v.add(new Word("picture", "사진"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("society", "사회"));
		v.add(new Word("painting", "그림"));
		v.add(new Word("human", "인간"));
		
		
		while(true) {
			Vector<Integer> temp = new Vector<Integer>();
			
			for(int i=0; i<4; i++) {
				int temp3 = (int)(Math.random()*(size));
				if(temp.contains((Integer)temp3)) {
					i--;
					continue;
				}
				temp.add(temp3);
			}
			System.out.println(v.get(temp.get(0)).eng+"?");
			ArrayList<Integer> arr = new ArrayList<Integer>();
			while(arr.size()<4) {
				int temp2 = (int)((Math.random()*4));
				if(arr.contains(temp2)) {
					continue;
				}
				arr.add(temp2);
			}
		
			
			for(int j=1; j<5; j++) {
				System.out.print(" ("+j+")"+v.get(temp.get(arr.get(j-1))).kor);
			}
			
			System.out.print(":>");
			choice = sc.nextInt();
			if(choice==-1) break;
			if(v.get(temp.get(arr.get(choice-1))).kor.equals(v.get(temp.get(0)).kor)) {
				System.out.println("Excellent !!");
			}
			else {
				System.out.println("No. !!");
			}
			
			
		}
		
	}
}
