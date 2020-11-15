
package pbo10119012latihan47;

import java.util.Scanner;

/**
 *  NAMA   : DAMAI SAPUTRA LAOLI
 *  KELAS  : IF-1
 *  NIM    : 1019012
 */
public class PBO10119012Latihan47 {

    
    public static void main(String[] args) {
       double quiz, uts, uas, nilai_akhir;
        String indeks, keterangan;
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mhs1 = new Mahasiswa();
        System.out.print("QUIZ\t\t\t= ");
        mhs1.setNilaiQuiz(scanner.nextDouble());
        System.out.print("UTS\t\t\t\t= ");
        mhs1.setNilaiUTS(scanner.nextDouble());
        System.out.print("UAS\t\t\t\t= ");
        mhs1.setNilaiUAS(scanner.nextDouble());

        quiz = mhs1.getNilaiQuiz();
        uts = mhs1.getNilaiUTS();
        uas = mhs1.getNilaiUAS();
        nilai_akhir = mhs1.nilaiAkhir(quiz,uts,uas);
        indeks = mhs1.indexNilai(nilai_akhir);

        System.out.println("\nNilai Akhir\t\t= "+ nilai_akhir);
        System.out.println("\nIndex = "+ indeks);
        System.out.println("Keterangan = "+ mhs1.keteraganNilai(indeks));
    }
}
