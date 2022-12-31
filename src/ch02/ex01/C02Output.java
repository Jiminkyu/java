package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100);//100에해당하는것을 parameter라고부른다.
		System.out.println(score);//100이constant가아니라 100이라는것을 담은 공간이 constant이다.
		System.out.println(100+1);
		System.out.println(Math.random());
		
		System.out.print(200);//println은자동으로 줄바꿈이되고
		System.out.print(300);//print는 줄바꿈이안된다.
		System.out.print('\n');//print에 \n이라는 parameter가 입력됨으로써 줄바꿈이된다.
		System.out.print(400);
		System.out.println();
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello");// separator
		// 과제: 위 출력문에서 구분자로 '/' 를 사용하라.
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15, "hello");
		
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.156, "hello");
		
		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s은 %d살입니다.", name, age);
		System.out.println();
		System.out.println(name + "은 " + age + "살입니다.");//snippet concate
	}
}