/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasisimpanpinjam;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class KOPERASISIMPANPINJAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String Y;
        int pilih = 0;
        int isi = 0;

        //TAMPILAN UTAMA 
        JOptionPane.showMessageDialog(null, "SELAMAT DATNG DI SISTEM KOPERASI SIMPAN PINJAM");

        //BAGIAN ARRAY
        isi = Integer.valueOf(JOptionPane.showInputDialog(null, "BANYAK YANG AKAN MENJADI ANGGOTA KOPERASI"));
        String[] nama = new String[isi];
        String[] alamat = new String[isi];
        String[] umur = new String[isi];
        String[] tglh = new String[isi];
        String[] no = new String[isi];
        int[] kode = new int[isi];

        //PROSES
        pilih = Integer.valueOf(JOptionPane.showInputDialog(null, "TAMPILAN UTAMA"
                + "\n 1.DAFTAR ANGGOTA"
                + "\n 2.RUANG ANGGOTA "));

        switch (pilih) {
            case 1:

                for (int i = 0; i < isi; i++) {
                    nama[i] = JOptionPane.showInputDialog(null, "MASUKKAN NAMA ANGGOTA");
                    alamat[i] = JOptionPane.showInputDialog(null, "MASUKKAN ALAMAT ANGGOTA");
                    umur[i] = JOptionPane.showInputDialog(null, "MASUKKAN UMUR ANGGOTA");
                    tglh[i] = JOptionPane.showInputDialog(null, "MASUKKAN TANGGAL LAHIR ANGGOTA");
                    no[i] = JOptionPane.showInputDialog(null, "MASUKKAN NNO TELEPON/HP ANGGOTA");
                    kode[i] = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN KODE ANGGOTA"));

                }

                System.out.println("||\tnama\t\t\t||ALAMAT\t\t\t||UMUR\t\t||TANGGAL LAHIR\t\t\t||NO TELEPOM/HP\t\t\t||KODE ANGGOTA\t\t||");
                System.out.println("========================================================================================");
                for (int i = 0; i < isi; i++) {
                    System.out.println("||\t" + nama[i] + "\t\t\t||" + alamat[i] + "\t\t\t||" + umur[i] + "\t||" + tglh[i] + "\t\t\t||" + no[i] + "\t\t\t||" + kode[i] + "\t\t||");
                }
                break;

        }

    }

}
