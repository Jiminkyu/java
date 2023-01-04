package ch07.ex02;

import ch07.ex02.dao.UserDao;
import ch07.ex02.dao.UserDaoImpl;
import ch07.ex02.presentation.Console;
import ch07.ex02.presentation.UserIo;
import ch07.ex02.sevice.UserService;
import ch07.ex02.sevice.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService  = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		Console.info("start.");
		userIo.play();
		Console.info("end.");
	}
}
