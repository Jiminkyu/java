package ch04.home.ex02;

import java.util.Scanner;

public class H05Kawobawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userChoice = 0;
		int appChoice = (int)(Math.random() * 2) + 1;
		String user = "";
		String app = "";
		String rsult = "";
		
		System.out.print("1.가위, 2.바위, 3.보\n> ");
		userChoice = sc.nextInt();
			
		user = switch(userChoice) {
		case 1 -> "가위";
		case 2 -> "바위";
		case 3 -> "보";
		default -> "";
		};
		
		app = switch(appChoice) {
		case 1 -> "가위";
		case 2 -> "바위";
		case 3 -> "보";
		default -> "";
		};
		
		if(userChoice == 2 || appChoice == 2) {
			if(userChoice < appChoice) rsult = "You lose.";
			else if(userChoice > appChoice) rsult = "You win.";
		} 
		if(userChoice < appChoice) rsult = "You win.";
		else if(userChoice > appChoice) rsult = "You lose";
		if(userChoice == appChoice) rsult = "Fair";
		
		System.out.printf("You: %s\nMe: %s\n\n%s", user, app, rsult);
	}
}
/*
과제: 앱과 가위바위보를 하라. 게임 결과를 출력하라. 결과는
You win.
You lose.
Fair.
중 하나이다.
--

1.가위, 2.바위, 3.보
> 1
You: 가위
Me: 보

You win.
*/
/*답안
 


		
		
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.print("1.가위, 2.바위, 3.보\n> ");
		playerChoice = sc.newxtInt();
		appChoice = (int)(Math.random() * 3) + 1;
		
		if(1 <= playerChoice && playerChoice <= 3) {
			result = switch(playerChoice - appChoice) {
			case -2, 1 -> "You win.";
			case -1, 2 -> "You lose.';
			default -> "Fair.";
		};
		
		choice = switch(playerChoice){
		case 1 -> "가위"
		case 2 -> "바위"
		default -> "보"
		};
		System.out.println("You: " + choice);
		
		choice = switch(appChoice){
		case 1 -> "가위"
		case 2 -> "바위"
		default -> "보"
		};
		System.out.println("Me: " + choice);
	} else result = "ERROR] 1, 2, 3 중에서 입력하세요.";
	
	System.out.println("\n" + result);
*/