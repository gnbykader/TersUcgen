import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner inp = new Scanner(System.in);
		System.out.println("Basamak Sayisi Giriniz: ");
		n = inp.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = n; j > n - i; j--) {
				System.out.print(" ");
			}
			for (int k = n + 1; k >= (2 * i) - 1; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
