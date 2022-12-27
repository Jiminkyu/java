package CH05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		boolean isGood = false;
		
		
			user.setJoinDate(LocalDate.now());
			System.out.println();
			
			System.out.printf("이름: %s\n나이: %d\n가입일: %s", user.getUserName(), user.getAge(), user.getJoinDate());
	}
}
/*
과제: user를 생성하라.
user가 user의 이름, 나이를 입력한다.
app이 user의 가입일을 입력한다.
--

이름: gambit
나이: 25

이름: gambit
나이: 25
가입일: 2022-12-27
*/