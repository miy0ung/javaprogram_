package 완성본;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;




public class 완성본 {
	public static void main(String[] args) throws IOException{
	///Introduce///
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		System.out.println("[고객 관계 관리(Customer Relationship Management): CRM]");
		System.out.println();
		for(Board board : list) {
			System.out.println(board.getTitle() + ":" + board.getContent());
		}
      	System.out.println("---------------------------------------------------------------------------------------------");
		
	///content1///
		List<String> listA = new ArrayList<String>();
		
		
		//ArrayList에 string 객체를 저장
		listA.add("CRM 이란?");
		listA.add("CRM의 종류 및 특징");
		listA.add("CRM의 주요 기능");
		listA.add("CRM의 단계 5가지");
		listA.add("CRM의 이점");
		listA.add("CRM의 효과");
		listA.add("기타");
		//
		
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println();
		System.out.println("CONTENT. CRM");		
		System.out.println();
		
		//저장된 총 객체수만큼 루핑 후 출력
		for(int i=0; i<listA.size(); i++) {
			String str = listA.get(i);
			System.out.println("ISSUE" + (i+1) + "." + str);
		}
		System.out.println();
      	System.out.println("---------------------------------------------------------------------------------------------");
		
	///Issue1///
		TitlePoint cp = new TitlePoint("CRM의 의미", "CRM의 가치", "ISSUE 1. CRM이란?");
		cp.showTitlePoint();
		System.out.println();
		
		//데이터 출발지를 "ISSUE1 오징어 게임 글로벌 신드롬.txt"로 하는 문자기반 파일 입력스트림 생성
		FileReader reader = new FileReader("D:/대학교 3학년/계절학기/객체지향프로그래밍/과제/텍스트파일/ISSUE1 CRM이란.txt");
        int ch;
        
        //파일 전체를 읽고 출력
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        //입력스트림 닫음
        reader.close();
        System.out.println();
      	System.out.println("---------------------------------------------------------------------------------------------");
		
    ///Issue2///
        title2Test oc = new title2Ex();
		oc.title2();
		oc.Content1(1);
		oc.Content2(1);
		oc.Content3(2);
		
		System.out.println();
      	System.out.println("---------------------------------------------------------------------------------------------");
    
    ///Issue3///
      //배열을 이용하여 LoginResult의 value 갑을 모두 가져옴
        LoginResult[] results = LoginResult.values();
  		System.out.print("ISSUE 3. CRM의 주요 기능");
        System.out.println();
        System.out.println();
        	
  		//반복문을 돌려 result와 동일하면 값을 출력
  		for(LoginResult result : results){
  			if(result == LoginResult.리드너처링) {System.out.println(result + " - 리드 관리 소프트웨어의 기능으로, 영업 담당자가 영업 깔때기의 모든 단계에서 긍정적인 고객 관계를 쌓고 성장시킬 수 있다.");
  			} else if(result == LoginResult.애널리틱스) {System.out.println(result + " - 분석 기능을 통해 고객이 무엇에 관심이 있는지, 고객에게 어떻게 연락해야 하는지, 언제 개인화된 조치가 필요한지 파악할 수 있다.");
  			} else if(result == LoginResult.판매예측) {System.out.println(result + " - 상담원은 과거 판매 데이터를 조회하고, 중요한 추세를 파악하며, 업계 표준을 비교해 더 나은 예측을 할 수 있다.");
  			} else if(result == LoginResult.실적메트릭) {System.out.println(result + " - 영업 추적 기능을 통한 실적 지표를 통해 목표 달성이 제대로 이루어지고 있는지, 파이프라인의 조정이 필요한지 여부를 알 수 있다.");
  			}
        }
        	
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
  		    
    ///Issue4///
    	Contents Contents = new Contents();
    		
    	ContentA1 content1 = new ContentA1();
    	ContentA2 content2 = new ContentA2();
   		ContentA3 content3 = new ContentA3();
   		ContentA4 content4 = new ContentA4();
    	ContentA5 content5 = new ContentA5();
    		
    	System.out.print("ISSUE 4. CRM 선정 방법 5단계");
    	System.out.println();
    	System.out.println();
    	Contents.Content(content1); // 수정: contentA1 -> content1
    	Contents.Content(content2); // 수정: contentA2 -> content2
    	Contents.Content(content3); // 수정: contentA3 -> content3
    	Contents.Content(content4); // 수정: contentA4 -> content4
    	Contents.Content(content5); // 수정: contentA5 -> content5
            
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
    		
    ///Issue5///
		paint(new title5());   	// title5 s = new title5();
		paint(new content1());     	// title5 s = new content1();
		paint(new content2()); 	// title5 s = new content2();
		paint(new content3());   	// title5 s = new content3();
		paint(new content4());   	// title5 s = new content4();
		
		System.out.println();
      	System.out.println("---------------------------------------------------------------------------------------------");
 
     ///Issue6///    
        //데이터 출발지를 "ISSUE2 K-Pop 혼종성 강화, 팬덤 공고화.txt"로 하는 문자기반 파일 입력스트림 생성
        FileReader reader1 = new FileReader("D:/대학교 3학년/계절학기/객체지향프로그래밍/과제/텍스트파일/ISSUE6 CRM의 효과.txt");
        int ch1;
        
        //파일 전체를 읽고 출력
        while ((ch1 = reader1.read()) != -1) {
            System.out.print((char) ch1);
        }
        
        //입력스트림 닫음
        reader1.close();
        
        System.out.println();
      	System.out.println("---------------------------------------------------------------------------------------------");
			

    ///Issue7///
        //예외처리
      	System.out.print("ISSUE 7. 기타");
      	System.out.println();

        try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("'java,lang.String2'라는 클래스가 존재하지 않습니다.");
			System.out.println("운영에 대한 내용이 없습니다.");
		}
        System.out.println();
      	System.out.println("---------------------------------------------------------------------------------------------");
		
        
        //파일입출력
        //File 객체생성
		File file1 = new File("D:/대학교 3학년/계절학기/객체지향프로그래밍/과제/ISSUE1 CRM이란.txt");
		File file2 = new File("D:/대학교 3학년/계절학기/객체지향프로그래밍/과제/ISSUE2 CRM선정 방법 5단계.txt");
		File file3 = new File("D:/대학교 3학년/계절학기/객체지향프로그래밍/과제/ISSUE6 CRM의 효과.txt");

