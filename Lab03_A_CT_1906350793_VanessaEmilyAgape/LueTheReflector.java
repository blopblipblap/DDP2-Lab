import java.util.Arrays;
import java.util.Scanner;
public class LueTheReflector {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan jumlah baris: ");
		int baris = input.nextInt();
		System.out.println("Masukkan jumlah kolom: ");
		int kolom = input.nextInt();
		
		int[][] array = new int[baris][kolom];
		
		System.out.println("Input password: ");
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				array[i][j] = input.nextInt();
			}
		}
		for (int a = baris-1; a >= 0; a--) {
			for (int b = kolom-1; b >= 0; b--) {
				System.out.print(array[a][b]+" ");
			}
			System.out.println("");
		}
	}
}
