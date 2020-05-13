package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Random r = new Random();
		int k = r.nextInt(100) + 1;
		int tryCount = 1;

		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		System.out.println("1-100");
		while (true) {
			System.out.print(tryCount + ">>");
			int input = scanner.nextInt();
			if (input > k) {
				System.out.println("더 낮게");
				tryCount++;
			} else if (input < k) {
				System.out.println("더 높게");
				tryCount++;
			} else {
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n)>>");
				String answer = scanner.next();
				if (answer.equals("y")) {
					System.out.println("프로그램 다시 진행하겠습니다.");
					tryCount =0;
					continue;
				} else {
					System.out.println("프로그램 종료하겠습니다. ");
				}

			}
		}

		/* 코드를 완성합니다 */
		// scanner.close();

	}

}
