package format;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Test2 {

	public static void main(String[] args) throws ParseException {
		int money = 128000000;
		
		String pattern = "#,###원";
		
		// 1. 정수 128000을 128,000원 형식으로 변경하여 출력
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println(df.format(money));
		
		// 2. 문자열 "128,000원" 을 정수 128000으로 변경하여 출력
		String strNum = df.format(money);
		
		long parsedNum = (long)df.parse(strNum);
		System.out.println(parsedNum);
	}
}
