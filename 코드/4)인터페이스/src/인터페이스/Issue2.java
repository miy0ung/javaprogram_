package 인터페이스;

// Issue3 인터페이스를 구현한 구현 클래스를 Issue3와 관련된 내용을 출력하도록 작성하였다.

interface title2Test {
	//추상 메소드
  	void title2();
	void Content1(int num1);
	void Content2(int num2);
	void Content3(int num3);
}

class title2Ex implements title2Test {
	public void title2() {
		System.out.println("ISSUE 2. CRM의 종류 및 특징");
		System.out.println();
	}

	public void Content1(int num1) {
		System.out.println(num1 + ". 운영 CRM");
		System.out.println("- 영업 자동화");
		System.out.println("- 마켓팅 자동화");
		System.out.println("- 고객 서비스 자동화");

	}

	public void Content2(int num2) {
		System.out.println(num2 + ". 분석 CRM");
		System.out.println("- 데이터 웨어하우징");
		System.out.println("- 데이터 마이닝");
		System.out.println("- OLAP(Online Analytical Processing)");

	}

	public void Content3(int num3) {
		System.out.println(num3 + ". 협업 CRM");
		System.out.println("- 상호작용관리");
		System.out.println("- 채널관리");
		System.out.println("- 문서관리");

	}
}


public class Issue2 {

	public static void main(String[] args) {
		title2Test oc = new title2Ex();
		oc.title2();
		oc.Content1(1);
		oc.Content2(2);
		oc.Content3(3);
		
	}
}