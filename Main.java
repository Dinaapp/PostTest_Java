/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Dina Putri
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> daftarGame = new ArrayList<>();
        ArrayList<ArrayList<String>> topUp = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        daftarGame.add("Mobile Legends");
        ArrayList<String> ml = new ArrayList<>();
        ml.add("50 Diamond = Rp20.000");
        ml.add("150 Diamond = Rp55.000");
        ml.add("500 Diamond = Rp250.000");
        topUp.add(ml);
        
        daftarGame.add("Genshin Impact");
        ArrayList<String> gi = new ArrayList<>();
        gi.add("80 Genesis Crystal = Rp20.000");
        gi.add("300 Genesis Crystal = Rp260.000");
        gi.add("980 Genesis Crystal = Rp899.000");
        topUp.add(gi);
        
        daftarGame.add("Roblox");
        ArrayList<String> rx = new ArrayList<>();
        rx.add("80 Robux = Rp15.000");
        rx.add("400 Robux = Rp60.000");
        rx.add("800 Robux = Rp120.000");
        topUp.add(rx);
        
        daftarGame.add("Valorant");
        ArrayList<String> vt = new ArrayList<>();
        vt.add("475 VP = Rp50.000");
        vt.add("1000 VP = Rp95.000");
        vt.add("2050 VP = Rp190.000");
        topUp.add(vt);
        
        int pilihan;
        do {
            System.out.println("\nMENU TOP UP GAME BY DINAP");
            System.out.println("1. Lihat Daftar Game");
            System.out.println("2. Tambah Game Baru");
            System.out.println("3. Tambah Daftar Top Up");
            System.out.println("4. Ubah Nama Game");
            System.out.println("5. Hapus Game");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1:
                    if (daftarGame.isEmpty()) {
                        System.out.println("Belum ada game tersedia.");
                    } else {
                        System.out.println("\n   DAFTAR GAME   ");
                        for (int i = 0; i < daftarGame.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarGame.get(i));
                            for (int j = 0; j < topUp.get(i).size(); j++) {
                                System.out.println("   - " + topUp.get(i).get(j));
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.print("Masukkan nama game baru: ");
                    String namaGame = scanner.nextLine();
                    daftarGame.add(namaGame);
                    topUp.add(new ArrayList<>());
                    System.out.println("Game baru berhasil ditambahkan!");
                    break;

                case 3:
                    if (daftarGame.isEmpty()) {
                        System.out.println("Game Tidak Tersedia.");
                    } else {
                        System.out.println("\nPilih game:");
                        for (int i = 0; i < daftarGame.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarGame.get(i));
                        }
                        int pilihGame = scanner.nextInt();
                        scanner.nextLine();

                        if (pilihGame > 0 && pilihGame <= daftarGame.size()) {
                            System.out.print("Masukkan Variasi Top Up Baru: ");
                            String varBaru = scanner.nextLine();
                            topUp.get(pilihGame - 1).add(varBaru);
                            System.out.println("Variasi berhasil ditambahkan!");
                        } else {
                            System.out.println("Pilihan tidak valid!");
                        }
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nomor game yang ingin diubah: ");
                    int indexUpdate = scanner.nextInt();
                    scanner.nextLine();
                    if (indexUpdate > 0 && indexUpdate <= daftarGame.size()) {
                        System.out.print("Masukkan nama game baru: ");
                        String newGameName = scanner.nextLine();
                        daftarGame.set(indexUpdate - 1, newGameName);
                        System.out.println("Nama game berhasil diubah!");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                    break;

                case 5:
                    System.out.print("Masukkan nomor game yang ingin dihapus: ");
                    int indexDelete = scanner.nextInt();
                    scanner.nextLine();
                    if (indexDelete > 0 && indexDelete <= daftarGame.size()) {
                        daftarGame.remove(indexDelete - 1);
                        topUp.remove(indexDelete - 1);
                        System.out.println("Game berhasil dihapus!");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                    break;

                case 6:
                    System.out.println("Terima Kasih, Top Up Done, Game On!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);

        scanner.close();
    }
    }
   

