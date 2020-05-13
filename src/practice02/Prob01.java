package practice02;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		Scanner scanner = new Scanner(System.in);
		System.out.print("금액:");
		int inputMoney = scanner.nextInt();
		for(int i =0; i<MONEYS.length;i++) {
			System.out.print(MONEYS[i]+"원 : " );
			if(inputMoney>MONEYS[i]) {
				int value = inputMoney/MONEYS[i];
				System.out.println(value + "개");
				inputMoney = inputMoney - value*MONEYS[i];
			}else {
				System.out.println("0" +"개");
			}
			
		}

		scanner.close();
	}

}
