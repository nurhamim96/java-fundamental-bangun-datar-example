package com.tutorial.javafundamental.bangundatar;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*Kamus*/

        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();

        /*Program*/
        while (true) {

            //panggil metode
            mainMenu();

            //kondisional untuk pilihan menu yang dimasukan
            switch (pilihan) {
                case '1': {
                    System.out.print("Masukan panjang persegi: ");
                    s1 = scanner.nextInt();
                    System.out.print("Masukan lebar persegi: ");
                    s2 = scanner.nextInt();
                    System.out.println("Luas persegi panjang: " + opersegi.luas(s1, s2));
                    System.out.println("Keliling persegi panjang: " + opersegi.keliling(s1, s2));
                    break;
                }
                case '2': {
                    System.out.print("Masukan alas segitiga siku: ");
                    s1 = scanner.nextInt();
                    System.out.print("Masukan tinggi segitiga siku: ");
                    s2 = scanner.nextInt();
                    System.out.println("Luas segitiga: " + osegitiga.luas(s1, s2));
                    System.out.println("Keliling segitiga: " + osegitiga.keliling(s1, s2));
                    break;
                }
                case '3': {
                    System.out.print("Masukan jari-jari lingkaran: ");
                    r = scanner.nextInt();
                    System.out.println("Luas lingkaran: " + olingkaran.luas(r));
                    System.out.println("Keliling lingkaran: " + olingkaran.keliling(r));
                    break;
                }
                case '4': {
                    System.out.println("Anda telah meninggalkan aplikasi");
                    System.exit(0);
                }
                default: {
                    System.out.println("Tidak ada pilihan");
                }
            }
        }
    }

    private static void mainMenu() {
        //pilihan menu
        System.out.println();
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.println("4. Keluar");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
