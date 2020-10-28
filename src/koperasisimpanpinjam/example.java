/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasisimpanpinjam;

import java.util.Scanner;

/**
 *
 * @author RivL
 */
public class example {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil;
        boolean flag = true, ulang = true;
        String[][] transaksi = new String[10][5];
        //id trx, tanggal, mekanik, pemilik, plat, area

        String[][] mekanik = new String[10][5];
        //id mekanik, nama, alamat, kontak, status
        mekanik[0][0] = "M001";
        mekanik[0][1] = "Supri";
        mekanik[0][2] = "Labuapi";
        mekanik[0][3] = "+6281907772901";
        mekanik[0][4] = "Pasif";
        //id mekanik, nama, alamat, kontak, status
        mekanik[1][0] = "M002";
        mekanik[1][1] = "Jauhari";
        mekanik[1][2] = "Narmada";
        mekanik[1][3] = "+6285321988572";
        mekanik[1][4] = "Pasif";

        String[][] area = new String[3][2];
        //kode area, mekanik
        area[0][0] = "Area A";
        area[0][1] = "-";
        //kode area, mekanik
        area[1][0] = "Area B";
        area[1][1] = "-";
        //kode area, mekanik
        area[2][0] = "Area C";
        area[2][1] = "-";

        do {
            System.out.println("Menu");
            System.out.println("1. Data Mekanik");
            System.out.println("2. Data Area");
            System.out.println("3. Data Transaksi");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    do {
                        //Tampilkan data Mekanik
                        System.out.println("Data Mekanik");
                        System.out.println("\nKode\tNama\tAlamat\tKontak Person\tStatus");
                        for (int i = 0; i < mekanik.length; i++) {
                            if (mekanik[i][0] != null) {
                                for (int j = 0; j < mekanik[0].length; j++) {
                                    System.out.print(mekanik[i][j] + "\t");
                                }
                                System.out.println("");
                            }
                        }

                        //Pilihan
                        System.out.println("\nPilihan:");
                        System.out.println("1. Tambah Data");
                        System.out.println("2. Ubah Status");
                        System.out.println("3. Keluar");
                        pil = input.nextInt();

                        switch (pil) {
                            case 1:
                                do {
                                    //Tambah Data
                                    String nama, alamat, kontak;
                                    int counterData = 0;
                                    //proses cek maks data
                                    for (int i = 0; i < mekanik.length; i++) {
                                        if (mekanik[i][0] != null) {
                                            counterData++;
                                        }
                                    }

                                    if ((counterData + 1) != mekanik.length) {
                                        System.out.print("Masukan Nama Mekanik : ");
                                        nama = input.next();
                                        System.out.print("Alamat : ");
                                        alamat = input.next();
                                        System.out.print("Kontak : ");
                                        kontak = input.next();

                                        mekanik[counterData][0] = "M00" + (counterData + 1);
                                        mekanik[counterData][1] = nama;
                                        mekanik[counterData][2] = alamat;
                                        mekanik[counterData][3] = kontak;
                                        mekanik[counterData][4] = "Pasif";

                                        System.out.println("Berhasil disimpan!");
                                        break;
                                    } else {
                                        System.out.println("Data Sudah Penuh!");
                                    }
                                } while (flag);

                            case 2:

                                //Edit data
                                String keyId,
                                 status;
                                int id = 0;
                                boolean cari = false;

                                System.out.print("Masukan ID Mekanik : ");
                                keyId = input.next();

                                //cari id
                                for (int i = 0; i < mekanik.length; i++) {
                                    if (mekanik[i][0] != null) {
                                        if (keyId.equals(mekanik[i][0])) {
                                            cari = true;
                                            id = i;
                                        }
                                    }
                                }
                                if (cari) {
                                    status = mekanik[id][4];
                                    if (status.equals("Pasif")) {
                                        mekanik[id][4] = "Aktif";
                                    } else {
                                        mekanik[id][4] = "Pasif";
                                    }
                                } else {
                                    System.out.println("Data tidak ditemukan");
                                }
                                break;
                            case 3:
                                break;
                        }
                    } while (ulang);
                    break;
                case 2:
                    do {

                        int idArea, idMekanik;
                        //Area
                        //Tampilkan data Mekanik
                        System.out.println("Data Area");
                        System.out.println("\nArea\tMekanik");
                        for (int i = 0; i < area.length; i++) {
                            if (area[i][0] != null) {
                                for (int j = 0; j < area[0].length; j++) {
                                    System.out.print(area[i][j] + "\t");
                                }
                                System.out.println("");
                            }
                        }

                        //Pilihan
                        System.out.println("\nPilihan:");
                        System.out.println("1. Masukan Mekanik");
                        System.out.println("2. Kembali");
                        pil = input.nextInt();

                        switch (pil) {
                            case 1:
                                System.out.println("Pilih Area yang ingin diubah!");
                                for (int i = 0; i < area.length; i++) {
                                    if (area[i][0] != null) {
                                        System.out.println(i + ". " + area[i][0]);
                                    }
                                }
                                System.out.print("(Masukan Nomor Index!) : ");
                                idArea = input.nextInt();

                                System.out.println("Pilih Mekanik yang akan menempati!");
                                for (int i = 0; i < mekanik.length; i++) {
                                    if (mekanik[i][0] != null) {
                                        System.out.println(i + ". " + mekanik[i][1]);
                                    }
                                }
                                System.out.print("(Masukan Nomor Index!) : ");
                                idMekanik = input.nextInt();

                                area[idArea][1] = mekanik[idMekanik][1];

                                System.out.println("Data Berhasil di Simpan");
                                break;
                            case 2:
                                break;
                        }
                    } while (ulang);
                    break;
                case 3:
                    break;
            }
        } while (ulang);
    }
}
