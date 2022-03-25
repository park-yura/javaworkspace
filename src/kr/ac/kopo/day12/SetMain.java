package kr.ac.kopo.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
  Set : 순서(x), 중복(x)
  	- HashSet
  	- TreeSet
 */

public class SetMain {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>(); // 문자인 경우 글자가 오름차순으로 정렬됨
		
		System.out.println("\"one\"입력성공여부 : " + set.add("one")); 
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		System.out.println("\"one\"입력성공여부 : " + set.add("one")); 
		
		System.out.println("전체 원소의 개수 : " + set.size() + "개");
		
		/*
		 * 전체 데이터 접근방법 3가지
		 * 1. 1.5버전의 for문 이용
		 * 2. toArray() 메소드 이용
		 * 3. Iterator 객체 이용
		 */
		
		System.out.println("< 1.5 for문 이용한 출력 >");
		
		for(String str : set) { // 입력한거랑 다른 순서로 출력
			System.out.println(str);
		}
		
		System.out.println("< toArray() 이용한 출력 >"); // toArray - set이 가지고 있는 데이터들을 배열에 저장 / object 배열로 나옴
		
		Object[] arr = set.toArray(); // 인덱스이용<> 접근, arrays to string, 1.5버전 for문 : 배열 출력 방법
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); //arr[i]는 현재 object형 arr[i].toString()으로 출력 
			// 오브젝트형이라서 arr[i].length 사용 불가
		}
		
		/* 
		 * Iterator(순환객체) 주요 메소드
		 * 	- hasNext() : 다음에 접근할 데이터가 있는지 확인하는 메소드 (데이터 존재여부 판단) : true, false로 나옴
		 *  - next()	: 데이터 접근
		 */
		
		System.out.println("< Iterator 이용한 출력 >"); //모든 객체에 접근
		Iterator<String> ite = set.iterator(); // iterator은 string형
		//끝났을때 멈추는 메소드
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
}
