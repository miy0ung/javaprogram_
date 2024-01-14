package 예외처리;

public class 예외처리 {
	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("'java,lang.String2'라는 클래스가 존재하지 않습니다.");
			System.out.println("운영에 대한 내용이 없습니다.");
		}

	}
	public static void findClass() throws ClassNotFoundException{
		//findClass();
		Class clazz = Class.forName("java,lang.String2");
	}

}
