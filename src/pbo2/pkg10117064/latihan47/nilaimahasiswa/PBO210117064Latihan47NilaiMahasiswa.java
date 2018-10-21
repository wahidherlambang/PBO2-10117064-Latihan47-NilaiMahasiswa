/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan47.nilaimahasiswa;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk 
 * menghitung nilai akhir mahasiswa dan indexnya dengan 
 * memasukkan nilai quiz,UTS,UAS.
 */
public class PBO210117064Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMhs nima = new NilaiMhs(75,80,75);
        
        System.out.println("QUIZ \t = "+nima.getQuiz());
        System.out.println("UTS \t = "+nima.getUts());
        System.out.println("UAS \t = "+nima.getUas());
        System.out.println("\nNilai Akhir = "+ nima.nilaiAkhir());
        System.out.println("\nIndex = "+ nima.indexNilai());
        System.out.println("Keterangan = "+ nima.ketereangan());
    }
}
