package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
   Map : key, value 쌍의 집합(중복 가능), (구분자)key에 대한 중복(X)
   		- HashMap
   		- TreeMap
 */

public class MapMain01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
// ID : 중복불가, PW: 중복가능 (PW 변경하는 방법)
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		System.out.println("< 패스워드 변경 서비스 >");
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		//id = key값 , id가 있는지 확인하려면 containskey 사용
		if(!map.containsKey(id)) {
			System.out.println("입력하신 [" + id + "]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			// system.exit or return(main이니까 가능)
			return;	
		} // if문을 만족하지 못하고 다음 줄로 넘어갔으면 else 안써도 됨
		
		System.out.print("기존의 패스워드 입력 : ");
		String password = sc.nextLine();
		
		// 문자열과 문자열 비교 = equals
		if(!map.get(id).equals(password)) {
			System.out.println("패스워드가 일치하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			return;
		}
		
		// 패스워드 일치
		System.out.print("변경할 패스워드 입력 : ");
		String newPassword = sc.nextLine();
		map.put(id, newPassword);
		System.out.println("패스워드 변경이 완료되었습니다.");
		
		System.out.println("< 회원 정보 출력 >");
		System.out.println("--------------------");
		System.out.println("아이디\t패스워드");
		System.out.println("--------------------");
		
		// 전체 데이터 출력 1.5버전 for문 안먹힘.. 왜? map이 상속받고 있지 않음
		// map에 있는 데이터를 set형 객체로 변환해서 가지려고 함 = entrySet()
		
		// num 1
		Set<String> keys = map.keySet(); // map에 있는 key값만 모아서 Set타입으로 만들어줌
		for(String key : keys) {
			System.out.println(key + "\t" + map.get(key));
		}
		
		/* num 2
		Set<Entry<String, String>> set = map.entrySet(); //set의 generic type = entry // Set<key의 generic, value의 generic>
		for(Entry<String, String> e : set) {
			System.out.println(e.getKey() + "\t" + e.getValue()); // getKey, getValue?
		}
		*/
		
		System.out.println("--------------------");
		
		/*
		 class Map { // Map.class
		 	
		 	class Entry {(map의 내부 클래스: Map$Entry.class)
		 		private Object key;
		 		private Object value;
		 	}
		 }
		 */
	}
}
