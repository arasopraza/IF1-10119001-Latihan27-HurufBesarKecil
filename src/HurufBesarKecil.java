import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini menampilkan formatting
 * kalimat yang diinputkan user menjadi huruf besar dan kecil
 *
 */

public class HurufBesarKecil {
        public static void main(String[] args){
            String kalimat;
            Scanner scanner;

            System.out.print("Masukkan Kalimat: ");
            scanner = new Scanner(System.in);
            kalimat = scanner.nextLine();

            System.out.print("\n");
            System.out.println("====Hasil Formatting====");
            System.out.println("Huruf Besar : " + kalimat.toUpperCase());
            System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
        }
}
