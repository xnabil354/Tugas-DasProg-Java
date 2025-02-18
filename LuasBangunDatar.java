import java.util.Scanner;

public class LuasBangunDatar {
    public static void main(String[] args) throws InterruptedException {

        int input;
        while (true) {
            System.out.println("Wait...");
            Thread.sleep(10000);
            Scanner inputBangunDatar = new Scanner(System.in);
            System.out.println("\nProgram Luas Bangun Datar\n\nPilih Bangun Datar : \n1.Persegi\n2.Persegi Panjang\n3.Jajar Genjang\n4.Segitiga\n5.Belah Ketupat\n6.Layang-Layang\n7.Trapesium\n8.Lingkaran\n\nPilih Hanya Angka Saja 1 - 8 : ");
            input = inputBangunDatar.nextInt();
            if (input == 1) {
                // Persegi
                int hasilPersegi, sisi1, sisi2;
                System.out.println("Luas Persegi");
                Scanner ValuePersegi = new Scanner(System.in);
                System.out.println("Input Sisi Pertama : ");
                sisi1 = ValuePersegi.nextInt();
                System.out.println("Input Sisi Kedua : ");
                sisi2 = ValuePersegi.nextInt();

                hasilPersegi = (sisi1 * sisi2);
                System.out.println("Hasil Luas Persegi : " + hasilPersegi);

            } else if (input == 2) {
                // Persegi Panjang
                int hasilPersegiPanjang, PanjangPp, LebarPp;
                System.out.println("Luas Persegi Panjang");
                Scanner ValuePersegiPanjang = new Scanner(System.in);
                System.out.println("Input Panjang : ");
                PanjangPp = ValuePersegiPanjang.nextInt();
                System.out.println("Input Lebar : ");
                LebarPp = ValuePersegiPanjang.nextInt();

                hasilPersegiPanjang = (PanjangPp * LebarPp);
                System.out.println("Hasil Luas Persegi Panjang : " + hasilPersegiPanjang);
            } else if (input == 3) {
                // Jajar Genjang
                int hasilJajarGenjang, alasJg, tinggiJg;
                System.out.println("Luas Jajar Genjang");
                Scanner ValueJajarGenjang = new Scanner(System.in);
                System.out.println("Input Alas : ");
                alasJg = ValueJajarGenjang.nextInt();
                System.out.println("Input Tinggi : ");
                tinggiJg = ValueJajarGenjang.nextInt();

                hasilJajarGenjang = (alasJg * tinggiJg);
                System.out.println("Hasil Luas Jajar Genjang : " + hasilJajarGenjang);
            } else if (input == 4) {
                // Segitiga
                int hasilSegitiga, alasSg, tinggiSg;
                System.out.println("Luas Segitiga");
                Scanner ValueSegitiga = new Scanner(System.in);
                System.out.println("Input Alas : ");
                alasSg = ValueSegitiga.nextInt();
                System.out.println("Input Tinggi : ");
                tinggiSg = ValueSegitiga.nextInt();

                hasilSegitiga = (alasSg * tinggiSg / 2);
                System.out.println("Hasil Luas Segitiga : " + hasilSegitiga);
            } else if (input == 5) {
                // Belah Ketupat
                int hasilBelahKetupat, diameterBk1, diameterBk2;
                System.out.println("Luas Belah Ketupat");
                Scanner ValueBelahKetupat = new Scanner(System.in);
                System.out.println("Input Diameter 1 : ");
                diameterBk1 = ValueBelahKetupat.nextInt();
                System.out.println("Input Diameter 2 : ");
                diameterBk2 = ValueBelahKetupat.nextInt();

                hasilBelahKetupat = (diameterBk1 * diameterBk2 / 2);
                System.out.println("Hasil Luas Belah Ketupat : " + hasilBelahKetupat);
            } else if (input == 6) {
                // Layang-Layang
                int hasilLayangLayang, diameterLy1, diameterLy2;
                System.out.println("Luas Layang-Layang");
                Scanner ValueLayangLayang = new Scanner(System.in);
                System.out.println("Input Diameter 1 : ");
                diameterLy1 = ValueLayangLayang.nextInt();
                System.out.println("Input Diameter 2 : ");
                diameterLy2 = ValueLayangLayang.nextInt();

                hasilLayangLayang = (diameterLy1 * diameterLy2 / 2);
                System.out.println("Hasil Luas Layang-Layang : " + hasilLayangLayang);
            } else if (input == 7) {
                // Trapesium
                int hasilTrapesium, sisiA, sisiB, tinggiTp;
                System.out.println("Luas Trapesium");
                Scanner ValueTrapesium = new Scanner(System.in);
                System.out.println("Input Sisi A : ");
                sisiA = ValueTrapesium.nextInt();
                System.out.println("Input Sisi B : ");
                sisiB = ValueTrapesium.nextInt();
                System.out.println("Input Tinggi : ");
                tinggiTp = ValueTrapesium.nextInt();

                hasilTrapesium = (sisiA + sisiB / 2 * tinggiTp);
                System.out.println("Hasil Luas Trapesium : " + hasilTrapesium);
            } else if (input == 8) {
                // Lingkaran
                double hasilLingkaran;
                int jariJari;
                float phi = 3.14f;
                System.out.println("Luas Lingkaran");
                Scanner ValueLingkaran = new Scanner(System.in);
                System.out.println("Input Jari-Jari : ");
                jariJari = ValueLingkaran.nextInt();

                hasilLingkaran = (double) (phi * jariJari * jariJari);
                System.out.println("Hasil Luas Lingkaran : " + hasilLingkaran);
            } else {
                System.out.println("Inputan Salah");
                System.exit(0);
            }
        }
    }
}
