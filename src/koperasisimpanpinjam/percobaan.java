package koperasisimpanpinjam;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class percobaan {

    public static void main(String[] args) {

        //VARIABEL
        int isi, ulang, pilih = 0, i = 0, m = 0, k = 0;
        String cari;

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

        ArrayList<String> kodeanggota = new ArrayList<String>();
        kodeanggota.add("909");
        kodeanggota.add("905");
        kodeanggota.add("908");
        kodeanggota.add("900");
        kodeanggota.add("902");

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
        angsuran.add(0);
        angsuran.add(0);
        angsuran.add(0);
        angsuran.add(0);
        angsuran.add(0);

        //PROSES
        JOptionPane
                .showMessageDialog(null,
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

                        boolean ketemu = false;
                        boolean cari11 = true;
                        String keyword;
                        do {
                            keyword = JOptionPane.showInputDialog(null, "MASUKKAN KODE ANGGOTA");
                            ketemu = false;
                            for (int j = 0; j < kodeanggota.size(); j++) {
                                if (keyword.equals(kodeanggota.get(j))) {
                                    ketemu = true;
                                }
                            }

                            if (ketemu) {
                                JOptionPane.showMessageDialog(null, "KODE SUDAH ADA , MASUKKAN ANGKA YG BERBEDA");
                            } else {
                                JOptionPane.showMessageDialog(null, "SUKSES");

                                kodeanggota.add(keyword);
                                cari11 = false;

                            }
                        } while (cari11 == true);

                        smpw.add(Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN SIMPANAN POKOK")));

                        pinjaman.add(0);

                        angsuran.add(0);

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
                                cari = JOptionPane.showInputDialog(null, "MASUKKAN KODE ANGGOTA ANDA");
                                boolean cari1 = false;
                                for (int j = 0; j < kodeanggota.size(); j++) {
                                    if (cari.equals(kodeanggota.get(j))) {
                                        cari1 = true;
                                    }
                                }
                                if (cari1) {
                                    uangw = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN NOMINAL UANG"));
                                    total = smpw.get(kodeanggota.indexOf(cari)) + uangw;
                                    smpw.set(kodeanggota.indexOf(cari), total);
                                    JOptionPane.showMessageDialog(null,
                                            //namaarray.get = untuk mengambil isi dari array untuk di tampilkan
                                            //namaarray.indexOf(i) = untuk mengetahui isi array itu berada di index ke berapa
                                            "\n NAMA :" + nama.get(kodeanggota.indexOf(cari))
                                            + "\n JUMLAH SIMPANAN ANDA"
                                            + "\nRP :" + smpw.get(kodeanggota.indexOf(cari)));
                                } else {
                                    JOptionPane.showMessageDialog(null, "DATA TIDAK DI TEMUKAN");
                                }

                                break;//BATAS RUANG SIMPANAN
                            case 2: //RUANG PINJAMAN(TEMPAT PEMROSESAN PINJAMAN ANGGOTA)
                                JOptionPane.showMessageDialog(null, ""
                                        + "\nANDA BERADA DI SYSTEM"
                                        + "\n   >> PINJAMAN <<");
                                cari = JOptionPane.showInputDialog(null, "MASUKKAN KODE ANGGOTA ANDA");
                                boolean cari2 = false;
                                for (int j = 0; j < kodeanggota.size(); j++) {
                                    if (cari.equals(kodeanggota.get(j))) {
                                        cari2 = true;
                                    }
                                }
                                if (cari2) {
                                    uangw = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN NOMINAL PINJAMAN"));
                                    m = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN LAMA ANGSURAN(DALAM HITUNGAN BULA)"));
                                    angsuran.set(kodeanggota.indexOf(cari), m);
                                    bunga = (uangw * 5) / 100;
                                    total = uangw + bunga;
                                    pinjaman.set(kodeanggota.indexOf(cari), total);

                                    JOptionPane.showMessageDialog(null,
                                            "TRANSKSI SIMPANAN BERHASIL"
                                            + "\n ANDA MEMINJAM SEBANYAK :Rp." + uangw
                                            + "\n BUNGA SEBESAR 5%       :Rp." + bunga
                                            + "\n TOTAL PINJAMAN         :Rp." + pinjaman.get(kodeanggota.indexOf(cari))
                                            + "\n MENGANGSUR SELAMA      : " + angsuran.get(kodeanggota.indexOf(cari)) + " BULAN"
                                    );

                                } else {
                                    JOptionPane.showMessageDialog(null, "DATA TIDAK DI TEMUKAN");
                                }

                                break; //BATAS RUANG PINJAMAN
                            case 3:  //RUANG SETORAN(TEMPAT PEMROSESAN SETORAN ANGGOTA)
                                JOptionPane.showMessageDialog(null, ""
                                        + "\nANDA BERADA DI SYSTEM"
                                        + "\n   >> SETORAN <<");
                                cari = JOptionPane.showInputDialog(null, "MASUKKAN KODE ANGGOTA ANDA");
                                boolean cari3 = false;
                                for (int j = 0; j < kodeanggota.size(); j++) {
                                    if (cari.equals(kodeanggota.get(j))) {
                                        cari3 = true;
                                    }
                                }
                                if (cari3) {
                                    if (pinjaman.get(kodeanggota.indexOf(cari)) != 0) {
                                        k = Integer.valueOf(JOptionPane.showInputDialog(null,
                                                ">> > SETORAN"
                                                + "\n PINJAMAN ANDA          :Rp." + pinjaman.get(kodeanggota.indexOf(cari))
                                                + "\n MENGANGSUR SELAMA      : " + angsuran.get(kodeanggota.indexOf(cari)) + " BULAN"
                                                + "\n MASUKKAN UANG >> >"
                                        ));

                                        if (pinjaman.get(kodeanggota.indexOf(cari)) >= k) {
                                            pinjaman.set(kodeanggota.indexOf(cari), (pinjaman.get(kodeanggota.indexOf(cari)) - k));
                                            if (pinjaman.get(kodeanggota.indexOf(cari)) == 0) {
                                                JOptionPane.showMessageDialog(null, "TRANSAKSI SUKSES DAN PINJAMAN LUNAS");
                                                angsuran.set(kodeanggota.indexOf(cari), 0);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "TRANSAKSI SUKSES"
                                                        + "\n SISA PINJAMAN :Rp." + pinjaman.get(kodeanggota.indexOf(cari)));
                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(null, "MASUKKAN NOMINAL YANG BENAR");

                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "BELUM ADA PINJAMAN");

                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "DATA TIDAK DI TEMUKAN !!!");

                                }

                                break;//BATAS RUANG SETORAN
                            case 4: //RUANG PENGECEKAN ANGGOTA
                                JOptionPane.showMessageDialog(null, ""
                                        + "\n  ANDA BERADA DI SYSTEM"
                                        + "\n>> PENGECEKAN ANGGOTA <<");
                                cari = JOptionPane.showInputDialog(null, "MASUKKAN KODE ANGGOTA ANDA");
                                boolean cari4 = false;
                                for (int j = 0; j < kodeanggota.size(); j++) {
                                    if (cari.equals(kodeanggota.get(j))) {
                                        cari4 = true;
                                    }
                                }
                                if (cari4) {
                                    JOptionPane.showMessageDialog(null, "=====INFORMASI ANGGOTA====="
                                            + "\n NAMA         : " + "\t" + nama.get(kodeanggota.indexOf(cari))
                                            + "\n ALAMAT       : " + "\t" + alamat.get(kodeanggota.indexOf(cari))
                                            + "\n JENIS KELAMIN: " + "\t" + jk.get(kodeanggota.indexOf(cari))
                                            + "\n UMUR         : " + "\t" + um.get(kodeanggota.indexOf(cari))
                                            + "\n NO TELEPON   : " + "\t" + no.get(kodeanggota.indexOf(cari))
                                            + "\n SIMPANAN     : " + "\t" + smpw.get(kodeanggota.indexOf(cari))
                                            + "\n PINJAMAN     : " + "\t" + pinjaman.get(kodeanggota.indexOf(cari))
                                    );

                                } else {
                                    JOptionPane.showMessageDialog(null, "DATA TIDAK DI TEMUKAN");
                                }

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
                    System.out.println("NAMA\t\tSIMPANAN\t\tPINJAMAN\t\tLA");
                    for (int j = 0; j < nama.size(); j++) {
                        System.out.println(nama.get(j) + "\t\t" + "Rp." + smpw.get(j) + "\t\t" + "Rp." + pinjaman.get(j) + "\t\t" + angsuran.get(j) + " BULAN");
                    }
                    break;//BATAS RUANG SLIP

                case 4://RUANG EXIT PADA TAMPILAN UTAMA

                    JOptionPane.showMessageDialog(null, ">> >TERIMA KASIH");
                    System.exit(0);

                    break;//BATAS RUANG EXIT 

                default://JIKA INTRUKSI SALAH DI TAMPILAN UTAMA
                    JOptionPane.showMessageDialog(null, ">> >SALAH INTRUKSI");

                    break;//BATAS INTRUKSI SALAH
            }
        } while (flag == true);

    }

}
