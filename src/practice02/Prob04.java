package practice02;

public class Prob04 {
	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		//printCharArray(c1);

		 char[] c2 = reverse( "Java Programming!" );
		 //printCharArray( c2 );
	}

	public static char[] reverse(String str) {
		char[] result = str.toCharArray();
		for (int i = result.length - 1; i >= 0; i--) {
			System.out.print(result[i]);
		}
		System.out.println("");
		return result;
	}

	public static void printCharArray(char[] array) {
		/*
		 * 코드를 완성합니다 배열의 수를 세어서 홀수다 그럼 가운데 뺴고 바꾸면 되는거 짝수이면, swap코드 활용?
		 */
	}
}
