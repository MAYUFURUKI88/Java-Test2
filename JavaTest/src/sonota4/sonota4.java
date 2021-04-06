package sonota4;

import java.util.Scanner;

public class sonota4 {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1つ目の数字を入力してください: ");
        int num1 = scanner.nextInt();
        System.out.print("2つ目の数字を入力してください: ");
        int num2 = scanner.nextInt();
        System.out.print("3つ目の数字を入力してください: ");
        int num3 = scanner.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
	      scanner.close();
}
}