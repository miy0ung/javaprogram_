package 다형성상속;


//자식 클래스
class content1 extends title5 {
	// 메소드 오버라이딩
	public void draw() { 	
		System.out.println("-데이터 정리");
	}
}

class content2 extends title5 {
	// 메소드 오버라이딩
	public void draw() { 
		System.out.println("-목표 설정 및 진행 상황 추적");
	}
}

class content3 extends title5 {
	// 메소드 오버라이딩
	public void draw() { 	
		System.out.println("-고객 상호작용을 개인화");
	}
}

class content4 extends title5 {
	// 메소드 오버라이딩
	public void draw() { 	
		System.out.println("-대상 고객층 공략");
	}
}

//여기까지 자식클래스

class title5 {
	
	public void draw() {
		System.out.println("ISSUE 5. CRM의 이점");
		System.out.println("");
	}
}


public class Issue5 {
	public static void main(String[] args) {

		paint(new title5());   	// title5 s = new title4();
		paint(new content1());     	// title5 s = new content1();
		paint(new content2()); 	// title5 s = new content2();
		paint(new content3());   	// title5 s = new content3();
		paint(new content4());   	// title5 s = new content4();
		
	}

	public static void paint(title5 s) {
		s.draw();         // s 객체 내에 오버라이딩된 draw() 호출 
	}
}