package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		char grade = 0;
		char plm = 0;
		//plm = score.intIndex(1);
				
		System.out.print("점수: ");
		score = sc.nextInt();
		
		if(90  <= score) grade ='A';
		else if(80 <= score) grade = 'B';
		else grade = 'C';
		
		if(8 <= score) plm = '+';
		else if(4 > score) plm = '-';
		
		System.out.printf("%c%c", grade, plm);
	}
}
/*
다음 구간별로 학점을 부여하라.
98 이상 A+ 
94 이상 A
90 이상	A-
88 이상 B+
84 이상 B
80 이상 B-
80 미만 C
--

점수: 100
A+
*/