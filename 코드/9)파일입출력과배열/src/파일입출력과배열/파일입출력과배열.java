package 파일입출력과배열;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 파일입출력과배열 {
	public static void main(String[] args) throws Exception {
		//File 객체생성
		File file1 = new File("D:/대학교 2학년/2학기/객체지향프로그래밍/과제/ISSUE1 CRM이란.txt");
		File file2 = new File("D:/대학교 2학년/2학기/객체지향프로그래밍/과제/ISSUE2 CRM선정 방법 5단계.txt");
		File file3 = new File("D:/대학교 2학년/2학기/객체지향프로그래밍/과제/ISSUE6 CRM의 효과.txt");

		
		//파일 또는 폴더가 존재하지 않으면 생성
		if(file1.exists() == false) {  file1.createNewFile();  }
		if(file2.exists() == false) {  file2.createNewFile();  }

		
		//"D:/대학교 3학년/계절학기/객체지향프로그래밍/과제/텍스트파일" 폴더의 내용 목록을 file 배열로 얻음
		File temp = new File("D:/대학교 3학년/계절학기/객체지향프로그래밍/과제/텍스트파일");
		File[] contents = temp.listFiles();
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("----------------------------------------------------------");
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
}

