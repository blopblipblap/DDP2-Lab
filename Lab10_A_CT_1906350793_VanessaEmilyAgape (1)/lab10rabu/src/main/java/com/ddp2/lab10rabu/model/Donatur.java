package com.ddp2.lab10rabu.model;

import java.util.ArrayList;

public class Donatur {
    private static ArrayList<Donatur> daftarDonatur = new ArrayList<Donatur>();
    private String nama;
    private int jumlahDonasi;
    private String asalDaerah;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // TODO: tambahkan getter dan setter lain jika diperlukan
    public int getJumlahDonasi() {
        return this.jumlahDonasi;
    }
    
    public void setJumlahDonasi(int jumlahDonasi) {
        this.jumlahDonasi = jumlahDonasi;
    }
    
    public String getAsalDaerah() {
        return this.asalDaerah;
    }
    
    public void setAsalDaerah(String asalDaerah) {
        this.asalDaerah = asalDaerah;
    }

    public static ArrayList<Donatur> getDaftarDonatur() {
        return daftarDonatur;
    }

    // fungsi untuk menambahkan donatur baru ke dalam daftar donatur
    public static void addDonatur(Donatur donatur) {
        daftarDonatur.add(donatur);
    }

    public static int getTotalDana() {
        // TODO: hitung total dana yang berhasil dikumpulkan dari seluruh donatur
        if (daftarDonatur.size() != 0) {
            int jumlah = 0;
            for (Donatur uang : daftarDonatur) {
                jumlah += uang.getJumlahDonasi();
            }
            return jumlah;
        }
        return 0;
    }

    public static int getTotalDonatur() {
        // TODO: hitung jumlah donatur yang telah menyumbang
        return daftarDonatur.size();
    }
}