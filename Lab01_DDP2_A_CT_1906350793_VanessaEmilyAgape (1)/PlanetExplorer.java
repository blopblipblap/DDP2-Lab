import java.util.Scanner;

public class PlanetExplorer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama planet: ");
        String namaPlanet = input.nextLine();
        System.out.print("Masukkan jumlah alien: ");
        int bilangan = input.nextInt();
        input.nextLine();
        System.out.println("Nama planet yang ditemukan: " + prosesPlanet(namaPlanet));
        System.out.println("Jumlah alien yang ditemukan: " + prosesAlien(bilangan));
        input.close();
    }

    public static String prosesPlanet(String namaPlanet) {
    	if (namaPlanet.length()==0 || namaPlanet.length()==1) 
    		return namaPlanet;
    	else {
    		if (namaPlanet.charAt(0) == namaPlanet.charAt(1)) 
    			return prosesPlanet((namaPlanet.charAt(0) + prosesPlanet(namaPlanet.substring(2))));
    		else
    			return namaPlanet.charAt(0) + prosesPlanet(namaPlanet.substring(1));
    	}
    }

    public static int prosesAlien(int bilangan) {
    	if (bilangan < 10)
    		return bilangan;
    	else {
    		return prosesAlien(bilangan%10 + prosesAlien(bilangan / 10));
    	}
    }
}
