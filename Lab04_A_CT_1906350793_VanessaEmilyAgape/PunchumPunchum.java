import java.util.ArrayList;
import java.util.Scanner;

public class PunchumPunchum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah nyawa PunchumPunchum: ");
        int nyawaPunchumPunchum = Integer.parseInt(input.nextLine());
        System.out.print("Masukan jumlah kuda: ");
        int jumlahKuda = Integer.parseInt(input.nextLine());

        ArrayList<WhiteHorse> semuaWhiteHorses= new ArrayList<>();
        ArrayList<RedHorse> semuaRedHorses = new ArrayList<>();
        ArrayList<BlackHorse> semuaBlackHorses = new ArrayList<>();
        ArrayList<PaleHorse> semuaPaleHorses = new ArrayList<>();


        System.out.println("Masukan input kuda kuda (cth: RED BAMBANG 20 5):");
        for(int i=0 ; i< jumlahKuda; i++){
            String[] inputKuda = input.nextLine().split(" ");
            String jenis = inputKuda[0];
            String nama = inputKuda[1];
            int jumlahMakanan = Integer.parseInt(inputKuda[2]);
            int kecepatan = Integer.parseInt(inputKuda[3]);

            if(jenis.equals("WHITE")){
                //TODO buat object whiteHorse
            	WhiteHorse whiteHorse = new WhiteHorse(nama, jumlahMakanan, kecepatan);
                semuaWhiteHorses.add(whiteHorse);
            }
            else if(jenis.equals("RED")){
                //TODO buat object redHorse
            	RedHorse redHorse = new RedHorse(nama, jumlahMakanan, kecepatan);
                semuaRedHorses.add(redHorse);
            }
            else if(jenis.equals("BLACK")){
                //TODO buat object blackHorse
            	BlackHorse blackHorse = new BlackHorse(nama, jumlahMakanan, kecepatan);
                semuaBlackHorses.add(blackHorse);
            }
            else if(jenis.equals("PALE")){
                //TODO buat object paleHorse
            	PaleHorse paleHorse = new PaleHorse(nama, jumlahMakanan, kecepatan);
                semuaPaleHorses.add(paleHorse);
            }
        }

        //TODO Hitung total power semua kuda yang ada
        int sum = 0;
        for (WhiteHorse powerWhite : semuaWhiteHorses) {
        	sum = sum + powerWhite.getTotalPower();
        }
        for (RedHorse powerRed : semuaRedHorses) {
        	sum = sum + powerRed.getTotalPower();
        }
        for (BlackHorse powerBlack : semuaBlackHorses) {
        	sum = sum +powerBlack.getTotalPower();
        }
        for (PaleHorse powerPale : semuaPaleHorses) {
        	sum = sum + powerPale.getTotalPower();
        }

        //TODO Output total power dan prediksi menang/kalah
        System.out.println("Total horse power: "+sum);
        if (sum > nyawaPunchumPunchum || sum == nyawaPunchumPunchum) {
        	System.out.println("PunchumPunchum pasti terkalahkan");
        } else {
        	System.out.println("Kekuatan kuda-kuda Cheo the good doggo tidak cukup untuk mengalahkan PunchumPunchum");
        }

    }
}

class WhiteHorse{
    public String nama;
    public int banyakBebekDimakan;
    public int kecepatan;

    public WhiteHorse(String nama, int jumlahBebek, int kecepatan){
        //TODO buat constructor
    	this.nama = nama;
    	this.banyakBebekDimakan = jumlahBebek;
    	this.kecepatan = kecepatan;
    }
    public int getTotalPower(){
        //TODO rumus total power white horse
    	int panjangNama = nama.length();
    	int totalPowerWhite = banyakBebekDimakan * kecepatan + panjangNama;
    	return totalPowerWhite;
    }
}

class RedHorse{
    public String nama;
    public int banyakUdangDimakan;
    public int kecepatan;

    public RedHorse(String nama, int jumlahUdang, int kecepatan){
        //TODO buat constructor
    	this.nama = nama;
    	this.banyakUdangDimakan = jumlahUdang;
    	this.kecepatan = kecepatan;
    }
    public int getTotalPower(){
        //TODO rumus total power red horse
    	int panjangNama = nama.length();
    	int totalPowerRed = banyakUdangDimakan * kecepatan * panjangNama;
    	return totalPowerRed;       
    }
}

class BlackHorse{
    public String nama;
    public int banyakTempeDimakan;
    public int kecepatan;

    public BlackHorse(String nama, int jumlahTempe, int kecepatan){
        //TODO buat constructor
    	this.nama = nama;
    	this.banyakTempeDimakan = jumlahTempe;
    	this.kecepatan = kecepatan;
    }
    public int getTotalPower(){
        //TODO rumus total power black horse
    	int panjangNama = nama.length();
    	int totalPowerBlack = banyakTempeDimakan + kecepatan * panjangNama;
    	return totalPowerBlack;
    }  
}

class PaleHorse{
    public String nama;
    public int banyakNasiUdukDimakan;
    public int kecepatan;

    public PaleHorse(String nama, int jumlahNasiUduk, int kecepatan){
        //TODO buat constructor
    	this.nama = nama;
    	this.banyakNasiUdukDimakan = jumlahNasiUduk;
    	this.kecepatan = kecepatan;
    }
    public int getTotalPower(){
        //TODO rumus total power pale horse
    	int panjangNama = nama.length();
    	int totalPowerPale = banyakNasiUdukDimakan + kecepatan + panjangNama;
    	return totalPowerPale;
    }
}