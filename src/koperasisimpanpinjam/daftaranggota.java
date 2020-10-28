package koperasisimpanpinjam;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class daftaranggota {

    public static void main(String[] args) {

        //VARIABEL
        int isi, ulang, pilih = 0, i = 0, m = 0, k = 0, cari = 0;

        int uangw = 0, uangs = 0, bunga, setor = 0, setor1;
        int total = 0;
        boolean flag = true, flug = true, fleg = true;
        String Y;

        //ARRAY
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("BANGUN");
        nama.add("IRFAN");
        nama.add("FITRI");
        nama.add("OBAY");
        nama.add("RIPUL");

        ArrayList<String> alamat = new ArrayList<String>();
        alamat.add("JNEPER");
        alamat.add("SUMBAWA");
        alamat.add("LOTIM");
        alamat.add("JONGGAT");
        alamat.add("REMBIGA");

        ArrayList<String> jk = new ArrayList<String>();
        jk.add("L");
        jk.add("L");
        jk.add("P");
        jk.add("L");
        jk.add("L");

        ArrayList<Integer> um = new ArrayList<Integer>();
        um.add(19);
        um.add(20);
        um.add(19);
        um.add(25);
        um.add(31);

        ArrayList<String> no = new ArrayList<String>();
        no.add("09899989");
        no.add("08290890");
        no.add("09908000");
        no.add("05459090");
        no.add("08777777");

        ArrayList<Integer> kodeanggota = new ArrayList<Integer>();
        kodeanggota.add(909);
        kodeanggota.add(905);
        kodeanggota.add(908);
        kodeanggota.add(900);
        kodeanggota.add(902);

        ArrayList<Integer> smpw = new ArrayList<Integer>();
        smpw.add(1000000);
        smpw.add(1000000);
        smpw.add(1000000);
        smpw.add(1000000);
        smpw.add(1000000);

        ArrayList<Integer> pinjaman = new ArrayList<Integer>();
        pinjaman.add(0);
        pinjaman.add(0);
        pinjaman.add(0);
        pinjaman.add(0);
        pinjaman.add(0);

        ArrayList<Integer> angsuran = new ArrayList<Integer>();
        angsuran.add(12);
        angsuran.add(12);
        angsuran.add(12);
        angsuran.add(12);
        angsuran.add(12);

        //PROSES
        JOptionPane.showMessageDialog(null,
                "\n \tSELAMAT DATANG DI SISTEM"
                + "\n "
                + "\n \tKOPERASI SIMPAN PINJAM"
                + "");
        do {

            //MENU/ tampilan awal
            pilih = Integer.valueOf(JOptionPane.showInputDialog(null, ""
                    + "\n TAMPILAN UTAMA"
                    + "\n"
                    + "\n 1  DAFTAR ANGGOTA"
                    + "\n 2  RUANG ANGGOTA "
                    + "\n 3  LAPORAN"
                    + "\n 4  EXIT "
                    + "\n"
                    + "\n >> PILIH"));
            switch (pilih) {
                case 1:
                    //RUANG DAFTAR ANGGOTA
                    do {
                        String info = ""
                                + "\nSELAMAT DATANG DI SISTEM"
                                + "\n  >> DAFTAR ANGGOTA <<";
                        JOptionPane.showMessageDialog(null, info);

                        //namaarray.add = untuk menambahkan isi array/ mmenyimpan ke dalam array
                        nama.add(JOptionPane.showInputDialog(null, "MASUKKAN NAMA  ANGGOTA"));

                        alamat.add(JOptionPane.showInputDialog(null, "MASUKKAN ALAMAT ANGGOTA"));

                        jk.add(JOptionPane.showInputDialog(null, "MASUKKAN JENIS KELAMIN ANGGOTA (L/P)"));

                        um.add(Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN UMUR ANGGOTA ")));

                        no.add(JOptionPane.showInputDialog(null, "MASUKKAN NO TELEPON ANGGOTA "));

                        kodeanggota.add(Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN KODE ANGGOTA")));

                        smpw.add(Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN SIMPANAN POKOK")));

                        pinjaman.add(0);
                        angsuran.add(0);

                        JOptionPane.showMessageDialog(null, "DATA ANGGOTA KOPERASI SIMPAN PINJAM UBG"
                                + "\n NAMA           : " + nama
                                + "\n ALAMAT         : " + alamat
                                + "\n JENIS KELALMIN : " + jk
                                + "\n UMUR           : " + um
                                + "\n NO TELEPON     : " + no
                                + "\n KODE ANGGOTA   : " + kodeanggota);

                        Y = JOptionPane.showInputDialog(null, ""
                                + "\n APAKAH ADA YANG AKAN "
                                + "\n DAFTAR ANGGOTA LAGI ?"
                                + "\n"
                                + "\n >>(Y/T)");

                    } while (Y.equalsIgnoreCase("y"));

                    break;
                case 2://RUANG ANGGOTA(APABILA SUDDAH TERDAFTAR DI SISTEM/MEJADI ANGGOTA KOPAERASI)

                    do {
                        pilih = Integer.valueOf(JOptionPane.showInputDialog(null, ""
                                + "\n PILIH PROGRAM"
                                + "\n"
                                + "\n 1  SIMPANAN/MENYIMPAN"
                                + "\n 2  PINJAMAN/MEMINJAM"
                                + "\n 3  SETORAN"
                                + "\n 4  PENGECEKAN ANGGOTA"
                                + "\n 5  INFORMASI ANGGOTA"
                                + "\n 6  EXIT"
                                + "\n"
                                + "\n >>pilih"));

                        switch (pilih) {
                            case 1: //RUANG SIMPANAN(TEMPAT PEMROSESAN SIMPANAN ANGGOTA)
                                JOptionPane.showMessageDialog(null, ""
                                        + "\nANDA BERADA DI SYSTEM"
                                        + "\n   >> SIMPANAN <<");
                                i = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN KODE ANGGOTA ANDA"));
                                uangw = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN NOMINAL UANG"));
                                total = smpw.get(kodeanggota.indexOf(i)) + uangw;
                                smpw.set(kodeanggota.indexOf(i), total);
                                JOptionPane.showMessageDialog(null,
                                        //namaarray.get = untuk mengambil isi dari array untuk di tampilkan
                                        //namaarray.indexOf(i) = untuk mengetahui isi array itu berada di index ke berapa
                                        "\n NAMA :" + nama.get(kodeanggota.indexOf(i))
                                        + "\n JUMLAH SIMPANAN ANDA"
                                        + "\nRP :" + smpw.get(kodeanggota.indexOf(i)));

                                break;//BATAS RUANG SIMPANAN
                            case 2: //RUANG PINJAMAN(TEMPAT PEMROSESAN PINJAMAN ANGGOTA)
                                JOptionPane.showMessageDialog(null, ""
                                        + "\nANDA BERADA DI SYSTEM"
                                        + "\n   >> PINJAMAN <<");
                                i = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN KODE ANGGOTA ANDA"));

                                uangw = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN NOMINAL PINJAMAN"));
                                do {
                                    pilih = Integer.valueOf(JOptionPane.showInputDialog(null, ""
                                            + "\n PILIH LAMA ANGSURAN"
                                            + "\n"
                                            + "\n 1  1 TAHUN/12 BULAN"
                                            + "\n 2  1/2 TAHUN/6 BULAN"
                                            + "\n"
                                            + "\n >>pilih"));
                                    switch (pilih) {
                                        case 1:
                                            angsuran.add(angsuran.get(kodeanggota.indexOf(i)));
                                            fleg = false;
                                            break;
                                        case 2:
                                            angsuran.add(angsuran.get(kodeanggota.indexOf(i)));
                                            fleg = false;
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, ">> >INTRUKSI SALAH");
                                            break;
                                    }
                                } while (fleg == true);
                                total = pinjaman.get(kodeanggota.indexOf(i)) + uangw;
                                pinjaman.set(kodeanggota.indexOf(i), total);
                                JOptionPane.showMessageDialog(null,
                                        //namaarray.get = untuk mengambil isi dari array untuk di tampilkan
                                        //namaarray.indexOf(i) = untuk mengetahui isi array itu berada di index ke berapa
                                        "\n NAMA :" + nama.get(kodeanggota.indexOf(i))
                                        + "\n JUMLAH PINJAMAN ANDA"
                                        + "\nRP :" + pinjaman.get(kodeanggota.indexOf(i))
                                        + "\n BUNGA 5%"
                                        + "\n LAMA ANGSURAN :" + angsuran.get(kodeanggota.indexOf(i)) + " BULAN");

                                break; //BATAS RUANG PINJAMAN
                            case 3:  //RUANG SETORAN(TEMPAT PEMROSESAN SETORAN ANGGOTA)
                                JOptionPane.showMessageDialog(null, ""
                                        + "\nANDA BERADA DI SYSTEM"
                                        + "\n   >> SETORAN <<");
                                i = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN KODE ANGGOTA ANDA"));
                                m = Integer.valueOf(JOptionPane.showInputDialog(null, "SETORAN BULAN Ke"
                                        + "\n >>"));
                                k = angsuran.get(kodeanggota.indexOf(i)) - m;
                                angsuran.set(kodeanggota.indexOf(i), k);
                                bunga = (pinjaman.get(kodeanggota.indexOf(i)) * 5) / 100;
                                total = pinjaman.get(kodeanggota.indexOf(i)) + bunga;
                                setor = Integer.valueOf(JOptionPane.showInputDialog(null,
                                        "\n NAMA :" + nama.get(kodeanggota.indexOf(i))
                                        + "\n PINJAMAN :Rp" + pinjaman.get(kodeanggota.indexOf(i))
                                        + "\n BUNGA 5%:Rp" + bunga
                                        + "\n TOTAL SETOR :Rp" + total));
                                setor1 = pinjaman.get(kodeanggota.indexOf(i)) - setor;
                                //namaarray.set(i,j) = untuk menyalin isi array dengan yang baru
                                //(i=isi array yang lama)dan (j=isi array yang baru)
                                pinjaman.set(kodeanggota.indexOf(i), setor1);

                                if (setor1 == pinjaman.get(kodeanggota.indexOf(i))) {
                                    JOptionPane.showMessageDialog(null, "======TERIMA KASIH======");
                                }

                                break;//BATAS RUANG SETORAN
                            case 4: //RUANG PENGECEKAN ANGGOTA
                                JOptionPane.showMessageDialog(null, ""
                                        + "\n  ANDA BERADA DI SYSTEM"
                                        + "\n>> PENGECEKAN ANGGOTA <<");
                                i = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN KODE ANGGOTA ANDA"));
                                JOptionPane.showMessageDialog(null, "=====INFORMASI ANGGOTA====="
                                        + "\n NAMA         : " + "\t" + nama.get(kodeanggota.indexOf(i))
                                        + "\n ALAMAT       : " + "\t" + alamat.get(kodeanggota.indexOf(i))
                                        + "\n JENIS KELAMIN: " + "\t" + jk.get(kodeanggota.indexOf(i))
                                        + "\n UMUR         : " + "\t" + um.get(kodeanggota.indexOf(i))
                                        + "\n NO TELEPON   : " + "\t" + no.get(kodeanggota.indexOf(i))
                                        + "\n SIMPANAN     : " + "\t" + smpw.get(kodeanggota.indexOf(i))
                                        + "\n PINJAMAN     : " + "\t" + pinjaman.get(kodeanggota.indexOf(i))
                                );
                                break;//BATAS RUANG PENGECEKAN ANGGOTA
                            case 5: //RUANG INFO ANGGOTA
                                JOptionPane.showMessageDialog(null, ""
                                        + "\n ANDA BERADA DI SYSTEM"
                                        + "\n >> INFO ANGGOTA <<");
                                System.out.println(""
                                        + "\n INFO ANGGOTA");
                                System.out.println("NAMA\tALAMAT\tJENIS KELAMIN\tUMUR\tNO TELEPON\tKODE ANGGOTA");
                                System.out.println(" ");
                                for (int j = 0; j < nama.size(); j++) {
                                    System.out.println(nama.get(j) + "\t" + alamat.get(j) + "\t" + jk.get(j) + "\t" + um.get(j) + "\t" + no.get(j) + "\t" + kodeanggota.get(j));
                                }
                                break;//BATAS RUANG INFO ANGGOTA

                            case 6://EXIT/KELUAR
                                JOptionPane.showMessageDialog(null, ">> >ANDA AKAN KELUAR DARI RUANG ANGGOTA");
                                flug = false;
                                break;//BATAS EXIT/KELUAR
                            default://JIKA INTRUKSI YANG DI MASUKKAN SALAH
                                JOptionPane.showMessageDialog(null, ">> >SALAH INTRUKSI");
                                break;//BATAS RUANG INTRUKSI

                        }

                    } while (flug == true);
                    break;//BATAS RUANG ANGGOTA

                case 3: //RUANG SLIP SIMPANAN DAN PINJAMAN(LAPORAN SIMAPANAN DAN PINJAMAN SEMUA ANGGOTA)
                    JOptionPane.showMessageDialog(null, ""
                            + "\n      ANDA BERADA DI RUANG"
                            + "\n >> INFO SIMPANAN DAN PINJAMAN <<");
                    System.out.println(""
                            + "\n LAPORAN SIMPANAN DAN PINJAMAN");
                    System.out.println("NAMA\t\tSIMPANAN\t\tPINJAMAN");
                    for (int j = 0; j < nama.size(); j++) {
                        System.out.println(nama.get(j) + "\t\t" + "Rp." + smpw.get(j) + "\t\t" + "Rp." + pinjaman.get(j));
                    }
                    break;//BATAS RUANG SLIP

                case 4://RUANG EXIT PADA TAMPILAN UTAMA

                    JOptionPane.showMessageDialog(null, ">> >TERIMA KASIH");
                    System.exit(0);

                    break;//BATAS RUANG EXIT 

                default://JIKA INTRUKSI SALAH DI TAMPILAH UTAMA
                    JOptionPane.showMessageDialog(null, ">> >SALAH INTRUKSI");

                    break;//BATS INTRUKSI SALAH
            }
//            ulang = JOptionPane.showConfirmDialog(null,
//                    "APAKAH ADA TRANSAKSI LAGI ?",
//                    "KONFIRMASI",
//                    JOptionPane.YES_NO_OPTION);
//
//            if (ulang != JOptionPane.OK_OPTION) {
//                flag = false;
//            }

        } while (flag == true);

    }

}
