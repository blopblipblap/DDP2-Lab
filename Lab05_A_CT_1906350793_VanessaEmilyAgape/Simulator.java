package lab5;
import java.util.Scanner;

/*
 * Simulator of Lue the Donator
 */
public class Simulator {
    public static void main(String[] args) {
        
        // INITIALIZATION SECTION

        Place fasilkom = new Place("Fasilkom");
        fasilkom.add(new Seller("Crepes", 9000, 180000));
        fasilkom.add(new Seller("Piscok", 3000, 60000));
        fasilkom.add(new Seller("Yoshinoya", 22500, 450000));
        fasilkom.add(new Seller("Soto", 13000, 260000));
        fasilkom.add(new Seller("Gado", 13000, 195000));
        fasilkom.add(new Seller("Nasgor", 14000, 280000));
        // TO DO: Complete according to table
        Place perpusat = new Place("Perpusat");
        perpusat.add(new Seller("Mie", 15000, 345000));
        perpusat.add(new Seller("Pecel", 11000, 220000));
        perpusat.add(new Seller("Seblak", 15000, 275000));
        perpusat.add(new Seller("Dips", 10000, 400000));
        perpusat.add(new Seller("Calais", 20000, 380000));
        perpusat.add(new Seller("Minuman", 25000, 425000));
        // TO DO: Complete according to table
        System.out.println("---------------------------------------");
        System.out.print(fasilkom);
        System.out.println("---------------------------------------");

        // INPUT SECTION

        Scanner in = new Scanner(System.in);
        boolean hasChosenExit = false;
        System.out.println("Input Transaksi");
        while (!hasChosenExit) {
            System.out.print("Masukkan penjual: ");
            String name = in.next();
            if (name.toLowerCase().equals("exit")) {
                hasChosenExit = true;
            } else {
                System.out.print("Masukkan jumlah transaksi: ");
                int transaction = in.nextInt();
                // TO DO:
                // Get specific seller from class Place
                Seller seller = Place.getSpecificSeller(name);
                // Add transaction to that seller
                seller.addTransactions(transaction);
            }
        }
        in.close();

        // OUTPUT SECTION
        
        // TO DO: Follow the output
        System.out.println("---------------------------------------");
        System.out.println("Terdapat " + Place.getNumOfSellers() + " di kedua tempat .");
        System.out.println("Target keuntungan seluruh penjual sebesar " + Place.getTotalTarget() + " .");
        System.out.println("Keuntungan yang didapat hari ini adalah sebesar " + Place.getTotalProfit() + " .");
        if (Place.getTotalTarget() > Place.getTotalProfit()) {
        	System.out.println("Maka, Lue harus memberi donasi sebesar " + (Place.getTotalTarget() - Place.getTotalProfit()) + " .");
        } else {
        	System.out.println("Maka, Lue tidak perlu memberi donasi .");
        }
    }
}