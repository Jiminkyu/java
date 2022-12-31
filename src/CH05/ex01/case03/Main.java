package CH05.ex01.case03;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		//user.userName; private 붙은 variable이기때문에 컴파일error가뜬다.
		
		user.setUserName("최한석");
		user.setAge(12);
		
		user.setUserName("한아름");
		user.setAge(45);
		
		System.out.printf("%s, %d\n", user.getUserName(), user.getAge());
	}
}
