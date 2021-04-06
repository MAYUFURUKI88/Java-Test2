package test_4;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("文字を入力：");
		String str = scan.nextLine();

		System.out.println("入力された文字は" + str + "です");
		scan.close();

	}

}