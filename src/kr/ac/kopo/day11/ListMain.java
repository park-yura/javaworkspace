package kr.ac.kopo.day11;

import java.util.LinkedList;
import java.util.List;


/*
 * List : 순서 0, 중복 0
 	- ArrayList
 	- LinkedList
 	
 	add()
 	get()
 	size()
 	remove()
 	isEmpty()
 	contains()
 	clear()
 
 */

public class ListMain {

	public static void main(String[] args) {
	
//		List<int> list = new ArrayList<int>(); // <int> 에러 => 참조형변수만 쓸 수 있기 때문에
//		List<Integer> list = new ArrayList<Interger>();
//		list.add(10);
		
//		List<String> list = new ArrayList<String>(); 객체를 둔감하게 만듦
//		List<String> list = new ArrayList<>(); // <>타입 생략 가능, 왜냐면 어짜피 같은 타입이니까~!
		List<String> list = new LinkedList<>(); // 묵시적 형변환 , list에서 generic 쓰는 것만 이해하면 됨
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("one"); //중복허용
		
		System.out.println("전체 원소의 개수 : " + list.size() + "개");
		
		//원소는 압출해서 차곡차곡 쌓음 
		System.out.println("< PRINT >");
		for(int i =0; i < list.size(); i++) {
			System.out.println(list.get(i)); //입력된 순서대로 출력
			
		}
		
		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));
		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));
		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));
		
		
		System.out.println("< 1.5버전 >");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("0번지 문자열 : " + list.get(0));
		System.out.println("0번지에 위치한 문자열 삭제 : " + list.remove(0));
		System.out.println("0번지 문자열 : " + list.get(0));
		
	}	
}
