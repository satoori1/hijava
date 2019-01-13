package hijava.practice;
/**
 * 첫번째 자바 실습
 * @author kim
 * @version 0.0.1
 * 
 */
public class HelloJava {

	public static void main(String[] args) {

		HelloJava.say("Hi~"); // HelloJava에게 say라는 명령을 내림!!
		// jvm이 스스로 화면에 출력
		System.out.println("Hello Java!!");
	}

	public static void say(String msg) {
		System.out.println(msg);
	}

}