      	//파일 또는 폴더가 존재하지 않으면 생성
      	if(file1.exists() == false) {  file1.createNewFile();  }
      	if(file2.exists() == false) {  file2.createNewFile();  }
      	if(file3.exists() == false) {  file3.createNewFile();  }

      		
      	//"D:/대학교 2학년/2학기/객체지향프로그래밍/과제/텍스트파일" 폴더의 내용 목록을 file 배열로 얻음
		File temp = new File("D:/대학교 3학년/계절학기/객체지향프로그래밍/과제/텍스트파일");
      	File[] contents = temp.listFiles();
      	
      	System.out.println("시간\t\t\t형태\t\t크기\t이름");
      	System.out.println("---------------------------------------------------------------------------------------------");
      	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
      	for(File file : contents) {
      		//파일 또는 폴더 정보를 출력
      		System.out.print(sdf.format(new Date(file.lastModified())));
      		if(file.isDirectory()) {
      			System.out.print("\t<DIR>\t\t\t" + file.getName());
      		} else {
      			System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
      		}
       		System.out.println();
      	}
      	
        
	
	}
	///Issue4///
	public static void paint(title5 s) {
		s.draw();         // s 객체 내에 오버라이딩된 draw() 호출 
	}
	
	//예외처리//
	public static void findClass() throws ClassNotFoundException{
		//findClass();
		Class clazz = Class.forName("java,lang.String2");
	}
}

///Introduce///
class Board {
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() { return title; }
	public String getContent() { return content; }
}

class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("이름", "김미영"));
		list.add(new Board("학번", "202100573"));
		list.add(new Board("학과", "컴퓨터공학부"));
		return list;
	}
}
///---------///


///Issue1///

class Point {
	private String x, y; // 소제목(issue1)을 구성하는 x, y 좌표
	
	public Point(String x, String y) {
		this.x = x; 
		this.y = y;
	}
	
	public void showPoint() { // 점의 좌표 출력
		System.out.println("-" + x);
		System.out.println("-" + y);
	}
}

class TitlePoint extends Point { 
	private String Title1; // 소제목

	public TitlePoint(String x, String y, String Title1) {
		super(x, y); // Point의 생성자 Point(x, y) 호출
		this.Title1 = Title1;
	}
	
	public void showTitlePoint() { // 소제목 점의 좌표 출력
		System.out.print(Title1);
		System.out.println();
		System.out.println();
		showPoint(); 	// Point 클래스의 showPoint() 호출 
	}
}
///---------///




///Issue2///

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


///---------///


///Issue3///
//열거 선언
enum LoginResult {
	리드너처링,
	애널리틱스,
	판매예측,
	실적메트릭,
}

///---------///

///Issue4///

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
class ContentA1 implements ContentTest {
	@Override
	public void run() {
		System.out.println("1단계: 비즈니스 목표 및 요구사항 파악");
	}
}

//구현 클래스
class ContentA2 implements ContentTest {
	@Override
	public void run() {
		System.out.println("2단계: 다양한 팀 및 부서의 의견 수렴");
	}
}

//구현 클래스
class ContentA3 implements ContentTest {
	@Override
	public void run() {
		System.out.println("3단계: 필요 기능 목록 작성");
	}
}

//구현 클래스
class ContentA4 implements ContentTest {
	@Override
	public void run() {
		System.out.println("4단계: 비즈니스에 적합한 CRM 유형 결정");
	}
}

//구현 클래스
class ContentA5 implements ContentTest {
	@Override
	public void run() {
		System.out.println("5단계: CRM 조사 및 선정");
	}
}

///---------///

///Issue5///
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

///---------///
