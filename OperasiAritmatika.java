import java.util.Scanner;
public class OperasiAritmatika {
    public static void main(String[] args) {
        Scanner nilai1 = new Scanner(System.in);
        System.out.print("masukkan nilai 1 : ");
        int Nilai1 = nilai1.nextInt();
        Scanner nilai2 = new Scanner(System.in);
        System.out.print("masukkan nilai 2 : ");
        int Nilai2 = nilai2.nextInt();

        double tambah = Nilai1 + Nilai2;
        double kurang = Nilai1 - Nilai2;
        double kali = Nilai1 * Nilai2;
        double bagi = (double) Nilai1 / Nilai2;
        double persen = Nilai1 % Nilai2;
        System.out.println("~~~~~~~~~~~~~~");
        System.out.println("Hasil dari sistem aritmatika Tambah = " + tambah);
        System.out.println("Hasil dari sistem aritmatika Kurang = " + kurang);
        System.out.println("Hasil dari sistem aritmatika Kali = " + kali);
        System.out.println("Hasil dari sistem aritmatika Pembagian = " + bagi);
        System.out.println("Hasil dari sistem aritmatika Persen = " + persen);
        System.out.println("~~~~~~~~~~~~~~");
        System.out.print("Hasil dari sistem relasional Sama dengan : ");
        System.out.println(Nilai1 == Nilai2);
        System.out.print("Hasil dari sistem relasional TIdak Sama dengan : ");
        System.out.println(Nilai1 != Nilai2);
        System.out.print("Hasil dari sistem relasional Lebih besar dari : ");
        System.out.println(Nilai1 > Nilai2);
        System.out.print("Hasil dari sistem relasional Kurang dari : ");
        System.out.println(Nilai1 < Nilai2);
        System.out.print("Hasil dari sistem relasional Kurang dari sama dengan : ");
        System.out.println(Nilai1 <= Nilai2);
        System.out.print("Hasil dari sistem relasional Lebih besar dari sama dengan : ");
        System.out.println(Nilai1 >= Nilai2);
        System.out.println("~~~~~~~~~~~~~~");
    }
}
