package 다형성인터페이스;

import java.io.FileReader;
import java.io.IOException;

//매개 변수를 인터페이스화
class Contents {
	public void Content(ContentTest ContentTest) {
		ContentTest.run();
	}
}

//인터페이스
interface ContentTest {
	public void run();
}

//구현 클래스
class Content1 implements ContentTest {
	@Override
	public void run() {
		System.out.println("1단계: 비즈니스 목표 및 요구사항 파악");
	}
}

//구현 클래스
class Content2 implements ContentTest {
	@Override
	public void run() {
		System.out.println("2단계: 다양한 팀 및 부서의 의견 수렴");
	}
}

//구현 클래스
class Content3 implements ContentTest {
	@Override
	public void run() {
		System.out.println("3단계: 필요 기능 목록 작성");
	}
}

//구현 클래스
class Content4 implements ContentTest {
	@Override
	public void run() {
		System.out.println("4단계: 비즈니스에 적합한 CRM 유형 결정");
	}
}

//구현 클래스
class Content5 implements ContentTest {
	@Override
	public void run() {
		System.out.println("5단계: CRM 조사 및 선정");
	}
}

//매개 변수의 다형성 테스트
public class Issue4 {
	public static void main(String[] args) throws IOException {
		Contents Contents = new Contents();
		
		Content1 content1 = new Content1();
		Content2 content2 = new Content2();
		Content3 content3 = new Content3();
		Content4 content4 = new Content4();
		Content5 content5 = new Content5();
		
		System.out.print("ISSUE 4. CRM 선정 방법 5단계");
		System.out.println();
		System.out.println();
		Contents.Content(content1);
		Contents.Content(content2);
		Contents.Content(content3);
		Contents.Content(content4);
		Contents.Content(content5);
	}
}



