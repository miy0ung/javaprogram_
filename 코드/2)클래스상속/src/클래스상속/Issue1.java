package 클래스상속;

import java.io.FileReader;
import java.io.IOException;

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

public class Issue1 {
	public static void main(String[] args) throws IOException{
		
		TitlePoint cp = new TitlePoint("CRM의 의미", "CRM의 가치", "ISSUE 1. CRM이란?");
		cp.showTitlePoint();
		System.out.println();
		
		//데이터 출발지를 "ISSUE1 CRM이란.txt"로 하는 문자기반 파일 입력스트림 생성
		FileReader reader = new FileReader("D:/대학교 3학년/계절학기/객체지향프로그래밍/과제/텍스트파일/ISSUE1 CRM이란.txt");
        int ch;
        
        //파일 전체를 읽고 출력
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        //입력스트림 닫음
        reader.close();
	}
}