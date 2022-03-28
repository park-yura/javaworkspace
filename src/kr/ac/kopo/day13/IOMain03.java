package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

/*
  Koala.jpg (입력용) -> Koala2.jpg (출력용) 복사
 */

public class IOMain03 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		//input, output 만들면 무조건 close
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("iotest/Koala3.jpg");
			bos = new BufferedOutputStream(fos);
			
			//외부장치 -> RAM -> 외부장치 (절대 외부장치 -> 외부장치 다이렉트는 안됨) 
		
			long start =  System.currentTimeMillis();
			
			while(true) {
				int c = bis.read(); // Ioexception 오류 발생 
				if (c == -1) break;// 파일의 끝은 -1값 작성
				bos.write(c); // 변수 c에 있는 정보를 byte 형태로 저장				
			}
		
			fos.flush();
			
			long end = System.currentTimeMillis();
			
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
			
		} catch(Exception e) { // FindNotFoundException 은 new 할 때, read와 write할 때는 Exception
			e.printStackTrace();
		} finally {
			
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
			
//			FileClose.close(bis);
//			FileClose.close(bos);
//			
//			FileClose.close(fis);
//			FileClose.close(fos);
			
		}
		
		/* finally { 
//			연결통로를 없애서 다른 사람이 쓸수 있도록 하는 것 = close(접속해제) 외부장치 연결 해지 메소드는 close()
//			연결해지 코드는 finally에 사용해야함
//			맨 마지막에 입력된 것부터 삭제 (filter 클래스) 
//			내가 확인할 수 있는 예외처리는 해주는게 좋음 (ex. null 처리)
			
			if(bis != null) {
				try {
					bis.close();					
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(bos != null) {
				try {
					bos.close();					
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			try {
				if(fis != null)
					fis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(fos != null)
					fos.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		 */
		System.out.println("파일복사가 완료되었습니다");
	}
}
