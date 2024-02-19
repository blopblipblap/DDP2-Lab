import java.util.Scanner;
public class CarnivorousCheo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Masukkan banyaknya porsi makanan: ");
		int porsi=input.nextInt();
		
		for(int i=1; i<(porsi+1); i++) {
			if (i%3==0 && i%2==0)
				System.out.println("Makanan campuran sayur dan daging");
			else if (i%3==0)
				System.out.println("Makanan daging");
			else
				System.out.println("Makanan sayur");

		}

	}
}
