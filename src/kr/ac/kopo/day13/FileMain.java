package kr.ac.kopo.day13;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		
		
		File dirObj = new File("iotest");
		if(dirObj.exists()) {
			
			File[] list = dirObj.listFiles();
			for(File f : list) {
				System.out.println(f.getName());
				System.out.println(f.isDirectory() ? "디렉토리" : "파일");
			
//			String[] list = dirObj.list();
//			for(String data : list) {
//				System.out.println(data);
//				File fileObj = new File(dirObj.getName() + "/" + data);
//				System.out.println(fileObj.isDirectory() ? "디렉토리" : "파일");
			}
		}
		
		/*
		File dirObj = new File("iotest/강아지/리트리버");
		
		
		System.out.println("존재여부 : " + dirObj.exists());
		System.out.println("디렉토리 여부 : " + dirObj.isDirectory()); 
		System.out.println("파일 여부 : " + dirObj.isFile());
		
		if(!dirObj.exists()) {
//			dirObj.mkdir(); // 맨 마지막의 폴더를 만드는게 목적, 그 전 파일이 없으면 안만들어짐
			dirObj.mkdirs(); // 중간 파일이 없어도 파일 전부를 생성해줌
		}
		
		*/
		
		/*
		File fileObj = new File("iotest/a.txt"); //iotest 밑에 있는 a.txt의 내용을 가져오고 싶어! 내가 지금 돌리고 있는 java 폴더에서..
		
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		
		System.out.println("파일명 : " + fileName);
		System.out.println("부모 : " + parent);
		
		System.out.println("파일 존재여부 : " + fileObj.exists());
		
		long fileSize = fileObj.length(); // length는 return 타입이 long
		System.out.println("파일 크기 : "+ fileSize + "byte(s)");
		
		System.out.println(fileObj.canRead() ? "읽기가능" : "읽기불가능");
		System.out.println(fileObj.canWrite() ? "쓰기가능" : "쓰기불가능");
		
		long lastTime = fileObj.lastModified(); // 언제 마지막으로 수정되었는지 
		String pattern = "yyyy-MM-dd HH:mm:SS";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("마지막 수정시간 : " + sdf.pattern);
		
		 */
		 
		// file 객체를 이용하여 윈도우 탐색기 만들 수 있음
	}
}
