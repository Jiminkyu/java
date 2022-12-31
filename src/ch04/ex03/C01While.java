package ch04.ex03;

public class C01While {
	public static void main(String[] args) {
		int weight = 80;
		int jumpCnt = 0;
		
		while(weight > 60) {
			jumpCnt++;
			weight--;
		}//true가나오면 이블럭을 계속실행한다.
		System.out.printf("%d번 줄넘기해서, 몸무게 %d이 되었습니다.", jumpCnt, weight);
	}
}
