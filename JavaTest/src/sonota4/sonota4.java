package sonota4;

import java.util.Scanner;

public class sonota4 {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("数字を繰り返し入力してください");
		int result = 0;

		//繰り返し
		while (true) {
			//入力文字を格納
			String str = scan.nextLine();

			//入力がなければ終了
			if (str.equals(""))
				break;

			try {
				//入力文字を数値に変換して、合計値に足す
				int num = Integer.parseInt(str);
				result += num;
				//数字以外の入力があった場合の例外処理
			} catch (NumberFormatException e) {
				System.out.println("数字で入力してください");
			}

		}
		System.out.println("合計:" + result); //ループを抜けてから表示する
	}
}