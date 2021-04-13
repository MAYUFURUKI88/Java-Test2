package test2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//今日の日付
public class Test2 {
	public static void main(String[] args) {
//		LocalDate today = LocalDate.now();
//		System.out.println(today);
//
//		//特定の日付
//		LocalDate date = LocalDate.of(1993, 4, 5);
//		System.out.println(date);
//		
//		//フォーマットの指定
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("y'年'MM'月'dd'日'");
//		
//		//日付を指定フォーマットに編集
//			String formatDate = (today.format(dtf));
//			
//			System.out.println(formatDate);
		
		
		LocalDate today = LocalDate.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("y'年'MM'月'dd'日'");
		
		
		
		System.out.println(today.format(dtf));
	}

}
