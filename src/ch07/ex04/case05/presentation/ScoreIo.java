package ch07.ex04.case05.presentation;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	// 과제: 5명의 국,영,수 점수를 user 가 입력토록 하라.
	// 			interface Console 을 만든다.
	/*public void play() {
		int kor = 0;
		int eng = 0;
		int math = 0;
		Score[] scores = new Score[5];
		for(int i = 0; i < scores.length; i++) {
			Console.info((i + 1) +".국어점수를 입력하세요");
			kor = Console.inInt("국어점수를 입력하세요");
			Console.info((i + 1) + ".영어점수를 입력하세요");
			eng = Console.inInt("영어점수를 입력하세요");
			Console.info((i + 1) + ".수학점수를 입력하세요");
			math = Console.inInt("수학점수를 입력하세요");
			scoreService.addScore(new Score(kor, eng, math));
		}
		scores = scoreService.getScores();
		for(Score score: scores)
			System.out.println(score);
	}*/
	public void play() {
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		for(int i = 0; i < 5; i++) {
			kor = Console.inNum("국어");
			eng = Console.inNum("영어");
			math = Console.inNum("수학");
			
			scoreService.addScore(new Score(kor, eng, math));
		}
		
		Score[] scores = scoreService.getScores();
		for(Score score: scores)
			Console.info(score);
	}
}
