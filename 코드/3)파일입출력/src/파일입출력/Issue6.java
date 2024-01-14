package 파일입출력;


import java.io.FileReader;
import java.io.IOException;
 
public class Issue6 {
    public static void main(String[] args) throws IOException {
    	//데이터 출발지를 "ISSUE2 K-Pop 혼종성 강화, 팬덤 공고화.txt"로 하는 문자기반 파일 입력스트림 생성
        FileReader reader = new FileReader("D:/대학교 3학년/계절학기/객체지향프로그래밍/과제/텍스트파일/ISSUE6 CRM의 효과.txt");
        int ch;
        
        //파일 전체를 읽고 출력
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        
        //입력스트림 닫음
        reader.close();
    
    }
}
