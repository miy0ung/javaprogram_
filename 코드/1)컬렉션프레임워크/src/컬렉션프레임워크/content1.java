package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.List;

public class content1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		
		//ArrayList에 string 객체를 저장
		list.add("CRM 이란?");
		list.add("CRM의 종류 및 특징");
		list.add("CRM의 주요 기능");
		list.add("CRM의 단계 5가지");
		list.add("CRM의 이점");
		list.add("CRM의 효과");
		list.add("기타");
		//
		
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println();
		System.out.println("CONTENT. CRM");		
		System.out.println();
		
		//저장된 총 객체수만큼 루핑 후 출력
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println("ISSUE" + (i+1) + "." + str);
		}
		System.out.println();
				
		
	}
}
