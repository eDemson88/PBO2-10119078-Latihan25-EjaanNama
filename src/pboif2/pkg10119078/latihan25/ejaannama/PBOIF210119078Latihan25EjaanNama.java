/*
 *
 * @author
 * NAMA     :   Adam Firdaus D
 * KELAS    :   IF2
 * NIM      :   10119078
 * DESKRIPSI:   Berisi codingan untuk menampilkan ejaan nama
 *
 */
package pboif2.pkg10119078.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int panjang;
        
        Scanner scanner = new Scanner(System.in); 
        System.out.printf("Masukan nama anda untuk dieja: ");
        nama = scanner.next();
        panjang = nama.length();
        
        System.out.println("");
        System.out.println("ejaan untuk " + nama + " adalah : " );
        
        for (int i = 0; i < panjang; i++){
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i) );
        }
        
    }
    
}
