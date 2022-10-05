package format;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		// Date 객체를 생성하여 오늘 날짜 및 현재 시간을 다음과 같이 변환하여 출력
		// ex) 2022년 9월 27일 (화) [오전] 9시 25분 30초
		
		Date now = new Date();
		
		// 1.
		String pattern = "yyyy년 M월 dd일 (E) [a] h시 mm분 ss초";
		
		// 2.
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		// 3.
		String formattingNow = sdf.format(now);
		System.out.println(formattingNow);
		
		// -------------------------------------------------------------------------
		
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern)));
	}

}
